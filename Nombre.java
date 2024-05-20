public class Nombre {
    
    private int valeurNombre; 

    public Nombre(int valNb){
        this.valeurNombre= valNb;
    }


    public int valeur(){
        return this.valeurNombre;
    }

    public String toString(){
        return "le nombre est:"+ this.valeurNombre; 
    }
}