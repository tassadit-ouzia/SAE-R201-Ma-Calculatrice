public class Multiplication extends Operation{
    private Nombre operande1;
    private Nombre operande2;

    public Multiplication(Nombre operandeNum1, Nombre operandeNum2){
        this.operande1 = operandeNum1; 
        this.operande2 = operandeNum2; 
    }

    public int valeur(){
        return operande1.valeur() * operande2.valeur();
    }

    public Nombre getOperande1() {
        return operande1;
    }

    public Nombre getOperande2() {
        return operande2;
    }

    public String toString() {
        return operande1 + " * " + operande2 + "="+ valeur();
    }
}