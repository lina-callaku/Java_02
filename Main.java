
public class Main {
    public static void main(String[] args) {
        Rrethi a = new Rrethi(5);
        Rrethi b = new Rrethi(3);

        System.out.println("Siperfaqja e rrethit A: " + a.siperfaqja());
        System.out.println("Perimetri i rrethit A: " + a.perimetri());

        Rrethi meIMadh = Rrethi.meIMadhi(a, b);

        System.out.println("Rrezja e rrethit me te madh: "
                + meIMadh.rrezja);
    }
}
