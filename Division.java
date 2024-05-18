public class division extends Operation {
    private int operande1;
    private int operande2;


    public Division(Nombre operande1, Nombre operande2) throws IllegalArgumentException {
        if (operande2.valeur() == 0) {
            throw new IllegalArgumentException("Division par zéro impossible!");
        }
        this.operande1 = operande1;
        this.operande2 = operande2;
    }

    public int valeur(){
        return operande1.valeur()/operande2.valeur();
    }

    public Nombre getOperande1() {
        return operande1;
    }

    public Nombre getOperande2() {
        return operande2;
    }

    public String toString() {
        return operande1 + " / " + operande2 + "="+ valeur();
    }
}
