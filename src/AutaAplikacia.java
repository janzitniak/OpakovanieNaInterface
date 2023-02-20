import sk.tmconsulting.model.auto.Audi;
import sk.tmconsulting.model.auto.Skoda;
import sk.tmconsulting.model.auto.Vozidlo;

public class AutaAplikacia {
    public static void main(String[] args) {
        Vozidlo audi1 = new Vozidlo();
        audi1.setFarba("strieborná");
        audi1.setRokVyroby(2000);
        audi1.setSpz("BB101AK");

        audi1.otestujBezpecnost();
        audi1.otestujSpotrebu();
        audi1.testujMaximalnuRychlost();
        audi1.zaplatEkologickuDan();
        audi1.nastavVyskuSrotovneho();


        Vozidlo skoda1 = new Vozidlo();
        skoda1.setFarba("červená");
        skoda1.setRokVyroby(2010);
        skoda1.setSpz("DK456AA");
        skoda1.otestujBezpecnost();
        skoda1.otestujSpotrebu();
        skoda1.testujMaximalnuRychlost();
        skoda1.zaplatEkologickuDan();
        skoda1.nastavVyskuSrotovneho();


        Audi audi2 = new Audi();
        audi2.setLuxusnaVybava(true);
        audi2.otestujBezpecnost();

        Skoda skoda = new Skoda();
        skoda.otestujBezpecnost();

    }
}
