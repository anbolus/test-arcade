import java.util.ArrayList;

public class Main {
    static ArrayList<Camions> camions = new ArrayList<>();
    
    public static void main(String[] args) {


        // création des camions


        for (int i = 1; i <= 30; i++) {
            Camions c = new Camions(i, 0, 0);
            camions.add(c);

            if (Camions.capacite == 0) {
                camions.add(i, c);
            }

            while (i == 5) {
                for (i = 1; i <= 30; i++) {
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
                            Camions.capacite += 10;
                            System.out.println(Camions.capacite);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if (Camions.capacite == 100) {
                            Camions.capacite = 0;
                            System.out.println("le camion n° " + i + " est chargé et va repartir");
                            goChrono();
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void getCamion() {
        System.out.println("Camion n°" + Camions.num + " attnd une place dans la carrière");
    }

    // affichage des 30 camions
    /*
     * camions.forEach(camion -> {
     * camion.getCamion();
     * });
     */

    // calculer le temps de la charge
    static long chrono = 0;

    static void goChrono() {
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long exec = endTime - startTime;
        System.out.println("Cela a pris " + exec + " ms");
        Camions.temps = exec;
    }

}