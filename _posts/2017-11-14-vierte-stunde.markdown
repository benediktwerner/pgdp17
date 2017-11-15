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

<br>
### Basisumwandlung
**Beispiel:** <code class="highlighter-rouge">23140<sub>5</sub></code> zur Basis `7` umwandeln<br><br>

#### Methode 1 (nur Multiplikation)
1. Die Zahl in ihre einzelnen Stellen aufteilen:

    <code class="highlighter-rouge">23140<sub>5</sub> = 2<sub>5</sub> * 10<sub>5</sub><sup>4</sup> + 3<sub>5</sub> * 10<sub>5</sub><sup>3</sup> + 1<sub>5</sub> * 10<sub>5</sub><sup>2</sup> + 4<sub>5</sub> * 10<sub>5</sub><sup>1</sup></code>

2. Jede Komponente in die neue Basis umwandeln (<code class="highlighter-rouge">10<sub>5</sub> = 5<sub>7</sub></code>):

    <code class="highlighter-rouge">= 2<sub>7</sub> * 5<sub>7</sub><sup>4</sup> + 3<sub>7</sub> * 5<sub>7</sub><sup>3</sup> + 1<sub>7</sub> * 5<sub>7</sub><sup>2</sup> + 4<sub>7</sub> * 5<sub>7</sub><sup>1</sup></code>
	
3. Den resultierenden Term ausrechnen:

	<code class="highlighter-rouge">= 2<sub>7</sub> * 1552<sub>7</sub> + 3<sub>7</sub> * 236<sub>7</sub> + 34<sub>7</sub> + 4<sub>7</sub> * 5<sub>7</sub><br></code>
    <code class="highlighter-rouge">= 3434<sub>7</sub> + 1044<sub>7</sub> + 34<sub>7</sub> + 26<sub>7</sub><br></code>
    <code class="highlighter-rouge">= 4604<sub>7</sub></code><br><br>

#### Methode 2 (mit Division)
1. Die Zielbasis in die Ausgangsbasis umwandeln. Da wir in die Basis 7 umwandeln müssen wir also die Zahl `7` in die Basis `5` umwandeln:

    <code class="highlighter-rouge">7<sub>10</sub> = 12<sub>5</sub></code>
	
2. Als nächstes Teilen wir die Ausgangszahl so lange mit Rest durch die Zielbasis, bis 0 übrig bleibt.

	<code class="highlighter-rouge">23140<sub>5</sub>                     : 12<sub>5</sub> = 1423<sub>5</sub>                 Rest &nbsp;4<sub>5</sub>     = 4<sub>7</sub><br></code>
	<code class="highlighter-rouge">&nbsp;1423<sub>5</sub>                : 12<sub>5</sub> = &nbsp;114<sub>5</sub>            Rest &nbsp;0<sub>5</sub>     = 0<sub>7</sub><br></code>
	<code class="highlighter-rouge">&nbsp;&nbsp;114<sub>5</sub>           : 12<sub>5</sub> = &nbsp;&nbsp;&nbsp;4<sub>5</sub>  Rest 11<sub>5</sub>          = 6<sub>7</sub><br></code>
	<code class="highlighter-rouge">&nbsp;&nbsp;&nbsp;&nbsp;4<sub>5</sub> : 12<sub>5</sub> = &nbsp;&nbsp;&nbsp;0<sub>5</sub>  Rest &nbsp;4<sub>5</sub>     = 4<sub>7</sub><br></code>

3. Der Rest von unten nach oben gelesen ist die Zahl in der Zielbasis.

	<code class="highlighter-rouge">-> 23140<sub>5</sub> = 4606<sub>7</sub></code>

<br>
Schriftliches dividieren funktioniert in anderen Basen genauso wie im Dezimalsystem:

![Schriftlich dividieren in der Basis 5](/~wernerbe/pgdp/assets/img/dividieren.png)
