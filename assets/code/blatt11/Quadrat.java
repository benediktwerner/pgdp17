
public class Quadrat extends Grundflaeche {
  private int laenge;

  public int getLaenge() {
    return laenge;
  }

  @Override
  public double umfang() {
    return 4 * laenge;
  }

  @Override
  public double flaeche() {
    return laenge * laenge;
  }

  @Override
  public boolean istQuadrat() {
    return true;
  }

  @Override
  public Quadrat zuQuadrat() {
    return this;
  }

  public Quadrat(int laenge) {
    this.laenge = laenge;
  }

  @Override
  public String toString() {
    return "Quadrat{" + "laenge=" + laenge + "; " + super.toString() + '}';
  }

}
