package pruebaherencia;

public class PruebaHerencia {

    public static void main(String[] args) {
        //Scanner sc = new Scanner ();
        Constructor T1 = new Constructor(10000, 22, "Jose", "Lugones y deheza", 1156894574, 46521212);
        Constructor T2 = new Constructor(25500, 30, "Benicio", "Roque Perez y Ruiz Huidobro", 1122334444, 32222444);
        Consultor T3 = new Consultor(9, 10.0, "Mariana", "Zapiola y Ruiz HUidobro", 1156562323, 22563232);
        Consultor T4 = new Consultor(8, 12.0, "Azul", "Laprida y Guemes", 1144778822, 365485459);
        Operario T5 = new Operario(T1.getNombre(), 10, "Belen", "Superi y Bolivia", 1123564789, 29456456);
        Operario T6 = new Operario(T2.getNombre(), 13, "Marcelo", "Balvin y Miller", 1122366956, 33265562);

        if (T3.monto_mensual() < T4.monto_mensual()) {
            System.out.println("El consultor que trabaja mas horas es: "+ T4.getNombre() );        
            }else { 
            System.out.println("El consultor que trabaja mas horas es: "+ T3.getNombre());
                                  
     }
        System.out.println( "Nombre:"+T5.getNombre()+ "Salario:"+ T5.monto_mensual());
        System.out.println("Nombre:"+T6.getNombre() + "Salario" +T6.monto_mensual());
    }
    
}
