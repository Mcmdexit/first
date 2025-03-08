import java.util.Scanner;

public class Looops2 {
    public static void main(String[] args) {
        boolean running = true; // ftiaxnw mia metavlhth poy legetai running kai ths anathetw thn timh true

        Scanner input = new Scanner(System.in);

        while (running) {
            System.out.printf(
                    "Epiloges:\n1. Ektypwsh agaphmenoy froytoy\n2. Ektypwsh ligotero agaphmenoy froytoy\n0. Eksodos\n> ");
            int epilogh = input.nextInt();

            if (epilogh == 0) {
                // break;
                running = false;
            }
            // na xeirizesai tis diaforetikes epiloges
        }

        // mia while pws doyleyei:
        // 1. koitaei synthikh. an isxyei:
        // 2. trexei kwdika. gyrnaei pisw sto 1
    }
}
