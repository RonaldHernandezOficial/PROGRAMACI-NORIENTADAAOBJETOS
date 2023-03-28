package salud;

import java.util.Scanner;

public class Empleado extends persona {
    //Crear los atributos
    private String cargo;
    private double valorHora;
    private int horasTrabajadas;
    private String departamento;

    Scanner lectura=new Scanner(System.in);

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }
    public void setValorHora(double valorhora) {
        this.valorHora = valorhora;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setHorasTrabajadas(int horastrabajadas) {
        this.horasTrabajadas = horastrabajadas;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }
    public double calcularHonorarios() {
        double honorarios = valorHora * horasTrabajadas;
        honorarios = honorarios - (honorarios * 0.00966);
        return honorarios;
    }
    public void setEmpleadoDatos(String cargo, double valorHora, int horasTrabajadas, String departamento) {
        setCargo(cargo);
        setValorHora(valorHora);
        setHorasTrabajadas(horasTrabajadas);
        setDepartamento(departamento);
    }
    public void pedirDatosEmpleados(){

        System.out.println("Por favor ingresa tu tipo de documento: ");
        setTipoDoc(lectura.nextLine());

        System.out.println("Por favor ingresa tu número de documento: ");
        setDocumento(lectura.nextInt());
        
        System.out.println("Por favor ingresa tu nombre: ");
        setNombre(lectura.next());

        System.out.println("Por favor ingresa tu apellido: ");
        setApellido(lectura.next());
        
        System.out.println("Por favor ingresa tu cargo: ");
        setCargo(lectura.next());

        System.out.println("Por favor ingresa el valor de la hora: ");
        setValorHora(lectura.nextDouble());

        System.out.println("Por favor ingresa tus horas trabajadas: ");
        setHorasTrabajadas(lectura.nextInt());

        System.out.println("Por favor ingresa tu departamento: ");
        setDepartamento(lectura.next());
    }

    public void mostrarEmpleado() {
        System.out.println("Tipo de documento: " + getTipoDoc() );

        System.out.println("Número de documento: " + getDocumento() );

        System.out.println("Nombre: " + getNombre() );

        System.out.println("Apellido: " + getApellido() );

        System.out.println("Cargo: " + getCargo() );

        System.out.println("Horas trabajadas: " + getHorasTrabajadas() );

        System.out.println("Valor hora: " + getValorHora() );

        System.out.println("Total a pagar: " + calcularHonorarios() );
    }
}
