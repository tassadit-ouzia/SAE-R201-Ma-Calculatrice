public class TestMultiplication {
    public static void main(String[] args) {
        Nombre six = new Nombre(6);
        Nombre dix = new Nombre(10);

        Multiplication multiplication = new Multiplication(six, dix);
        System.out.println("le résultat est " + multiplication.valeur());
    }
}