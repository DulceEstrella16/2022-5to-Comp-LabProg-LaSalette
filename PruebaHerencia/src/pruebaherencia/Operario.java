package pruebaherencia;

public class Operario extends Persona {

    protected String constructor_cargo;
    protected int horas_trabajadas;

    public Operario(String constructor_cargo, int horas_trabajadas, String nombre, String domicilio, int telefono, int dni) {
        super(nombre, domicilio, telefono, dni);
        this.constructor_cargo = constructor_cargo;
        this.horas_trabajadas = horas_trabajadas;
    }

    public String getConstructor_cargo() {
        return constructor_cargo;
    }

    public void setConstructor_cargo(String constructor_cargo) {
        this.constructor_cargo = constructor_cargo;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public double monto_mensual() {
        return horas_trabajadas * 50;

    }

}
