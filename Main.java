import java.util.ArrayList;

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

        // affichage des 30 camions
        /*
         * camions.forEach(camion -> {
         * camion.getCamion();
         * });
         */

        // gestion de la carriere
        for (int i = 1; i <= 5; i++) {
            if (Camions.capacite == 0) {
                System.out.println("Camion n°" + i + " est dans la carrière");
                System.out.println("Camion n°" + i + " est en train de se remplir...");
            }
            for (int j = Camions.capacite; j <= Camions.capacite; j += 5) {
                System.out.println(Camions.capacite);
            }
            for (int k = 0; k <= 10; k++) {

                try {
                    Thread.sleep(50);
                    Camions.capacite += 5;
                    System.out.println(Camions.capacite);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (Camions.capacite == 50) {
                    Camions.capacite = 0;
                    System.out.println("le camion n° " + i + " est chargé et va repartir");
                    goChrono();
                    break;
                }
            }
        }
    }

    // calculer le temps de la charge
    static long chrono = 0;

    static void goChrono() {
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long exec = endTime - startTime;
        System.out.println("Cela a pris " + exec + " ms");
    }

}