public class App {
    
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.edad = 37;
        cliente.telefono = 234;
        cliente.nombre = "Manuel";
        System.out.println("El cliente: " + cliente.nombre +  ", Edad: " + cliente.edad +  ", Numero de telefono: " + cliente.telefono);

        
        trabajador.edad = 45;
        trabajador.telefono = 233;
        trabajador.nombre = "Manolete";
        trabajador.salario = 235.0;
        System.out.println("El trabajador: " + trabajador.nombre +  ", Edad: " + trabajador.edad +  ", Numero de telefono: " + trabajador.telefono + ", Salario: " + trabajador.salario);
    }
}

class Persona{
    int edad;
    int telefono;
    String nombre;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}