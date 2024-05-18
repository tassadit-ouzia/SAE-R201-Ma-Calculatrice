public class TestSoustraction {
    public static void main(String[] args) {
        Nombre six = new Nombre(6);
        Nombre dix = new Nombre(10);

        Soustraction soustraction = new Soustraction(dix, six);
        System.out.println("le résultat est " + soustraction.valeur());
    }
}