package sk.tmconsulting.model;

public interface KalkulackaNa2Cisla {
    public double scitanie(double cislo1, double cislo2);
    public double odcitanie(double cislo1, double cislo2);
    public double nasobenie(double cislo1, double cislo2);
    public double delenie(double cislo1, double cislo2);
    public void vypisVysledok();
    public double sin(double cislo1); // metoda sin pre vypocet sinusu
    public double cos(double cislo1); // metoda cos pre vypocet cosinusu
}
