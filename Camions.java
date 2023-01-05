public class Camions {
    public static int num;
    public static long temps;
    public static int capacite;

    public Camions(int num, int temps, int capacite) {
        this.num = num;
        this.temps = temps;
        Camions.capacite = capacite;
    }

    
    public void getCamion() {
        System.out.println("Camion n°" + num + " attnd une place dans la carrière");
    }

    /* Camions [ ] camionsList;
    Camions[ ] arr = new Camions[1]; */

}
