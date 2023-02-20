import sk.tmconsulting.model.GrafickeRozhranie;
import sk.tmconsulting.model.KalkulackaNa2Cisla;

public class KalkulackaAplikacia implements KalkulackaNa2Cisla, GrafickeRozhranie {

    public static void main(String[] args) {
        KalkulackaAplikacia kalkulackaAplikaciaObjekt = new KalkulackaAplikacia();
        System.out.println(kalkulackaAplikaciaObjekt.scitanie(2, 1.5));
    }


    @Override
    public double scitanie(double cislo1, double cislo2) {
        return cislo1 + cislo2; // implementacia metody scitanie, cize sucet premennych cislo1 a cislo2
    }

    @Override
    public double odcitanie(double cislo1, double cislo2) {
        return cislo1 - cislo2;
    }

    @Override
    public double nasobenie(double cislo1, double cislo2) {
        return cislo1 * cislo2;
    }

    @Override
    public double delenie(double cislo1, double cislo2) {
        return cislo1 / cislo2;
    }

    @Override
    public void vypisVysledok() {

    }


    @Override
    public double sin(double cislo1) {
        return 0;
    }

    @Override
    public double cos(double cislo1) {
        return 0;
    }

    @Override
    public void nastavPozadie() {

    }

    @Override
    public void nastavFarbuAplikacie(String farba) {

    }

    @Override
    public void zapniSa() {

    }

    @Override
    public void vypnisSa() {

    }
}
