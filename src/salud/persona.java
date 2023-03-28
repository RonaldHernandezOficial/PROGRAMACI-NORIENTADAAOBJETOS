package salud;

import java.util.Scanner;

public class persona {
    //ESTO ES DEL RETO1 y RETO2

    //Crear los atributos 
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private Double peso;
    private Double estatura;
    private int edad;
    private String sexo;

    //Esta parte de aqui es del RETO1
    
    /* 
    public void pedirDatos(){
    //Instanciamos clases
    Scanner lectura=new Scanner(System.in);

    //pedimos los datos
        System.out.println("Por favor ingresa tu tipo de documento: ");
        tipoDoc = lectura.nextLine;

        System.out.println("Por favor ingresa tu número de documento: ");
        documento = lectura.nextInt; 

        System.out.println("Por favor ingresa tu nombre: ");
        nombre = lectura.next;

        System.out.println("Por favor ingresa tu apellido: ");
        apellido = lectura.next;

        System.out.println("Por favor ingresa tu peso: ");
        peso = lectura.nextDouble;

        System.out.println("Por favor ingresa tu estatura: ");
        estarura = lectura.nextDouble;

        System.out.println("Por favor ingresa tu edad: ");
        edad = lectura.nextInt;

        System.out.println("Por favor ingresa tu sexo: ");
        sexo = lectura.next;
    }

    public void mostrarPersona(){
    //Imprimir los datos ingresados
        System.out.println("Su tipo de documento es: " + tipoDoc);

        System.out.println("Su número de documento es: " + documento);

        System.out.println("Su nombre es: " + nombre);

        System.out.println("Su apellido es: " + apellido);

        System.out.println("Tu peso es de: " + peso + "Kg");

        System.out.println("Tu estatura es de: " + estatura + "Cm");

        System.out.println("Su edad es: " + edad);

        System.out.println("Su sexo es: " + sexo);
    }

    public void mayorEdad(){
    //verificaremos si es mayor de edad
        if(edad >= 18){
            System.out.println("Tu edad es de: " + edad + " eres mayor de edad");
        }else{
            System.out.println("Tu edad es de: " + edad + " eres menor de edad");
        }
    }

    public String calcularImc() {
        Double pesoActual = peso / (estatura * estatura);
    
        if (pesoActual < 20) {
            System.out.println("Tu peso es de: " + peso + ", el peso esta por debajo de lo ideal");
        } else if (pesoActual > 20 && pesoActual <= 25) {
            System.out.println("Tu peso es de: " + peso + ", el peso es ideal");
        } else if (pesoActual > 25) {
              System.out.println("Tu peso es de: " + peso + ", estas en sobrepeso");
        }
    }
    */

    // El método set no retorna valores y requiere como parámetro el valor del atributo

    //El método get siempre genera un valor de retorno del mismo tipo de dato del atributo

    //Crear los Getters y Setters

    //Tipo Documento
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    //Documento
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public int getDocumento() {
        return documento;
    }
    //Nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    //Apellido
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getApellido() {
        return apellido;
    }
    //Peso
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Double getPeso(){
        return peso;
    }
    //Estatura
    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }
    public Double getEstatura() {
        return estatura;
    }
    //Edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    //Sexo
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }

    public void pedirDatos(){
        Scanner lectura=new Scanner(System.in);

        System.out.println("Por favor ingresa tu tipo de documento: ");
        setTipoDoc(lectura.nextLine());

        System.out.println("Por favor ingresa tu número de documento: ");
        setDocumento(lectura.nextInt());

        System.out.println("Por favor ingresa tu nombre: ");
        setNombre(lectura.next());

        System.out.println("Por favor ingresa tu apellido: ");
        setApellido(lectura.next());

        System.out.println("Por favor ingresa tu peso: ");
        setPeso(lectura.nextDouble());

        System.out.println("Por favor ingresa tu estatura: ");
        setEstatura(lectura.nextDouble());

        System.out.println("Por favor ingresa tu edad: ");
        setEdad(lectura.nextInt());

        System.out.println("Por favor ingresa tu sexo: ");
        setSexo(lectura.next());
    }
    public void mostrarPersona(){
        System.out.println("Su tipo de documento es: " + getTipoDoc());

        System.out.println("Su número de documento es: " + getDocumento());

        System.out.println("Su nombre es: " + getNombre());

        System.out.println("Su apellido es: " + getApellido());

        System.out.println("Tu peso es de: " + getPeso() + "Kg");

        System.out.println("Tu estatura es de: " + getEstatura() + "Cm");

        System.out.println("Su edad es: " + getEdad());

        System.out.println("Su sexo es: " + getSexo());
    }
    public void mayorEdad(){
        if(getEdad() >= 18){
            System.out.println("Tu edad es de: " + getEdad() + " eres mayor de edad");
        }else{
            System.out.println("Tu edad es de: " + getEdad() + " eres menor de edad");
        }
    }

    //Esto es del RETO2, que es cambiar la estructura del IMC
    public String calcularImc() {
        Double pesoActual = getPeso() / (getEstatura() * getEstatura());
    
        if (pesoActual < 20) {
            return "Peso bajo";
        } else if (pesoActual > 20 && pesoActual <= 25) {
            return "Peso ideal";
        } else if (pesoActual > 25) {
            return "Sobre peso";
        }
        
        return "No se pudo calcular el IMC";
    }
}

