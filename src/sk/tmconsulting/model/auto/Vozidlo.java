package sk.tmconsulting.model.auto;

public class Vozidlo implements VozidloI {
    private String vyrobca;
    private String znacka;
    private String typ;
    private String farba;
    private String spz;
    private int rokVyroby;

    public String getVyrobca() {
        return vyrobca;
    }

    public void setVyrobca(String vyrobca) {
        this.vyrobca = vyrobca;
    }

    public String getZnacka() {
        return znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getFarba() {
        return farba;
    }

    public void setFarba(String farba) {
        this.farba = farba;
    }

    public String getSpz() {
        return spz;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }

    public void setRokVyroby(int rokVyroby) {
        this.rokVyroby = rokVyroby;
    }


    @Override
    public void testujMaximalnuRychlost() {

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
