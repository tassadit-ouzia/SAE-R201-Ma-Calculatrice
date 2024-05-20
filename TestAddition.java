public class TestAddition {
    public static void main(String[] args) {
        Nombre six = new Nombre(6);
        Nombre dix = new Nombre(10);

        Addition addition = new Addition(six, dix);
        System.out.println("le résultat est " + addition.valeur());
    }
} 