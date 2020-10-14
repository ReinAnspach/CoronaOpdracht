import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Scanner;

public class reserveringsInvoerder {
    LocalDate vandaag = LocalDate.now();
    LocalDate morgen = vandaag.plusDays(1);
    int gekozenTijdsslot;
    int reserveringsNummer = 1;
    int nextTafelNr = 1;
    Scanner reserveringsMaker = new Scanner(System.in);


    @Test
    void inputVoorEenReservering() {
        System.out.println("Welkom. Bij welke locatie wilt u reserveren? De opties zijn Restaurant of Cafe.");
        String gekozenLocatie = reserveringsMaker.nextLine();
        if (!(gekozenLocatie.equalsIgnoreCase("restaurant") || gekozenLocatie.equalsIgnoreCase("cafe"))){
            System.err.println("Dat is geen bestaande locatie. Probeer het nog eens.");
        } else {
            System.out.println("U heeft gekozen voor de locatie: " + gekozenLocatie);
            //System.out.println("Voor hoeveel personen wilt u reserveren?");
            //int aantalPersonen = reserveringsMaker.nextInt();
            //if (!(aantalPersonen == 1 || aantalPersonen == 2 || aantalPersonen == 3 || aantalPersonen == 4)) {
                //System.err.println("Dat is niet een geldig aantal personen. Kies 1 tot 4.");
            //} else {
                //System.out.println("U kunt reserveren voor vandaag of morgen. Wilt u voor vandaag of morgen reserveren?");
                //String reserveringsDag = reserveringsMaker.nextLine();
                System.out.println("Wilt u voor lunch of voor diner reserveren?");
                String gekozenMaaltijd = reserveringsMaker.nextLine();
                if (!(gekozenMaaltijd.equalsIgnoreCase("lunch") || gekozenMaaltijd.equalsIgnoreCase("diner"))) {
                    System.err.println("Sorry, dat was geen valide optie. Probeer het nog eens.");
                    // Exception inbouwen maaltijdkeuze
                } else if (gekozenMaaltijd.equalsIgnoreCase("lunch")) {
                    System.out.println("U kunt om 12, 2, of 4 uur reserveren. Welk tijdsslot wilt u reserveren?");
                    gekozenTijdsslot = reserveringsMaker.nextInt();
                    // Exception inbouwen tijden; exception tijd is vol
                    System.out.println("U heeft gekozen voor een lunch om " + gekozenTijdsslot + " uur.");
                } else if (gekozenMaaltijd.equalsIgnoreCase("diner")) {
                    System.out.println("U kunt om 6 of om 8 uur reserveren. Welk tijddslot wilt u reserveren?");
                    gekozenTijdsslot = reserveringsMaker.nextInt();
                    // Exception inbouwen tijden; exception tijd is vol
                    System.out.println("U heeft gekozen voor een diner om " + gekozenTijdsslot + " uur." /* met + aantalPersonen*/);
                }
            }
        }

       // return reserveringsTracker(vandaag, gekozenLocatie, gekozenMaaltijd, gekozenTijdsslot);

    }

     /*Reservering reserveringsTracker(LocalDate vandaag, String gekozenLocatie, String gekozenMaaltijd, int gekozenTijdsslot){
        String reseveringsNummer = "Reservering " + nextResNr;
        int tafelNummer = nextTafelNr;
        Reservering reservering1 = new Reservering(nextResNr, gekozenTijdsslot);
        nextResNr++;
        nextTafelNr++;
        return reservering1;
     }*/



