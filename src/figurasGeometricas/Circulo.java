package figurasGeometricas;

import java.util.Scanner;

public class Circulo extends Figura {
    //Crear los atributos
    private float radio;
    private double area;

    public void calcularArea(){
        //Instanciar clases
        Scanner lectura=new Scanner(System.in);

        System.out.println("Por favor ingresa el tamaño del radio del circulo: ");
        radio = lectura.nextInt();

        //Operación
        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El tamaño del radio es: " + radio + " el área del circulo es: " + area);
        
        //Limpiar el buffer
        lectura.close();
    }
}
