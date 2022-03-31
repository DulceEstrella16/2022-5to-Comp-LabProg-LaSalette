package ejercicio.pkg11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, n, sum = 0, max=0, min=3000;
        //LE PIDE AL USUARIO QUE INGRESE LA CANTIDAD DE VUELTAS QUE VA A DAR EL PROGRAMA
        System.out.println("Ingrese la cantidad de nº a ingresar:");
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese un numero positivo:");
            n = sc.nextInt();
            sum = +n;
            if (n>max){
                max=n;
            }else if(n<min){
                min=n;
            }
            
        }
        sum= max+min;
        System.out.println("la suma del max y min es:" +sum );
    }

}
