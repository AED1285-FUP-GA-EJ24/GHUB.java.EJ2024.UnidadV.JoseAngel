package miPrincipal;

import calcularSalario2.CalcularSalario2;
import metodoBur.MetodoBur;

import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("**************************************");
            System.out.println("*      MENU DE OPCIONES UNIDAD V     *");
            System.out.println("**************************************");
            System.out.println("* 1) Calcular Salario                *"); 
            System.out.println("* 2) Metodo Burbuja                  *"); 
            

            
            System.out.println("**************************************");
            System.out.println("* 99) Salir                          *"); 
            System.out.println("**************************************");
            System.out.print("Seleccion Opcion:");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                 CalcularSalario2.calcularSalario2();
                   break;
                case 2:
                 MetodoBur.metodoBur();
                  break;
               
                case 99:
                    System.out.println("Hasta luego");
                    break;
                default:
                 System.out.println("Opción inválida");
            }

        }while(opcion != 99);
        entrada.close();
    }
}