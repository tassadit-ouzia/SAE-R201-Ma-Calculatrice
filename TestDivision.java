ppublic class TestDivision{
    public static void main(String[] args){
        Nombre six = new Nombre(6);
        Nombre dix = new Nombre(10);

        Addition division = new Division(six, dix);
        System.out.println("le résultat est "+ division);
    }
}