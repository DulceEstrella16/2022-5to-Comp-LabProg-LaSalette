package evaluacion;

import java.util.Scanner;

public class Evaluacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Sueldo = sc.nextInt();
                Impuestos = sc.nextInt();
                Constructor c1 = new Constructor(Nombre, Domicilio, Telefono, DNI, Sueldo, Impuestos);
            case 2:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese horas_trabajadas\n Ingrese el constructor que esta a cargo\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                horas_trabajadas = sc.nextInt();
                Const_cargo = sc.nextLine();
                Operador o1 = new Operador(Nombre, Domicilio, Telefono, DNI, horas_trabajadas, Const_cargo);
            case 3:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese las Horas trabajadas\n Ingrese Tarifa\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Horas_trabajadas = sc.nextInt();
                Tarifa = sc.nextInt();
                Consultor i1 = new Consultor(Nombre, Domicilio, Telefono, DNI, Horas_trabajadas, Tarifa);
            
        }
        System.out.println("Ingrese 1 si quiere ingresaR un constructor\n Ingrese 2 si quiere ingresar un operador\n Ingrese 3 si quiere ingresar un consultor");
      
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese Sueldo\n Ingrese Impuestos ");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Sueldo = sc.nextInt();
                Impuestos = sc.nextInt();
                Constructor c2 = new Constructor(Nombre, Domicilio, Telefono, DNI, Sueldo, Impuestos);
            case 2:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese horas_trabajadas\n Ingrese el constructor que esta a cargo\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                horas_trabajadas = sc.nextInt();
                Const_cargo = sc.nextLine();
                Operador o2 = new Operador(Nombre, Domicilio, Telefono, DNI, horas_trabajadas, Const_cargo);
            case 3:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese las Horas trabajadas\n Ingrese Tarifa\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Horas_trabajadas = sc.nextInt();
                Tarifa = sc.nextInt();
                Consultor i2 = new Consultor(Nombre, Domicilio, Telefono, DNI, Horas_trabajadas, Tarifa);
            
        }
        System.out.println("Ingrese 1 si quiere ingresaR un constructor\n Ingrese 2 si quiere ingresar un operador\n Ingrese 3 si quiere ingresar un consultor");
        
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese Sueldo\n Ingrese Impuestos ");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Sueldo = sc.nextInt();
                Impuestos = sc.nextInt();
                Constructor c3 = new Constructor(Nombre, Domicilio, Telefono, DNI, Sueldo, Impuestos);
            case 2:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese horas_trabajadas\n Ingrese el constructor que esta a cargo\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                horas_trabajadas = sc.nextInt();
                Const_cargo = sc.nextLine();
                Operador o3 = new Operador(Nombre, Domicilio, Telefono, DNI, horas_trabajadas, Const_cargo);
            case 3:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese las Horas trabajadas\n Ingrese Tarifa\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Horas_trabajadas = sc.nextInt();
                Tarifa = sc.nextInt();
                Consultor i3 = new Consultor(Nombre, Domicilio, Telefono, DNI, Horas_trabajadas, Tarifa);
            
        }
        System.out.println("Ingrese 1 si quiere ingresaR un constructor\n Ingrese 2 si quiere ingresar un operador\n Ingrese 3 si quiere ingresar un consultor");
        
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese Sueldo\n Ingrese Impuestos ");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Sueldo = sc.nextInt();
                Impuestos = sc.nextInt();
                Constructor c4 = new Constructor(Nombre, Domicilio, Telefono, DNI, Sueldo, Impuestos);
            case 2:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese horas_trabajadas\n Ingrese el constructor que esta a cargo\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                horas_trabajadas = sc.nextInt();
                Const_cargo = sc.nextLine();
                Operador o4 = new Operador(Nombre, Domicilio, Telefono, DNI, horas_trabajadas, Const_cargo);
            case 3:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese las Horas trabajadas\n Ingrese Tarifa\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Horas_trabajadas = sc.nextInt();
                Tarifa = sc.nextInt();
                Consultor i4 = new Consultor(Nombre, Domicilio, Telefono, DNI, Horas_trabajadas, Tarifa);
            
        }
        System.out.println("Ingrese 1 si quiere ingresaR un constructor\n Ingrese 2 si quiere ingresar un operador\n Ingrese 3 si quiere ingresar un consultor");
        
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese Sueldo\n Ingrese Impuestos ");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Sueldo = sc.nextInt();
                Impuestos = sc.nextInt();
                Constructor c5 = new Constructor(Nombre, Domicilio, Telefono, DNI, Sueldo, Impuestos);
            case 2:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese horas_trabajadas\n Ingrese el constructor que esta a cargo\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                horas_trabajadas = sc.nextInt();
                Const_cargo = sc.nextLine();
                Operador o5 = new Operador(Nombre, Domicilio, Telefono, DNI, horas_trabajadas, Const_cargo);
            case 3:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese las Horas trabajadas\n Ingrese Tarifa\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Horas_trabajadas = sc.nextInt();
                Tarifa = sc.nextInt();
                Consultor i5 = new Consultor(Nombre, Domicilio, Telefono, DNI, Horas_trabajadas, Tarifa);
            
        }
        System.out.println("Ingrese 1 si quiere ingresaR un constructor\n Ingrese 2 si quiere ingresar un operador\n Ingrese 3 si quiere ingresar un consultor");
        
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese Sueldo\n Ingrese Impuestos ");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Sueldo = sc.nextInt();
                Impuestos = sc.nextInt();
                Constructor c6 = new Constructor(Nombre, Domicilio, Telefono, DNI, Sueldo, Impuestos);
            case 2:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese horas_trabajadas\n Ingrese el constructor que esta a cargo\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                horas_trabajadas = sc.nextInt();
                Const_cargo = sc.nextLine();
                Operador o6 = new Operador(Nombre, Domicilio, Telefono, DNI, horas_trabajadas, Const_cargo);
            case 3:
                System.out.println("Ingrese el Nombre:\n Ingrese Domicilio:\n Ingrese el Telefono\n Ingrese DNI\n Ingrese las Horas trabajadas\n Ingrese Tarifa\n");
                Nombre = sc.nextLine();
                Domicilio = sc.nextLine();
                Telefono = sc.nextInt();
                DNI = sc.nextInt();
                Horas_trabajadas = sc.nextInt();
                Tarifa = sc.nextInt();
                Consultor i6 = new Consultor(Nombre, Domicilio, Telefono, DNI, Horas_trabajadas, Tarifa);  
        }
        
    }
    
}
