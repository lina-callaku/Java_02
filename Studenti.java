public class Studenti {
    String emri;
    String kodi;
    static int numriStudenteve = 0;

    public Studenti(String emri) {
        this.emri = emri;
        numriStudenteve++;
        this.kodi = String.format("PU-2026-%03d", numriStudenteve);
    }

    public static int getNumriStudenteve() {
        return numriStudenteve;
    }
}
