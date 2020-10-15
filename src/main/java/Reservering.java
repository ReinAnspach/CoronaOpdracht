//DateTime includeren
//Scanner voor invoer vanuit console
//Relaten aan persoon, tafel, locatie

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reservering {
    int reserveringsNummer;
    int tijdsSlot;
    String opNaamVan;
    int aantalPersonen;
    Tafel tafel;
    int nextTafelNr = 1;
    int nextResNr = 1;
    private List<Reservering> reserveringList;


    public Reservering(LocalDate reserveringsDag, String gekozenLocatie,String gekozenMaaltijd, int gekozenTijdsslot){
        setReserveringsNummer(this.reserveringsNummer);
        setTijdsslot(gekozenTijdsslot);
        setOpNaamVan(opNaamVan);
        setAantalPersonen(aantalPersonen);
        this.reserveringList = new ArrayList<>();


    }

    Reservering reserveringsTracker(LocalDate reserveringsDag, String gekozenLocatie, String gekozenMaaltijd, int gekozenTijdsslot) {
        String reseveringsNummer = "Reserveringsnummer: " + nextResNr;
        int tafelNummer = nextTafelNr;
        Reservering reservering = new Reservering(reserveringsDag, gekozenLocatie, gekozenMaaltijd, gekozenTijdsslot);
        nextResNr++;
        nextTafelNr++;
        reservering.add(reservering);
        return reservering;
    }

    public void add(Reservering reservering) {
        this.reserveringList.add(reservering);
    }

    //public Reservering reserveren(int nextResNr, int tijdsSlot, String naam, int aantalPersonen, Tafel tafel) {



        //List<Tafel> beschikbareTafels = zoekBeschikbareTafels(datumTijd,aantalPersonen);

       // if(beschikbareTafels.size() > 0){
            //Tafel tafel = beschikbareTafels.get(0);
            //Reservering reservering = new Reservering(nextResNr, tijdsSlot, naam, aantalPersonen, tafel);
            //reservering.setTafel(tafel);
            //reservering.add(reservering);
            //return reservering;
        //}
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

    private void setOpNaamVan(String opNaamVan) {
    }

    private String getOpNaamVan(){
        return opNaamVan;
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
