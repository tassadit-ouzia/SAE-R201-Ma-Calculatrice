public class division extends Operation {

    public Division(Nombre operande1, Nombre operande2) {
        super(operande1, operande2);
        if (operande2.valeur() == 0) {
            throw new IllegalArgumentException("Division par zéro impossible!");
        }
    }


    public int valeur(){
        if (getOperande2().valeur() == 0) {
            throw new ArithmeticException("Division par zéro.");
        }
        return getOperande1().valeur()/getOperande2().valeur();
    }

    public String toString() {
        return "(" + getOperande1() + " / " + getOperande2() + ")";
    }
}
