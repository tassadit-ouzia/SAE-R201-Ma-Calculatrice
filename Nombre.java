public class Nombre {
    private int valeurNombre; 

    public Nombre(int valnb){
        this.valeurNombre= valnb;
    }


    public int valeur(){
        return valeurNombre;
    }

    public String toString(){
        return "le nombre est:"+ this.valeurNombre;
    }
}