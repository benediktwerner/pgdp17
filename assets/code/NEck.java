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
}