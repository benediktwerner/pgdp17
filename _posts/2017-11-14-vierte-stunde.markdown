---
layout: post
title:  "Vierte Stunde"
date:   2017-11-14 12:00:42 +0200
categories: pgdp stunde
---
### Folien
- [Folien der vierten Stunde](/~wernerbe/pgdp/assets/slides/pgdp-tutorium-04.pdf)

### Lösungen der Programmieraufgaben
- [Aufgabe 4.2](/~wernerbe/pgdp/assets/code/Aufgabe4_2.java)
- [Aufgabe 4.3](/~wernerbe/pgdp/assets/code/Aufgabe4_3.java)
- [Aufgabe 4.4](/~wernerbe/pgdp/assets/code/Aufgabe4_4.java)

### Basisumwandlung
Beispiel: 23140 in Basis 5 zu Basis 7

#### Methode 1 (nur Multiplikation)
1. Die Zahl in ihre einzelnen Stellen aufteilen:

    23140<sub>5</sub> = 2<sub>5</sub> * 10<sub>5</sub><sup>4</sup> + 3<sub>5</sub> * 10<sub>5</sub><sup>3</sup> + 1<sub>5</sub> * 10<sub>5</sub><sup>2</sup> + 4<sub>5</sub> * 10<sub>5</sub><sup>1</sup>

2. Jede Komponente in die neue Basis umwandeln:

    = 2<sub>7</sub> * 5<sub>7</sub><sup>4</sup> + 3<sub>7</sub> * 5<sub>7</sub><sup>3</sup> + 1<sub>7</sub> * 5<sub>7</sub><sup>2</sup> + 4<sub>7</sub> * 5<sub>7</sub><sup>1</sup>
	
3. Den resultierenden Term ausrechnen:

    = 2<sub>7</sub> * 1552<sub>7</sub> + 3<sub>7</sub> * 236<sub>7</sub> + 34<sub>7</sub> + 4<sub>7</sub> * 5<sub>7</sub>
	
    = 3434<sub>7</sub> + 1044<sub>7</sub> + 34<sub>7</sub> + 26<sub>7</sub>
	
    = 4604<sub>7</sub>


#### Methode 2 (mit Division)
1. Die Zielbasis in die Ausgangsbasis umwandeln. Da wir in die Basis 7 umwandeln müssen wir also die Zahl 7 in die Basis 5 umwandeln: 7<sub>10</sub> `->` 12<sub>5</sub>
2. Als nächstes Teilen wir die Ausgangszahl so lange mit Rest durch die Zielbasis, bis 0 übrig bleibt.
3. Der Rest von unten nach oben gelesen ist die Zahl in der Zielbasis.

![](/~wernerbe/pgdp/assets/img/basis-umwandeln.png)

Schriftliches dividieren funktioniert in anderen Basen genauso wie im Dezimalsystem:
![Schriftlich dividieren in der Basis 5](/~wernerbe/pgdp/assets/img/dividieren.png)
