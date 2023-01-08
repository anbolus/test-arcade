public class Camions {
    public static int num;
    public static long temps;
    public static int capacite;

    public Camions(int num, int temps, int capacite) {
        Camions.num = num;
        Camions.temps = temps;
        Camions.capacite = capacite;
    }

    
    public void getCamion() {
        System.out.println("Camion n°" + num + " attnd une place dans la carrière");
    }

}
