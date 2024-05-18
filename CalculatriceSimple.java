public class CalculatriceSimple {
    public static void main(String args[]) {
        Nombre six = new Nombre(6);
        Nombre dix = new Nombre(10);

        Soustraction s = new Soustraction(dix, six);
        System.out.println("le résultat est:" + s.valeur());

        Multiplication m = new Multiplication(dix, six);
        System.out.println("le résultat est:" + m.valeur());

        Addition a = new Addition(dix, six);
        System.out.println("le résultat est:" + a.valeur());

        try {
            Division d = new Division(dix, six);
            System.out.println("le résultat est:" + d.valeur());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}