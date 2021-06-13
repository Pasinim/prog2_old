# Palinsesto radiofonico

## Descrizione

Scopo della prova è progettare e implementare una gerarchia di oggetti utili a
gestire il *palinsesto giornaliero* delle *trasmissioni* radiofoniche del
pianeta *Betazed*.

Per portare a termine il lavoro dovrà decidere quali classi (concrete o
astratte) e quali interfacce implementare. Per ciascuna di esse **dovrà
descrivere** (preferibilmente in formato Javadoc, ma comunque solo attraverso
commenti presenti nel codice) le scelte relative alla **rappresentazione** dello
stato (con particolare riferimento all'*invariante di rappresentazione* e alla
*funzione di astrazione*) e ai **metodi** (con particolare riferimento a
*pre/post-condizioni* ed *effetti collaterali*, soffermandosi a illustrare le
ragioni della *correttezza* solo per le implementazioni che riterrà più
critiche). Osservi che l'esito di questa prova, che le consentirà di accedere o
meno all'orale, si baserà tanto su questa documentazione quanto sul codice
sorgente.

Presti particolare attenzione agli *errori di compilazione*: il contenuto dei
file che il compilatore si rifiuta di compilare *non sarà affatto esaminato*; se
riscontrasse errori di compilazione che non è in grado di correggere, valuti la
possibilità di racchiudere le porzioni di codice che li causano all'interno di
commenti. Resta inteso che tale codice commentato non sarà valutato.

### Il palinsesto giornaliero

Un *palinsesto* giornaliero è un elenco di *trasmissioni*, ciascuna delle quali
può avvenire (senza sovrapposizioni temporali) in una o più *fasce orarie* di
uno stesso giorno.

Il tempo su Betazed è descritto dal **betaorario** che è espresso in *betaore*
(un numero intero tra 0 e 30, estremi compresi) e *betaminuti*  (un numero
intero compreso tra 0 e 79, estremi inclusi). Detto altrimenti, un "giorno" sul
pianeta Betazed dura 31 betaore, ossia 2480 betaminuti. Potrebbe essere utile
fornire la possibilità di *confrontare* tra loro due betaorari, stabilendo quale
venga prima.

Una **fascia betaoraria** è data da un betaorario di *inizio* e da una *durata*
in betaminuti che ne determina il betaorario di *fine*, si osservi che inizio e
durata devono essere tali per cui la fine della fascia cada nello stesso giorno
in cui è iniziata. Può essere molto utile che una fascia betaoraria sia in grado
di stabilire se si *interseca* (ossia ha almeno un betaminuto in comune) con
un'altra fascia, o meno.

Una **trasmissione** è data da un *titolo* e da una o più *fasce betaorarie* in
cui deve essere trasmessa. Sono esempi di tipi di trasmissione:

- la **trasmissione semplice**, a cui corrisponde una sola fascia betaoraria;
- la **trasmissione periodica**, che si ripete all'interno dello stesso giorno
  in un assegnato numero di fasce betaorarie, tutte della medesima durata e che
  iniziano a una distanza data da un assegnato numero di betaminuti;
- il **radiogiornale**, che ha una durata assegnata (inferiore all'ora) e che
  viene trasmesso sempre alle ore `09:40`, `11:40`, `19:40`, `21:40`, `22:40` e
  `25:40`.

Ovviamente è possibile immaginare che esistano anche molti altri tipi di
trasmissione, così come è ammissibile non implementare (per ragioni di tempo)
tutti i tipi elencati in precedenza, ma è bene progettare la gerarchia in modo
da tenerne comunque conto! Può essere molto utile che anche una trasmissione sia
in grado di decidere se si *interseca* con un'altra trasmissione (ossia se una
delle sue fasce betaorarie si interseca con una delle fasce dell'altra), o meno.

Infine, un **palinsesto** giornaliero è un insieme di *trasmissioni* costruito
in modo tale che le trasmissioni che lo compongono non si intersechino tra loro.

## Cosa è necessario implementare

Dovrà implementare una gerarchia di oggetti utili quanto meno a rappresentare un
palinsesto giornaliero che supporti almeno due tipi di trasmissione.

Per verificare il comportamento del proprio codice può essere utile implementare
una *classe di test* che, leggendo dal flusso di ingresso la descrizione di un
elenco di trasmissioni, costruisca il relativo palinsesto giornaliero e lo
emetta nel flusso d'uscita. Un esempio di input potrebbe essere

    SEMPLICE 10:15 45 Cartoni animati
    RADIOGIORNALE 10 Giornale radio
    PERIODICA 13:30 40 2 1120 Ricette del giorno
    SEMPLICE 28:45 120 Film della sera

dove il primo campo è usato per indicare il tipo di trasmissione e il resto
della linea ne descrive le caratteristiche temporali e il titolo; in questo esempio:

- l'ora di inizio e la durata, per le trasmissioni semplici,
- la durata, per il radio giornale,
- l'ora di inizio e la durata della prima fascia oraria, nonché il numero di
  ripetizioni e la distanza in minuti tra l'inizio di due fasce consecutive, per
  le trasmissioni periodiche.

Dato l'input precedente, un esempio di output è

    09:40 -  Giornale radio
    10:15 -  Cartoni animati
    11:40 -  Giornale radio
    13:30 -  Ricette del giorno
    19:40 -  Giornale radio
    21:40 -  Giornale radio
    22:40 -  Giornale radio
    25:40 -  Giornale radio
    27:30 -  Ricette del giorno
    28:45 -  Film della sera

che elenca, in ordine temporale, per ciascuna fascia betaoraria legata a una
dalle quattro trasmissioni in input, il betaotrario del suo inizio e il titolo
della relativa trasmissione.