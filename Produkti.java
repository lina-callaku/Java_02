public class Produkti {
    String emri;
    double cmimi;
    int sasia;

    public Produkti(String emri, double cmimi, int sasia) {
        this.emri = emri;
        this.cmimi = cmimi;
        this.sasia = sasia;
    }

    public Produkti(String emri, double cmimi) {
        this(emri, cmimi, 1);
    }

    public Produkti(String emri) {
        this(emri, 0.0, 0);
    }

    public double vleraTotale() {
        return cmimi * sasia;
    }
}

