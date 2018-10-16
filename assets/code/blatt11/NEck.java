
public class NEck extends Grundflaeche {
  private int laenge;

  public int getLaenge() {
    return laenge;
  }

  private int n;

  public int getN() {
    return n;
  }

  public NEck(int n, int laenge) {
    this.n = n;
    this.laenge = laenge;
  }

  @Override
  public double umfang() {
    return n * laenge;
  }

  @Override
  public double flaeche() {
    return n * Math.pow(laenge, 2) / (4 * Math.tan(Math.PI / n));
  }

  @Override
  public boolean istQuadrat() {
    return n == 4;
  }

  @Override
  public Quadrat zuQuadrat() {
    if (istQuadrat()) {
      return new Quadrat(laenge);
    } else {
      return null;
    }
  }

  @Override
  public String toString() {
    return "NEck{" + "n = " + n + "; laenge = " + laenge + "; " + super.toString() + '}';
  }

}
