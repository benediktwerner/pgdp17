---
layout: page
title: Wie richte ich Autoformattierung in eclipse ein?
link_title: Autoformatierung
---

Am besten lest ihr euch den Style Guide einmal durch, damit ihr zumindest
ungefähr wisst was drin steht:
[Google Style Guide](https://google.github.io/styleguide/javaguide.html){:target="_blank"}.

## Autoformatierung einrichten
1. Lade die Datei [eclipse-java-google-style.xml](https://raw.githubusercontent.com/google/styleguide/gh-pages/eclipse-java-google-style.xml)
herunter. Die Datei und Äquivalente für andere IDEs können auch im
[Github Repository des Google Style Guides](https://github.com/google/styleguide){:target="_blank"}
gefunden werden.
2. Klicke in eclipse unter `Window -> Preferences` auf `Java -> Code Style -> Formatter`,
dort auf `Import` und importiere die gerade heruntergeladene Datei.
3. Fertig.

## Code autoformatieren
Um deinen Code jetzt automatisch zu formatieren benutze `Source -> Format` oder den
dazugehörigen Keyboard-Shortcut <kbd>Ctrl</kbd>+<kbd>Shift</kbd>+<kbd>F</kbd>.
