/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC01
 */
public class Empleado {

    String nombre;
    double horas;
    double tarifa;

    public Empleado(String nombre, double horas, double tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }

    public double sueldoBruto() {
        if (horas < 40) {
            return horas * tarifa;
        }else{
            horas = horas -40;
            horas = horas* tarifa *1.5;
            horas = horas + 40* tarifa;
        return horas + 40* tarifa;
    }
}
}