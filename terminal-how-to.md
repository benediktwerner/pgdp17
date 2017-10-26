---
layout: page
title: Wie benutze ich das Terminal?
link_title: Terminal
---
## Windows
#### Zu einem Ordner wechseln
`cd MeinProjekt` oder `cd workspace\MeinProjekt`

`cd` steht für **C**ange **D**irectory.

Um in der Hierarchie einen Ordner nach Oben zu gehen benutzt man `..`. `cd ..\..\AnderesProjekt`
geht also zwei Ordner nach oben und wechselt dann in den Ordner `AnderesProjekt`.

Um von der Basis des Dateisystems anzufangen beginnt man mit `\`: `cd \Users\Ich\Documents`.

Ein vorangestellter Laufwerksbuchstabe wie `C:` oder `D:` wird ignoriert.

#### Laufwerk wechseln
Einfach den Laufwerksbuchstaben gefolgt von einem Doppelpunkt eingeben: `C:`

#### Alle Dateien im aktuellen Ordner anzeigen
`dir` zeigt alle Dateien im aktuellen Ordner an.

#### Autovervollständigung
Drücke <kbd>Tab</kbd> um eine angefangene Eingabe automatisch zu vervollständigen.

z.B.: `cd MeinPro` + <kbd>Tab</kbd> = `cd MeinProjekt`

Wiederholtes drücken wechselt durch eventuell vorhandene Möglichkeiten:

`cd Do` <kbd>Tab</kbd> `cd Documents` <kbd>Tab</kbd> `cd Downloads`

#### Einen Befehl nochmal ausführen
Mit den Pfeiltasten <kbd>Up</kbd> und <kbd>Down</kbd> kann man durch vorher
eingegebene Befehle wechseln und diese mit <kbd>Enter</kbd> nochmal ausführen.

## MacOS und Linux
#### Zu einem Ordner wechseln
`cd MeinProjekt` oder `cd workspace/MeinProjekt`

`cd` steht für **C**ange **D**irectory.

Um in der Hierarchie einen Ordner nach Oben zu gehen benutzt man `..`. `cd ..\..\AnderesProjekt`
geht also zwei Ordner nach oben und wechselt dann in den Ordner `AnderesProjekt`.

Um von der Basis des Dateisystems anzufangen beginnt man mit `/`: `cd /home/ich/Documents`.

#### Alle Dateien im aktuellen Ordner anzeigen
`ls` zeigt alle sichtbaren Dateien im aktuellen Ordner an und steht für **l**i**s**t. Die Option `-a` zeigt
auch versteckte Dateien an (`ls -a`), während die Option `-l` die Dateien in einer Liste anzeigt (`ls -l`).
Unter einigen Linux-Distributionen ist `la` äquivalent zu `ls -a` und `ll` äquivalent
zu `ls -al`, wobei teilweise auch noch mehr Optionen angehängt werden.

#### Autovervollständigung
Drücke <kbd>Tab</kbd> um eine angefangene Eingabe automatisch zu vervollständigen.

z.B.: `cd MeinPro` + <kbd>Tab</kbd> = `cd MeinProjekt`

Falls es mehrere Möglichkeiten gibt passiert nichts. Durch wiederholtes drücken
werden alle Möglichkeiten angezeigt.

#### Einen Befehl nochmal ausführen
Mit den Pfeiltasten <kbd>Up</kbd> und <kbd>Down</kbd> kann man durch vorher
eingegebene Befehle wechseln und diese mit <kbd>Enter</kbd> nochmal ausführen.

#### Eine Datei ansehen
`less MeinDatei.txt`

Zum Beenden der Anzeige <kbd>Q</kbd> drücken.
