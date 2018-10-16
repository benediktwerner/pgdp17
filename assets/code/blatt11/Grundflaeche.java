
public abstract class Grundflaeche {
  public abstract double umfang();

  public abstract double flaeche();

  public abstract boolean istQuadrat();

  public abstract Quadrat zuQuadrat();

  @Override
  public String toString() {
    return "Umfang: " + umfang() + "; Flaeche: " + flaeche() + "; Quadrat?: " + istQuadrat();
  }
}
