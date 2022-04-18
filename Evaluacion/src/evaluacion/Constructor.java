
package evaluacion;
public class Constructor {
    String Nombre;
    String Domicilio;
    int Telefono;
    int DNI;
    int Sueldo;
    int Impuestos;

    public Constructor(String Nombre, String Domicilio, int Telefono, int DNI, int Sueldo, int Impuestos) {
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
        this.DNI = DNI;
        this.Sueldo = Sueldo;
        this.Impuestos = Impuestos;
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

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    public int getImpuestos() {
        return Impuestos;
    }

    public void setImpuestos(int Impuestos) {
        this.Impuestos = Impuestos;
    }
   
   public int Sueldo_mensual (){
       return Sueldo - Impuestos; 
   }
}
