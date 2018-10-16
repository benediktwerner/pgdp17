
public class Rechteck extends Grundflaeche {
  private int breite;

  public int getBreite() {
    return breite;
  }

  private int laenge;

  public int getLaenge() {
    return laenge;
  }

  @Override
  public double umfang() {
    return 2 * breite + 2 * laenge;
  }

  @Override
  public double flaeche() {
    return breite * laenge;
  }

  public Rechteck(int breite, int laenge) {
    this.breite = breite;
    this.laenge = laenge;
  }

  @Override
  public boolean istQuadrat() {
    return laenge == breite;
  }

  @Override
  public Quadrat zuQuadrat() {
    if (istQuadrat()) {
      return new Quadrat(breite);
    } else {
      return null;
    }
  }

  @Override
  public String toString() {
    return "Rechteck{" + "breite=" + breite + ", laenge=" + laenge + super.toString() + '}';
  }

}
