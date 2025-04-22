
import Models.Persona;
import Models.ViewConsole;
import Controllers.PersonaController;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26),

        
    };
    Scanner leer = new Scanner(System.in);
    ViewConsole view = new ViewConsole();
    for (int i = 0; i < personas.length; i++) {
        view.print(personas[i].toString()); // Imprime la representación en cadena de cada persona
    }
    view.print("Ordenando por edad...");
    PersonaController controller = new PersonaController();
    controller.ordenarPorEdadInserccion(personas); 
    view.print("Ordenados por edad: ");
    for (int i = 0; i < personas.length; i++) {
        view.print(personas[i].toString()); // Imprime la representación en cadena de cada persona
    }
    view.print("Buscando la edad de 40...");
    int edad = 40;
    controller.buscarPorEdad(personas, edad); 
    Persona personaEncontrada = controller.buscarPorEdad(personas, edad);
    if (personaEncontrada != null) {
        view.print("Persona encontrada: " + personaEncontrada.toString()); // Imprime la representación en cadena de la persona encontrada
    } else {
        view.print("No se encontró ninguna persona con esa edad."); // Mensaje si no se encuentra la persona
    }
    view.print("Buscando la edad de 99...");
    edad = 99;
    personaEncontrada = controller.buscarPorEdad(personas, edad);
    if (personaEncontrada != null){
        view.print("Persona encontrada: " + personaEncontrada.toString()); // Imprime la representación en cadena de la persona encontrada
    } else {
        view.print("No se encontró ninguna persona con esa edad."); // Mensaje si no se encuentra la persona
    }

}}
