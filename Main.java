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

        /*
         * Pour afficher les 30 camions
         * camions.forEach(camion -> {
         * camion.getCamion();
         * });
         */

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {

                for (int i = 1; i <= 5; i++) {
                    if (Camions.capacite == 0) {
                        System.out.println("Camion n°" + i + " est dans la carrière");
                        System.out.println("Camion n°" + i + " est en train de se remplir...");
                    }
                    for (int j = Camions.capacite; j <= Camions.capacite; j += 5) {
                        System.out.println(Camions.capacite);
                    }
                    for (int k = 0; k <= 10; k++) {
                        Camions.capacite += 5;
                        System.out.println(Camions.capacite);

                        if (Camions.capacite == 50) {
                            Camions.capacite = 0;
                            System.out.println("le camion n° " + i + " est chargé et va repartir");
                            goChrono();
                            break;
                        }
                        timer.cancel();
                    }
                }
            }
        };
        timer.schedule(task, 50, 50);
    }

    static long chrono = 0;

    static void goChrono() {
        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        System.out.println("Cela a pris " + (endTime - startTime) + " ms");
    }

}