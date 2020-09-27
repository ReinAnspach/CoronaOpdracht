import org.junit.jupiter.api.Test;

public class LocatieTest {

Locatie cafe = new Locatie("Cafe", 5,10);
Locatie restaurant = new Locatie("Restaurant", 8, 24);
//Locatie bar = new Locatie("Bar", 2, 3);
Locatie terras = new Locatie("Terras", 20,60);



@Test
    void testAantalGastenBar(){

    Locatie bar = new Locatie("Bar", 2, 3);
    Persoon anna = new Persoon(1, "Anna");
    Persoon bas = new Persoon(2, "Bas");
    Persoon coen = new Persoon(3, "Coen");

    if (Persoon.getAantalPersonen() >= bar.getMaxAantalPersonen()) {
        System.out.println("Sorry, we zitten vol.");
    } else {
        System.out.println("Kom binnen.");
    }

}




}
