import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Scanner;

public class reserveringsInvoerder {
    LocalDate vandaag = LocalDate.now();
    LocalDate morgen = vandaag.plusDays(1);
    int gekozenTijdsslot;
    Scanner reserveringsMaker = new Scanner(System.in);
    Reservering reservering;


    String vraagKlantOmStringInput(String vraagAanKlant) {
        System.out.println(vraagAanKlant);
        String antwoordKlant = reserveringsMaker.nextLine();
        System.out.println("U heeft geantwoord: " + antwoordKlant);
        return antwoordKlant;
    }

    @Test
    void inputVoorEenReservering() {
        String gekozenLocatie = vraagKlantOmStringInput("Welkom. Bij welke locatie wilt u reserveren? De opties zijn Restaurant of Cafe.");
        if (!(gekozenLocatie.equalsIgnoreCase("restaurant") || gekozenLocatie.equalsIgnoreCase("cafe"))) {
            System.err.println("Dat is geen bestaande locatie. Probeer het nog eens.");
        } else {
            //vraagKlantOmStringInput("U heeft gekozen voor de locatie: " + gekozenLocatie);
            int aantalPersonen = Integer.parseInt(vraagKlantOmStringInput("Voor hoeveel personen wilt u reserveren? Maximaal 4 personen per reservering."));
            if (!(aantalPersonen == 1 || aantalPersonen == 2 || aantalPersonen == 3 || aantalPersonen == 4)) {
                System.err.println("Dat is niet een geldig aantal personen. Kies 1 tot 4.");
            } else {
                //reserveringsMaker.nextLine();
                String naam = vraagKlantOmStringInput("Onder welke naam wilt u de reservering maken?");
                String reserveringsDagString = vraagKlantOmStringInput("U kunt reserveren voor vandaag of morgen. Wilt u voor vandaag of morgen reserveren?");
                LocalDate reserveringsDagDateTime = LocalDate.parse(reserveringsDagString);
                String gekozenMaaltijd = vraagKlantOmStringInput("Wilt u voor lunch of voor diner reserveren?");
                if (!(gekozenMaaltijd.equalsIgnoreCase("lunch") || gekozenMaaltijd.equalsIgnoreCase("diner"))) {
                    System.err.println("Sorry, dat was geen valide optie. Probeer het nog eens.");
                    // Exception inbouwen maaltijdkeuze
                } else if (gekozenMaaltijd.equalsIgnoreCase("lunch")) {
                    System.out.println("U kunt om 12, 2, of 4 uur reserveren. Welk tijdsslot wilt u reserveren?");
                    gekozenTijdsslot = reserveringsMaker.nextInt();
                    // Exception inbouwen tijden; exception tijd is vol
                    //System.out.println("U heeft gekozen voor een lunch op " + reserveringsDag + " om " + gekozenTijdsslot + " uur met " + aantalPersonen + " personen. Tot dan!");
                } else if (gekozenMaaltijd.equalsIgnoreCase("diner")) {
                    System.out.println("U kunt om 6 of om 8 uur reserveren. Welk tijddslot wilt u reserveren?");
                    gekozenTijdsslot = reserveringsMaker.nextInt();
                    // Exception inbouwen tijden; exception tijd is vol
                }
                System.out.println("U heeft gekozen voor een " + gekozenMaaltijd + " " + reserveringsDagString + " om " + gekozenTijdsslot + " uur met " + aantalPersonen + " personen. Tot dan, " + naam + "!");
                Reservering reservering = new Reservering(reserveringsDagDateTime, gekozenLocatie, gekozenMaaltijd, gekozenTijdsslot);
            }
        }

        // return reserveringsTracker(vandaag, gekozenLocatie, gekozenMaaltijd, gekozenTijdsslot);

    }

}



