package pruebaherencia;

public class Constructor extends Persona {

    protected int sueldo;
    protected int impuestos;

    public Constructor(int sueldo, int impuestos, String nombre, String domicilio, int telefono, int dni) {
        super(nombre, domicilio, telefono, dni);
        this.sueldo = sueldo;
        this.impuestos = impuestos;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(int impuestos) {
        this.impuestos = impuestos;
    }

    public double monto_mensual() {
        return sueldo - impuestos;

    }

}
