public class Multiplication extends Operation{
    
    public Multiplication(Nombre operande1, Nombre operande2){
       super(operande1, operande2);
    }

    public int valeur(){
        return getOperande1().valeur() * getOperande2().valeur();
    }

    public String toString() {
        return "(" + getOperande1() + " * " + getOperande2() + ")";
    }
}