package evaluacion;

import java.util.Scanner;

public class Evaluacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Consultor i1 = new Consultor("", "", 0, 0, 0, 0);
        Consultor i2 = new Consultor("", "", 0, 0, 0, 0);
        Consultor i3 = new Consultor("", "", 0, 0, 0, 0);
        Consultor i4 = new Consultor("", "", 0, 0, 0, 0);
        Consultor i5 = new Consultor("", "", 0, 0, 0, 0);
        Consultor i6 = new Consultor("", "", 0, 0, 0, 0);
        
        String Nombre;
        String Domicilio;
        int Telefono;
        int DNI;
        int Sueldo;
        int Impuestos;
        int horas_trabajadas;
        String Const_cargo;
        int Horas_trabajadas;
        int Tarifa;

        System.out.println("Ingrese 1 si quiere ingresaR un constructor\n Ingrese 2 si quiere ingresar un operador\n Ingrese 3 si quiere ingresar un consultor");
        int opcion;
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese Sueldo\n Ingrese Impuestos ");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Sueldo = sc.nextInt();
                Impuestos = sc.nextInt();
                Constructor c1 = new Constructor(Nombre, Domicilio, Telefono, DNI, Sueldo, Impuestos);
            case 2:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese horas_trabajadas\n Ingrese el constructor que esta a cargo\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                horas_trabajadas = sc.nextInt();
                Const_cargo = sc.nextLine();
                Operador o1 = new Operador(Nombre, Domicilio, Telefono, DNI, horas_trabajadas, Const_cargo);
            case 3:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese las Horas trabajadas\n Ingrese Tarifa\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Horas_trabajadas = sc.nextInt();
                Tarifa = sc.nextInt();
                i1.setNombre(Nombre);
                i1.setDomicilio(Domicilio);
                i1.setTelefono(Telefono);
                i1.setDNI(DNI);
                i1.setHoras_trabajadas(Horas_trabajadas);
               i1.setTarifa(Tarifa);
             
                //Consultor i1 = new Consultor(Nombre, Domicilio, Telefono, DNI, Horas_trabajadas, Tarifa);
            
        }
        System.out.println("Ingrese 1 si quiere ingresar un constructor\n Ingrese 2 si quiere ingresar un operador\n Ingrese 3 si quiere ingresar un consultor");
      
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese Sueldo\n Ingrese Impuestos ");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Sueldo = sc.nextInt();
                Impuestos = sc.nextInt();
                Constructor c2 = new Constructor(Nombre, Domicilio, Telefono, DNI, Sueldo, Impuestos);
            case 2:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese horas_trabajadas\n Ingrese el constructor que esta a cargo\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                horas_trabajadas = sc.nextInt();
                Const_cargo = sc.nextLine();
                Operador o2 = new Operador(Nombre, Domicilio, Telefono, DNI, horas_trabajadas, Const_cargo);
            case 3:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese las Horas trabajadas\n Ingrese Tarifa\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Horas_trabajadas = sc.nextInt();
                Tarifa = sc.nextInt();
                i2.setNombre(Nombre);
                i2.setDomicilio(Domicilio);
                i2.setTelefono(Telefono);
                i2.setDNI(DNI);
                i2.setHoras_trabajadas(Horas_trabajadas);
                i2.setTarifa(Tarifa);
                //Consultor i2 = new Consultor(Nombre, Domicilio, Telefono, DNI, Horas_trabajadas, Tarifa);
            
        }
        System.out.println("Ingrese 1 si quiere ingresaR un constructor\n Ingrese 2 si quiere ingresar un operador\n Ingrese 3 si quiere ingresar un consultor");
        
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese Sueldo\n Ingrese Impuestos ");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Sueldo = sc.nextInt();
                Impuestos = sc.nextInt();
                Constructor c3 = new Constructor(Nombre, Domicilio, Telefono, DNI, Sueldo, Impuestos);
            case 2:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese horas_trabajadas\n Ingrese el constructor que esta a cargo\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                horas_trabajadas = sc.nextInt();
                Const_cargo = sc.nextLine();
                Operador o3 = new Operador(Nombre, Domicilio, Telefono, DNI, horas_trabajadas, Const_cargo);
            case 3:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese las Horas trabajadas\n Ingrese Tarifa\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Horas_trabajadas = sc.nextInt();
                Tarifa = sc.nextInt();
                i3.setNombre(Nombre);
                i3.setDomicilio(Domicilio);
                i3.setTelefono(Telefono);
                i3.setDNI(DNI);
                i3.setHoras_trabajadas(Horas_trabajadas);
                i3.setTarifa(Tarifa);
                //Consultor i3 = new Consultor(Nombre, Domicilio, Telefono, DNI, Horas_trabajadas, Tarifa);
            
        }
        System.out.println("Ingrese 1 si quiere ingresaR un constructor\n Ingrese 2 si quiere ingresar un operador\n Ingrese 3 si quiere ingresar un consultor");
        
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese Sueldo\n Ingrese Impuestos ");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Sueldo = sc.nextInt();
                Impuestos = sc.nextInt();
                Constructor c4 = new Constructor(Nombre, Domicilio, Telefono, DNI, Sueldo, Impuestos);
            case 2:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese horas_trabajadas\n Ingrese el constructor que esta a cargo\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                horas_trabajadas = sc.nextInt();
                Const_cargo = sc.nextLine();
                Operador o4 = new Operador(Nombre, Domicilio, Telefono, DNI, horas_trabajadas, Const_cargo);
            case 3:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese las Horas trabajadas\n Ingrese Tarifa\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Horas_trabajadas = sc.nextInt();
                Tarifa = sc.nextInt();
                i4.setNombre(Nombre);
                i4.setDomicilio(Domicilio);
                i4.setTelefono(Telefono);
                i4.setDNI(DNI);
                i4.setHoras_trabajadas(Horas_trabajadas);
                i4.setTarifa(Tarifa);
               // Consultor i4 = new Consultor(Nombre, Domicilio, Telefono, DNI, Horas_trabajadas, Tarifa);
            
        }
        System.out.println("Ingrese 1 si quiere ingresaR un constructor\n Ingrese 2 si quiere ingresar un operador\n Ingrese 3 si quiere ingresar un consultor");
        
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese Sueldo\n Ingrese Impuestos ");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Sueldo = sc.nextInt();
                Impuestos = sc.nextInt();
                Constructor c5 = new Constructor(Nombre, Domicilio, Telefono, DNI, Sueldo, Impuestos);
            case 2:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese horas_trabajadas\n Ingrese el constructor que esta a cargo\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                horas_trabajadas = sc.nextInt();
                Const_cargo = sc.nextLine();
                Operador o5 = new Operador(Nombre, Domicilio, Telefono, DNI, horas_trabajadas, Const_cargo);
            case 3:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese las Horas trabajadas\n Ingrese Tarifa\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Horas_trabajadas = sc.nextInt();
                Tarifa = sc.nextInt();
                i5.setNombre(Nombre);
                i5.setDomicilio(Domicilio);
                i5.setTelefono(Telefono);
                i5.setDNI(DNI);
                i5.setHoras_trabajadas(Horas_trabajadas);
                i5.setTarifa(Tarifa);
               // Consultor i5 = new Consultor(Nombre, Domicilio, Telefono, DNI, Horas_trabajadas, Tarifa);
            
        }
        System.out.println("Ingrese 1 si quiere ingresaR un constructor\n Ingrese 2 si quiere ingresar un operador\n Ingrese 3 si quiere ingresar un consultor");
        
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese Sueldo\n Ingrese Impuestos ");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Sueldo = sc.nextInt();
                Impuestos = sc.nextInt();
                Constructor c6 = new Constructor(Nombre, Domicilio, Telefono, DNI, Sueldo, Impuestos);
            case 2:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese horas_trabajadas\n Ingrese el constructor que esta a cargo\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                horas_trabajadas = sc.nextInt();
                Const_cargo = sc.nextLine();
                Operador o6 = new Operador(Nombre, Domicilio, Telefono, DNI, horas_trabajadas, Const_cargo);
            case 3:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese las Horas trabajadas\n Ingrese Tarifa\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Horas_trabajadas = sc.nextInt();
                Tarifa = sc.nextInt();
                i6.setNombre(Nombre);
                i6.setDomicilio(Domicilio);
                i6.setTelefono(Telefono);
                i6.setDNI(DNI);
                i6.setHoras_trabajadas(Horas_trabajadas);
                i6.setTarifa(Tarifa);
                //Consultor i6 = new Consultor(Nombre, Domicilio, Telefono, DNI, Horas_trabajadas, Tarifa);  
        }
       
        String max;
        if (i1.getHoras_trabajadas()>i2.getHoras_trabajadas() && i1.getHoras_trabajadas()>i3.getHoras_trabajadas() && i1.getHoras_trabajadas()>i4.getHoras_trabajadas() && i1.getHoras_trabajadas()>i5.getHoras_trabajadas() && i1.getHoras_trabajadas()>i6.getHoras_trabajadas()){
            max=i1.getNombre();
        }else if(i2.getHoras_trabajadas()>i3.getHoras_trabajadas() && i2.getHoras_trabajadas()>i4.getHoras_trabajadas() && i2.getHoras_trabajadas()>i5.getHoras_trabajadas() && i2.getHoras_trabajadas()>i6.getHoras_trabajadas()){
            max=i2.getNombre();
        }else if(i3.getHoras_trabajadas()>i4.getHoras_trabajadas() && i3.getHoras_trabajadas()>i5.getHoras_trabajadas() && i3.getHoras_trabajadas()>i6.getHoras_trabajadas()){
            max=i3.getNombre();   
        }else if (i4.getHoras_trabajadas()>i5.getHoras_trabajadas() && i4.getHoras_trabajadas()>i6.getHoras_trabajadas()){
            max=i4.getNombre();
        }else if (i5.getHoras_trabajadas()>i6.getHoras_trabajadas()){
            max=i5.getNombre();
        }else max=i6.getNombre();
        
            System.out.println("El consultor que trabaja mas horas es:"+ max);  
      
}
}
