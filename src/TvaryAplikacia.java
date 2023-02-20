import sk.tmconsulting.model.Kruh;
import sk.tmconsulting.model.Obdlznik;

public class TvaryAplikacia {
    public static void main(String[] args) {
        Obdlznik obdlznikObjekt1 = new Obdlznik(); // vytvorili sme PRAZDNY objekt obdlznik
        obdlznikObjekt1.setSirka(5.3);
        obdlznikObjekt1.setVyska(2);
        System.out.println("Obsah obdlznika: " + obdlznikObjekt1.vypocitajObsah());

        Obdlznik.ukonci(); // staticku metodu zavolame napriamo zadanim nazvu triedy a nazovMetody(), cize Trieda.metoda()

        Kruh kruhObjekt1 = new Kruh();
        kruhObjekt1.setPriemer(2.5);
        System.out.println("Obsah kruhu: " + kruhObjekt1.vypocitajObsah());
    }
}
