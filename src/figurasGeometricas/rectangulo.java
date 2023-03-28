package figurasGeometricas;

import java.util.Scanner;

public class rectangulo extends Figura{
    //Crear los atributos
    private float base;
    private float altura;
    private float area;

    public void calcularArea(){
        //Instnaciar clases
        Scanner lectura = new Scanner(System.in);

        System.out.println("Por favor ingresa la base del rectángulo: ");
        base = lectura.nextFloat();

        System.out.println("Por favor ingresa la altura del rectángulo: ");
        altura = lectura.nextFloat();

        float area = (base * altura);

        System.out.println("La base del rectángulo es: " + base + " la altura del rectángulo es: " + altura + " el área del rectá   ngulo es: " + area);

        //Limpiar el buffer
        lectura.close();
    }
}
