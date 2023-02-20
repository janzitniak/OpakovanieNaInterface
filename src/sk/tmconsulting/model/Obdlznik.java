package sk.tmconsulting.model;

public class Obdlznik implements Tvar {

    private double sirka;
    private double vyska;

    public double getSirka() {
        return sirka;
    }

    public void setSirka(double sirka) {
        this.sirka = sirka;
    }

    public double getVyska() {
        return vyska;
    }

    public void setVyska(double vyska) {
        this.vyska = vyska;
    }

    @Override
    public double vypocitajObvod() {
        return 2*(sirka+vyska);
    }

    @Override
    public double vypocitajObsah() {
        return sirka * vyska;
    }

    @Override
    public void kresli() {
        System.out.println("Vykreslil som Obdlznik");
    }

    public static void ukonci() {
        System.out.println("Obdlznik sa ukoncil");
    }

}
