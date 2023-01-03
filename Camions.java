import java.util.Timer;
import java.util.TimerTask;

public class Camions {
    public int num;
    public int temps;
    public static int capacite;
    public int chargement;

    public Camions(int num, int temps, int capacite, int chargement) {
        this.num = num;
        this.temps = temps;
        Camions.capacite = capacite;
        this.chargement = chargement;
    }

    
    public void getCamion() {
        System.out.println("Camion n°" + num + " attnd une place dans la carrière");
    }

    /* Camions [ ] camionsList;
    Camions[ ] arr = new Camions[1]; */

}
