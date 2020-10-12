import java.time.LocalDate;
import java.util.Scanner;

public class ReserveringsManager {
    LocalDate vandaag = LocalDate.now();
    Scanner reserveringsMaker = new Scanner(System.in);

    System.out.println("Welkom. Bij welke locatie wilt u reserveren?");
    String gekozenLocatie = reserveringsMaker.nextLine();
    System.out.println("U heeft gekozen voor de locatie: " + gekozenLocatie);
    System.out.println("Op welke dag wilt u uw reservering plaatsen?");

}
