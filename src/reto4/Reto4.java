package reto4;

import java.util.Scanner;

public class Reto4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcion;
        double costo_boleto = 0.00;
        
        do{
            System.out.println("Indique el tipo de boleto (A: Adulto, N: Niño, I: INAPAM, B: Adulto mayor sin credencial)");
            opcion = sc.next().charAt(0);
            switch(opcion){
                case 'a':
                case 'A':
                    costo_boleto = 100.00;
                    break;
                case 'n':
                case 'N':
                    costo_boleto = 70.00;
                    break;
                case 'i':
                case 'I':
                    costo_boleto = 50.00;
                    break;
                case 'b':
                case 'B':
                    costo_boleto = 70.00;
                    break;
                default:
                    System.out.println("Opcion no disponible...");
                    break;
                
            }
            System.out.println("El costo del boleto es: $" + costo_boleto);
            System.out.println("Desea otro boleto? (s/n)");
            opcion = sc.next().charAt(0);
        }while(opcion != 'n');
        System.out.println("Fin del programa");
    }
    
}
