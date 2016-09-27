CCL ist eine Programmiersprache, die einigen nervigen Eigenschaften von anderen Programmiersprachen entgegen wirken soll.

CCL befindet sich aktuell noch in einem sehr frühen Entwicklungsstadium, und ist deswegen lange noch nicht so einfach zu nutzen, wie es später werden soll.

Hier findest du ein kleines Tutorial zum Einstieg mit CCL.

* Hello World-Programm
* Ausführung
    * Kompilieren
    * Ausführen
* Include

# Hello World-Programm
Ein einfaches Hello World-Programm in CCL sieht aktuell so aus:

`
#include ccl/std/Console.cl2
println("Hello World");
`

# Ausführung
Jetzt ist natürlich die Frage, wie du das Programm ausführen kannst. Dazu solltest du dir zuerst dieses Repository herunterladen. Darin findest du die Datei **helloWorld.cl2**, die den Code von oben enthält.

## Kompilieren
Da CCL eine kompilierte Sprache ist, müssen wir das Programm vor dem Ausführen Kompilieren. Speichere es dazu in einer Datei mit der Endung **.cl2** ab. Öffne dann eine Shell / einen Befehlsprozessor, und gib einen Befehl folgender Art ein:

`java -jar <JAR-DATEI> -compile <PROGRAMM-DATEI>`

Mit der jar-Datei ist die direkt im Repository enthaltene .jar-Datei gemeint, und mit Programm-Datei eben dein Programm.

## Ausführen
Jetzt has du dein Programm kompiliert, und mit folgendem Befehl wird es ausgeführt:

`java -jar <JAR-DATEI> -eval <CL0-DATEI>`
Mit der cl0-Datei ist die Datei gemeint, die beim Kompilieren entstanden ist. Sie hat den gleichen namen wie deine Programm-Datei, nur statt **cl2** als Endung **cl0**.

Wenn du den Befehl entsprechend ausgeführt hast, solltest du die Ausgabe `Hello World` auf der Konsole sehen. Du hast damit dein erstes Programm in CCL zum laufen gebracht!

# Include
Beim schreiben des Programms ist dir vielleicht schon die Zeile `#include ccl/std/Console.cl2` aufgefallen. Diese läd die Standard-Bibliothek für Konsolenausgaben (zu finden unter **ccl/std/Console.cl2**) und fügt deren Inhalt genau da ein, wo das `#include` steht.

Die Zeile `print("Hello World");` sollte eigentlich recht selbsterklärend sein. Wichtig zu beachten ist aber, dass hinter Befehlen wie Funktionsaufrufen immer ein `;` stehen muss - wie bereits aus vielen anderen Sprachen bekannt - Allerdings brauchst du kein Semikolon bei Befehlen, die mit `#` anfangen, wie `#include`.

Work in Progress