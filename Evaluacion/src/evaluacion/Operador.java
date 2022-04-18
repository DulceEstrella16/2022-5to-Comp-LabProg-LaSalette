
package evaluacion;

public class Operador {
    String Nombre;
    String Domicilio;
    int Telefono;
    int DNI;
    int horas_trabajadas; 
    String Const_cargo;

    public Operador(String Nombre, String Domicilio, int Telefono, int DNI, int horas_trabajadas, String Const_cargo) {
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
        this.DNI = DNI;
        this.horas_trabajadas = horas_trabajadas;
        this.Const_cargo = Const_cargo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int gethoras_trabajadas() {
        return horas_trabajadas;
    }

    public void sethoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public String getConst_cargo() {
        return Const_cargo;
    }

    public void setConst_cargo(String Const_cargo) {
        this.Const_cargo = Const_cargo;
    }
    
}
