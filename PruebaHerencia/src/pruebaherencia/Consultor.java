package pruebaherencia;

public class Consultor extends Persona {

    protected int horas_trabajadas;
    protected double tarifa_hora;

    public Consultor(int horas_trabajadas, double tarifa_hora, String nombre, String domicilio, int telefono, int dni) {
        super(nombre, domicilio, telefono, dni);
        this.horas_trabajadas = horas_trabajadas;
        this.tarifa_hora = tarifa_hora;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public double getTarifa_hora() {
        return tarifa_hora;
    }

    public void setTarifa_hora(double tarifa_hora) {
        this.tarifa_hora = tarifa_hora;
    }

    public double monto_mensual() {
        return 0;

    }

}
