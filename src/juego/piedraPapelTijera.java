package juego;

import java.util.Random;
import java.util.Scanner;

public class piedraPapelTijera implements Juego {
    //Crear atributos
    private String nombre;
    private int opcion;
    private int jugador;
    private String cosa;

    //Instanciar clases
    Scanner lectura=new Scanner(System.in);
    Random rand=new Random();

    public void iniciar(){
        System.out.println("¿Quieres jugar al juego de Piedra, Papel o Tijera?");
        System.out.print("Por favor ingresa tu nombre: ");
        nombre = lectura.nextLine();
    }
    public void jugar(){
        System.out.println("Hola, " + nombre + " va a comenzar el juego, prepárate ");

        opcion = rand.nextInt(3) + 1;
        switch(opcion){
            case 1:
                cosa = "Piedra";
                break;
            case 2:
                cosa= "Papel";
                break;
            case 3:
                cosa = "Tijera";
                break;
        }

        System.out.println("Por favor, selecciona una opción: " + " 1. Piedra " + " 2. Papel " + " 3. Tijera");
        jugador = lectura.nextInt();
    }
    public void finalizar(){
        System.out.println("El bot seleccionó: " + cosa);

        if (jugador == opcion) {
            System.out.println("Empate :O");
        } else if (jugador == 1 || opcion == 3 || jugador == 2 || opcion == 1 || jugador == 3 || opcion == 2) {
            System.out.println("Le ganaste al bot :D ");
        } else {
            System.out.println("Te gano el bot :( )");
        }
    }
}
