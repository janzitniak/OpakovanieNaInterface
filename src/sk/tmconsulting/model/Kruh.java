package sk.tmconsulting.model;

public class Kruh implements Tvar {
    private double priemer;

    public double getPriemer() {
        return priemer;
    }

    public void setPriemer(double priemer) {
        this.priemer = priemer;
    }

    @Override
    public double vypocitajObvod() {
        return 2*(priemer/2)*Math.PI;
    }

    @Override
    public double vypocitajObsah() {
        return (priemer / 2) * (priemer / 2) * Math.PI; // (priemer / 2)^2 * PI
    }

    @Override
    public void kresli() {
        System.out.println("Vykreslil som Kruh");
    }
}
