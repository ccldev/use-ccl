CCL ist eine Programmiersprache, die einigen nervigen Eigenschaften von anderen Programmiersprachen entgegen wirken soll.

CCL befindet sich aktuell noch in einem sehr frühen Entwicklungsstadium, und ist deswegen lange noch nicht so einfach zu nutzen, wie es später werden soll.

Hier findest du ein Tutorial zum Einstieg mit CCL. (Geschrieben für Version 0.2.9_6)

Einstieg:
* Hello World-Programm
* Ausführung
    * Kompilieren
    * Ausführen
* Include
* Variablen
* Funktionen
* Weiteres zu Werten
    * Properties
    * Standard-Properties
        * Beispiele zu Standard-Properties
* Kontrollstrukturen
    * While-Schleife

Variablen und Daten:
* Datentypen

# Hello World-Programm
Ein einfaches Hello World-Programm in CCL sieht aktuell so aus:

    #include ccl/std/Console.cl2
    println("Hello World");

# Ausführung
Jetzt ist natürlich die Frage, wie du das Programm ausführen kannst. Dazu solltest du dir zuerst dieses Repository herunterladen. Darin findest du die Datei **helloWorld.cl2**, die den Code von oben enthält.

## Kompilieren
Da CCL eine kompilierte Sprache ist, müssen wir das Programm vor dem Ausführen Kompilieren. Speichere es dazu in einer Datei mit der Endung **.cl2** ab. Öffne dann eine Shell / einen Befehlsprozessor, und gib einen Befehl folgender Art ein:

`java -jar <JAR-DATEI> -compile <PROGRAMM-DATEI>`

Mit der jar-Datei ist die direkt im Repository enthaltene .jar-Datei gemeint, und mit Programm-Datei eben dein Programm.

## Ausführen
Jetzt has du dein Programm kompiliert, und mit folgendem Befehl wird es ausgeführt:

`java -jar <JAR-DATEI> <CL0-DATEI>`
Mit der cl0-Datei ist die Datei gemeint, die beim Kompilieren entstanden ist. Sie hat den gleichen namen wie deine Programm-Datei, nur statt **cl2** als Endung **cl0**.

Wenn du den Befehl entsprechend ausgeführt hast, solltest du die Ausgabe `Hello World` auf der Konsole sehen. Du hast damit dein erstes Programm in CCL zum laufen gebracht!

# Include
Beim schreiben des Programms ist dir vielleicht schon die Zeile `#include ccl/std/Console.cl2` aufgefallen. Diese läd die Standard-Bibliothek für Konsolenausgaben (zu finden unter **ccl/std/Console.cl2**) und fügt deren Inhalt genau da ein, wo das `#include` steht.

Die Zeile `print("Hello World");` sollte eigentlich recht selbsterklärend sein. Wichtig zu beachten ist aber, dass hinter Befehlen wie Funktionsaufrufen immer ein `;` stehen muss - wie bereits aus vielen anderen Sprachen bekannt - Allerdings brauchst du kein Semikolon bei Befehlen, die mit `#` anfangen, wie `#include`.

# Variablen
Natürlich gibt es in CCL auch Variablen. Diese werden so deklariert:

    var name = "value";

Auch hinter Variablendeklarationen ist ein Semikolon nötig.
In Variablen kann man jeden beliebigen Wert speichern (wovon es mehr gibt, als man vielleicht denkt), und diesen unter dem Variablennamen ansprechen. Es ist also egal, ob ich jetzt

    println(name);

oder

    println("value");
    
schreibe. Die Ausgabe bleibt gleich.

# Funktionen
Seit CCL 0.2 ist es möglich, eigene Funktionen zu erstellen. Davor gab es nur die standard-Funktionen. Eine eigene Funktion in CCL wird so erstellt:

    def functionName(param1, param2){
        println(param1);
        println(param2);
    }

Dabei ist `functionName` der Funktionsname, `param1` und `param2` die Parameter und das, was innerhalb der geschweiften klammern steht, ist das, was beim ausführen der Funktion gemacht wird.

Wichtig zu Funktionen ist noch, dass jede Funktion in eine eigene Datei compiliert wird. Diese neuen Dateien entstehen aktuell innerhalb des Ordners, von dem aus du das Kompilieren gestartet hast. Du brauchst also schreibrechte auf diesem Ordner.

# Weiteres zu Werten
Bisher kennen wir nur Zeichenketten (oder Strings) in CCL. Diese beginnen und enden immer mit `"`. Es gibt aber noch einige weitere Arten von Werten:

    2       Eine (ganz-)zahl (number)
    true    Ein Wahrheitswert (boolean)
            true ist wahr, false ist falsch
    [1,2,3] Eine Sammlug von Werten (array)
            Arrays beginnen mit [ und enden mit ].
            In einem Array können beliebig viele Werte liegen. Werte werden mit , voneinander getrennt.
    (java.lang.System)
            Eine Java-Klasse (hier "java.lang.System").
            Erlaubt zugriff auf Java-Bibliotheken.
    
    var myVar = "Value";
    myVar   Der Inhalt einer Variablen (hier myVar).
            Kann genau das gleiche wie der Wert der Variablen (hier der String "Value");
    
