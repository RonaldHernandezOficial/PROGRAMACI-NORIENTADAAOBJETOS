package figurasGeometricas;

import java.util.Scanner;

public class cuadrado extends Figura {

    //Crear los atributos
    private float lado;
    private float area;

    public void calcularArea(){
        //Instanciar clases
        Scanner lectura=new Scanner(System.in);

        float area = (lado * lado);

        System.out.println("Por favor ingresa el valor de uno de los lados del cuadrado: ");
        lado = lectura.nextFloat();

        //Operación
        area = (float) Math.pow(lado, 2);

        System.out.println("El lado del cuadrado es: " + lado + " el área es: " + area);
        
        //Limpiar el buffer
        lectura.close();
    }
}
