
public class Rrethi {
    double rrezja;

        public Rrethi(double rrezja) {
            this.rrezja = rrezja;
        }

        public double siperfaqja() {
            return Math.PI * rrezja * rrezja;
        }

        public double perimetri() {
            return 2 * Math.PI * rrezja;
        }

        public static Rrethi meIMadhi(Rrethi a, Rrethi b) {
            // Metoda eshte statike sepse krahason dy objekte
            // dhe nuk varet nga nje objekt i caktuar i klases.
            if (a.siperfaqja() >= b.siperfaqja()) {
                return a;
            } else {
                return b;
            }
        }
    }