Weiteres zu Variablen findest du im Kapitel *Variablen und Daten*.

Eine praktische Sache noch: Jeder Wert kann aufgerufen werden. Bei einer Funktion ist klar, dass das geht. Aber auch folgendes würde funktionieren:

    "Hallo Welt"();

Das gibt genau den gleichen Wert wieder zurück, also "Hallo Welt". Sieht erstmal unnötig aus, verhindert aber dass man extra für eine Wertrückgabe eine eigene Funktion erstellen muss.

Ruft man eine nicht-Funktion mit einem Parameter auf, kann man auf eine Property zugreifen. Mehr dazu unter dem Abschnitt *Properties*.

## Properties
Jeder wert in CCL hat Properties, oder Eigenschaften. Über Properties können wir beispielsweise zwei Zahlen zusammen rechnen.

    1.add(3)    Ergebnis ist 4
    
Hier haben wir die Zahl `1`, wovon wir die Property `add` bekommen. Diese führen wir als Funktion aus

## Standard-Properties
Folgende Properties hat jeder Wert:

* properties: Ein Array mit allen properties des Wertes.
* type: Der Datentyp eines Wertes (mehr dazu unter dem Abschnitt *Datentypen*)
* array: Funktion, die den aktuellen Wert in ein Array "verpackt". Dieses hat dann die Länge 1. Erwartet einen String als Namen für das Element (mehr dazu unter dem Abschnitt *Mehr zu Arrays*).
* while: Funktion, die einen Wert so lange als Funktion ausführt, bis die als Parameter angegebene Bedingung falsch ist. Die Bedingung wird als Funktion angegeben. Dank des oben erklärten Verhaltens können wir aber jeden Wert verwenden. Rückgabe ist ein Array, das die Rückgabewerte der "aufgerufenen" Funktion zurück gibt (Beispiele dazu gleich).
* for: Beschreibung folgt.
* bind: "Bindet" eine Funktion an Parameter. Haben wir eine Funktion mit zwei Parametern und rufen darauf **bind** mit einem Parameter auf, erhalten wir eine Funktion die nurnoch einen Parameter erwartet. Der erste Parameter der ursprünglichen Funktion ist dann immer gleich (Beispiele dazu gleich).
* unbind: Erweitert eine Funktion um eine angegebene Parameterzahl. Rufen wir .bind(2) auf eine Funktion mit einem Parameter auf, erwartet die zurückgegebene Funktion 3 Parameter (1 + 2). Die ersten 2 werden allerdings ignoriert. (Beispiele dazu gleich).
* link: Beschreibung folgt

### Beispiele zu Standard-Properties

Beispiel zur while- und for-Funktion: Lese alle Zeilen aus einer Datei und gib sie aus.

    #include ccl/std/Console.cl2
    
    var ScannerClass = (java.util.Scanner);
    var FileClass = (java.io.File);
    
    var file = FileClass("myFile.txt");
    var scanner = ScannerClass(file);
    
    var lines = scanner.nextLine.while(scanner.hasNextLine);
    
    println.for(lines);

Beispiel zu bind: Zwei Möglichkeiten für eine Hello-World Funktion.

    #include ccl/std/Console.cl2
    
    def helloWorld1(){
        println("Hello World");
    }
    
    var helloWorld2 = println.bind("Hello World");
    
    helloWorld1();
    helloWorld2();

Beispiel zu unbind und for: Die Hello-World Funktion 10 mal aufrufen.

    #include ccl/std/Console.cl2
    
    var helloWorld = println.bind("Hello World");
    
    var helloWorld2Parameters = helloWorld.unbind(1);
    
    helloWorld2Parameters.for(1,10);

# Kontrollstrukturen
In ungefähr jeder Programmiersprache gibt es Kontrollstrukturen. So auch in CCL:

## While-Schleife
Die While-Schleife wiederholt einen bestimmten Code so lange, wie eine bestimmte Bedingung wahr (**true**) ist. Folgendes erzeugt also eine Dauerschleife:

    while(true){
        println("Yay! Dauerschleife!");
    }

---

# Datentypen
Obwohl man es nicht auf den ersten Blick sieht, haben in CCL alle Daten (bzw. Werte) einen Datentyp. Diesen kann man folgendermaßen ermitteln:
    
    "Mein String".type      Ergibt "string"
    3.type                  Ergibt "number" (In einigen Versionen auch "integer")
    println.type            Ergibt "function"
    (java.lang.System)      Ergibt "native"
    
Auf diese Weise können wir Daten kategorisieren. Wir können etwa herausfinden, ob wir eine Zahl oder eine Funktion in der Hand haben.

Work in Progress