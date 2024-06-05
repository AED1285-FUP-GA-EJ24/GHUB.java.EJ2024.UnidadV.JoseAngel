package calcularSalario2;
import java.util.Scanner;

public class CalcularSalario2 {
    public static void calcularSalario2() {
        Scanner teclado = new Scanner(System.in);
        final int CENTINELA = -9;
        int i = 0; // Inicializamos i en 0
        double aumento, nuevoSalario, salarioActual, aumentoTotal=0;
        double[][] empleados = new double[1000][3]; //Matriz para 1000 empleados (se puede modificar para mas empleados)

        while (true) { //While que preguntara el salario y verificara si queremos terminar de preguntar
            System.out.println("Ingrese el salario actual del empleado " + (i + 1) + " (-9 para terminar): ");
             salarioActual = teclado.nextDouble();
            if (salarioActual == CENTINELA)
                break;
            

           //Se realiza casos si es 9000 para otorgarle el aumento de 0.2 y asi sucesivamente
            if (salarioActual <= 9000) {
                aumento = 0.2;
            } else if (salarioActual <= 15000) {
                aumento = 0.1;
            } else if (salarioActual <= 20000) {
                aumento = 0.05;
            } else {
                aumento = 0;
            }

            nuevoSalario = salarioActual + (salarioActual * aumento); //Se saca el nuevo salario del empleado multiplicando primero
            // el aumento con su salario normal, para luego sumarlo y tener su nuevo salario
            System.out.println("El aumento es: $" + salarioActual * aumento); // Muestra su aumento
            System.out.println("El nuevo salario del empleado es: $" + nuevoSalario); //Y aqui muestra su nuevo salario
            aumentoTotal += salarioActual * aumento; // Multiplicara su aumento con SA para guardarlo con el aumento total 
            //que estara ciclando o iterando cada empleado puesto

            // Almacenamos los datos en la matriz
            empleados[i][0] = salarioActual;
            empleados[i][1] = aumento;
            empleados[i][2] = nuevoSalario;

            i++;
        }

        // Mostramos la matriz con los datos de los empleados
        System.out.println("\nDatos de los empleados:");
        System.out.println("Empleado\tSalario Actual\t\tAumento\t\tNuevo Salario");
        for (int j = 0; j < i; j++) { //Ciclo donde mostrara cada empleado puesto anteriormente
            System.out.printf("%d\t\t$%.2f\t\t$%.2f\t\t$%.2f\n", j + 1, empleados[j][0], empleados[j][1], empleados[j][2]);
        }//Y aqui mostrara "%d" la posicion del empleado, "%.2f" donde estaran los valores de SA, Aumento y NS con 2 decimales.

        System.out.println("\nEl aumento total de todos los empleados fue = $" + aumentoTotal);// Y por ultimo suma total del aumento
        teclado.close();
    }
    
}

