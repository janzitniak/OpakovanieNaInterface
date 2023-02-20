package sk.tmconsulting.model.auto;

public class Audi implements VozidloI {

    private boolean luxusnaVybava;

    public boolean isLuxusnaVybava() {
        return luxusnaVybava;
    }

    public void setLuxusnaVybava(boolean luxusnaVybava) {
        this.luxusnaVybava = luxusnaVybava;
    }

    @Override
    public void testujMaximalnuRychlost() {
        System.out.println("Maximálna rýchlosť je");
    }

    @Override
    public void otestujBezpecnost() {

    }

    @Override
    public void otestujSpotrebu() {

    }

    @Override
    public void zaplatEkologickuDan() {

    }

    @Override
    public void nastavVyskuSrotovneho() {

    }
}
