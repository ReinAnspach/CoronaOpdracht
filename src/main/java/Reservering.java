//DateTime includeren
//Scanner voor invoer vanuit console
//Relaten aan persoon, tafel, locatie

public class Reservering {
    int reserveringsNummer;
    int tijdsSlot;
    String naam;
    int aantalPersonen;
    Tafel tafel;


    public Reservering(int reserveringsNummer, int tijdsSlot, String naam, int aantalPersonen, Tafel tafel){
        setReserveringsNummer(this.reserveringsNummer);;
        setTijdsslot(tijdsSlot);
        setNaam(naam);
        setAantalPersonen(aantalPersonen);
        setTafel(tafel);


    }


    private void setReserveringsNummer(int reserveringsNummer) {
    }

    private int getReserveringsnummer(){
        return this.reserveringsNummer;
    }

    private void setTijdsslot(int tijdsSlot) {
    }

    private int getTijdsslot(){
        return tijdsSlot;
    }

    private void setNaam(String naam) {
    }

    private String getNaam(){
        return naam;
    }

    private void setAantalPersonen(int aantalPersonen) {
    }

    private int getAantalPersonen(){
        return aantalPersonen;
    }

    private void setTafel(Tafel tafel) {
    }

    private Tafel getTafel(){
        return this.tafel;
    }

}
