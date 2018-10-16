
public class Kreis extends Grundflaeche {
  private int radius;

  @Override
  public double umfang() {
    return 2 * Math.PI * radius;
  }

  @Override
  public double flaeche() {
    return Math.PI * Math.pow(radius, 2);
  }

  public Kreis(int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  @Override
  public String toString() {
    return "Kreis{" + "radius=" + radius + "; " + super.toString() + '}';
  }

}
