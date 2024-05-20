public class Division extends Operation {

    public Division(Nombre operande1, Nombre operande2) {
        super(operande1, operande2);
        if (operande2.valeur() == 0) {
            throw new IllegalArgumentException("Division par zéro impossible!");
        }
    }


    public int valeur(){
        return getOperande1().valeur()/getOperande2().valeur();
    }

    public String toString() {
        return "(" + getOperande1() + " / " + getOperande2() + ")";
    }
}
