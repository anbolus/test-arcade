import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        // création des camions
        ArrayList<Camions> camions = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            Camions c = new Camions(i, 0, 0, 0);
            camions.add(c);

            if (Camions.capacite == 0) {
                camions.add(i, c);

            }

        }

        /* Pour afficher les 30 camions
         * camions.forEach(camion -> {
         * camion.getCamion();
         * });
         */

        
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                
                int size = 5;
    
                for (int i = 1; i <= size; i++) {
                    if (Camions.capacite == 0) {
                        System.out.println("Camion n°" + i + " est dans la carrière");
                    }
                    for (int j = Camions.capacite; j <= Camions.capacite; j += 5) {
                        System.out.println("Camion n°" + i + " est en train de se remplir...");
                        System.out.println(Camions.capacite);
                    }
                    
                    for (i = 1; i <= 10; i++) {
                        Camions.capacite += 5;
                        System.out.println(Camions.capacite);
                        
                        if (Camions.capacite == 50) {
                            System.out.println("le camion est chargé et va repartir");
                            timer.cancel();
                        }
                    }
                }
            }
        };
        timer.schedule(task, 500, 500);
    }

    static long chrono = 0;

    static void goChrono() {
        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        System.out.println("Cela a pris " + (endTime - startTime) + " ms");
    }

}