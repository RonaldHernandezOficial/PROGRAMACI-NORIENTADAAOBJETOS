package juego;

public interface Juego {
    //Para declarar los métodos, no es necesario definir que sean public o abstract, ya que dentro de una interfaz lo son por defecto. Recuerda definir su nombre pero no su implementación.

    void iniciar();
    void jugar();
    void finalizar();
}
