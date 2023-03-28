package figurasGeometricas;

import java.util.Scanner;

public class Triangulo extends Figura{
    //Crear los atributos
    private float base;
    private float altura;
    private float area;

    public void calcularArea(){
        //Instanciar clases
        Scanner lectura = new Scanner(System.in);

        System.out.println("Por favor ingresa la base del triángulo: ");
        base = lectura.nextFloat();

        System.out.println("Por favor ingresa la altura del triángulo: ");
        altura = lectura.nextFloat();

        //Operación
        float  area = (base * altura) / 2;
        
        System.out.println("La base del triángulo es: " + base + " la altura del triángulo es: " + altura + " el área del triángulo es: " + area);

        //Limpiar el buffer
        lectura.close();
    }
}
