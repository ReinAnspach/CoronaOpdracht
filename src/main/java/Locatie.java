public class Locatie {
    private String naamLocatie;
    private int aantalTafels;
    private static int maxAantalPersonen;

    public Locatie(String naamLocatie, int aantalTafels, int maxAantalPersonen){
        this.naamLocatie = naamLocatie;
        this.aantalTafels = aantalTafels;
        this.maxAantalPersonen = maxAantalPersonen;
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
        Locatie.maxAantalPersonen = maxAantalPersonen;
    }

    public static int getMaxAantalPersonen() {
        return maxAantalPersonen;
    }
}
