//DateTime includeren
//Scanner voor invoer vanuit console
//Relaten aan persoon, tafel, locatie

import java.util.ArrayList;
import java.util.List;

public class Reservering {
    int reserveringsNummer;
    int tijdsSlot;
    String naam;
    int aantalPersonen;
    Tafel tafel;
    private List<Reservering> reserveringList;


    public Reservering(int reserveringsNummer, int tijdsSlot, String naam, int aantalPersonen, Tafel tafel){
        setReserveringsNummer(this.reserveringsNummer);;
        setTijdsslot(tijdsSlot);
        setNaam(naam);
        setAantalPersonen(aantalPersonen);
        setTafel(tafel);
        this.reserveringList = new ArrayList<>();


    }

    public void add(Reservering reservering) {
        this.reserveringList.add(reservering);
    }

    public Reservering reserveren(int reserveringsNummer, int tijdsSlot, String naam, int aantalPersonen, Tafel tafel) {



        //List<Tafel> beschikbareTafels = zoekBeschikbareTafels(datumTijd,aantalPersonen);

       // if(beschikbareTafels.size() > 0){
            //Tafel tafel = beschikbareTafels.get(0);
            Reservering reservering = new Reservering(reserveringsNummer, tijdsSlot, naam, aantalPersonen, tafel);
            reservering.setTafel(tafel);
            reservering.add(reservering);
            return reservering;
        }
        //throw new ReserveringCreatieException(String.format("Geen geschikte tafel gevonden voor %d personen op %s om %d",aantalPersonen,datumTijd.getDayOfWeek(),datumTijd.getHour()));

    //}


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
