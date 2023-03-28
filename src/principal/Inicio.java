package principal;

import salud.*;

import java.util.Scanner;

import figurasGeometricas.*;
import juego.piedraPapelTijera;

public class Inicio {
    public static void main(String[] args) {
        //Instanciar clases
        Scanner lectura = new Scanner(System.in);
        
        //Declarar variables
        //Esta variable la declaro para poder usarla en el RETO4
        int opcion;

        //Creando objetos de uso 
        persona persona = new persona();
        Empleado empleado = new Empleado();
        cuadrado cuadrado = new cuadrado();
        Circulo circulo = new Circulo();
        rectangulo rectangulo = new rectangulo();
        Triangulo triangulo = new Triangulo();
        piedraPapelTijera juego = new piedraPapelTijera(); 

        
        //Reto 1

        /* 
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.mayorEdad();
        persona.calcularImc();
        */

        //Reto 2
        
        /*
        //Invocar el metodo calcularImc con las modificaciones
        String estadoPeso = persona.calcularImc();
        if(estadoPeso.equals("Peso bajo")){
            System.out.println("Tu estado es de: " + estadoPeso + ", tienes un peso bajo ");
        }else if(estadoPeso.equals("peso ideal")){
            System.out.println("Tu estado es de: " + estadoPeso + ", tienes el peso ideal ");
        }else if(estadoPeso.equals("Sobre peso")){
            System.out.println("Tu estado es de: " + estadoPeso + ", tienes sobre peso");
        }
        */
        
        //Reto 3
        /*
        empleado.pedirDatosEmpleados();
        empleado.mostrarEmpleado();
        */
        
        //reto 4
        /* 
        System.out.println("Por favor ingresa la opción, que es la figura a la cual deseas conocer su área");

        System.out.println("1. Cuadrado " + " 2. Tríangulo " + " 3. Rectángulo " + " 4. Círculo");
        opcion = lectura.nextInt();

        //Se crea un swicth para seleccionar la opción del área que se quire saber
        switch (opcion) {
            case 1:
                cuadrado.calcularArea();
                break;
            case 2:
                triangulo.calcularArea();
                break;
            case 3:
                rectangulo.calcularArea();
                break;
            case 4:
                circulo.calcularArea();
                break;
        }
        */

        //Reto 5
        /* 
        juego.iniciar();
        juego.jugar();
        juego.finalizar();
        */
    }
}
