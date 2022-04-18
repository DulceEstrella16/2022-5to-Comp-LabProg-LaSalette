
package evaluacion;

public class Consultor {
    String Nombre;
    String Domicilio;
    int Telefono;
    int DNI;
    int Horas_trabajadas;
    int Tarifa;

    public Consultor(String Nombre, String Domicilio, int Telefono, int DNI, int Horas_trabajadas, int Tarifa) {
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
        this.DNI = DNI;
        this.Horas_trabajadas = Horas_trabajadas;
        this.Tarifa = Tarifa;
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

    public int getHoras_trabajadas() {
        return Horas_trabajadas;
    }

    public void setHoras_trabajadas(int Horas_trabajadas) {
        this.Horas_trabajadas = Horas_trabajadas;
    }

    public int getTarifa() {
        return Tarifa;
    }

    public void setTarifa(int Tarifa) {
        this.Tarifa = Tarifa;
    }
    
    
}      
   