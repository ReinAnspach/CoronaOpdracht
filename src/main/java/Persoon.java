//Arraylist maken
//Relaten aan reservering, tafel

public class Persoon {
    int ID;
    String naamPersoon;
    static int aantalPersonen;


    public Persoon(int ID, String naamPersoon) {
        this.ID = ID;
        this.naamPersoon = naamPersoon;
        aantalPersonen++;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setNaamPersoon(String naamPersoon) {
        this.naamPersoon = naamPersoon;
    }

    public String getNaamPersoon(){
        return naamPersoon;
    }

    public static int getAantalPersonen() {
        return aantalPersonen;
    }

    public void setAantalPersonen(int aantalPersonen) {
        this.aantalPersonen = aantalPersonen;
    }
}
