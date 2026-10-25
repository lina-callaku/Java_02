public class Libri {
    String titulli;
    int faqet;

    public Libri(String titulli, int faqet) {
        this.titulli = titulli;
        this.faqet = faqet;
    }

    public Libri(String titulli) {
        this(titulli, 100);
    }
}