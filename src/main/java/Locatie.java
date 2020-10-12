public class Locatie {
    private String naamLocatie;
    private int aantalTafels;
    private static int MAX_AANTAL_PERSONEN = 30;
    private static int MAX_GASTEN_PER_TAFEL = 4;

    public Locatie(String naamLocatie, int aantalTafels){
        this.naamLocatie = naamLocatie;
        this.aantalTafels = aantalTafels;
    }

    public void setNaamLocatie(String naamLocatie) {
        this.naamLocatie = naamLocatie;
    }

    public String getNaamLocatie() {
        return naamLocatie;
    }

    public void setAantalTafels(int aantalTafels) {
        this.aantalTafels = aantalTafels;
    }

    public int getAantalTafels() {
        return aantalTafels;
    }

    public static void setMaxAantalPersonen(int maxAantalPersonen) {
        Locatie.MAX_AANTAL_PERSONEN = maxAantalPersonen;
    }

    public static int getMaxAantalPersonen() {
        return MAX_AANTAL_PERSONEN;
    }
}
