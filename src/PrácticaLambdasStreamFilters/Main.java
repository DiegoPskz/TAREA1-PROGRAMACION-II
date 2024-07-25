package PrácticaLambdasStreamFilters;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    private static List<Persona> personas = new ArrayList<>();

    public static void main(String[] args) {
        // Generar y llenar lista de personas
        llenarListaDePersonas();

        // Imprimir nombres completos
        personas.stream()
                .map(p -> p.getNombre() + " " + p.getSegnombre() + " " +
                        p.getApellido() + " " + p.getSegapellido())
                .forEach(System.out::println);

        // Buscar personas mayores de edad
        List<Persona> mayoresDeEdad = personas.stream()
                .filter(p -> p.getEdad() >= 18)
                .collect(Collectors.toList());

        // Imprimir personas mayores de edad
        System.out.println("\nPersonas mayores de edad:");
        mayoresDeEdad.forEach(p -> System.out.println(p.getNombre() + " " + p.getApellido()));

        // Buscar primera persona que cumpla con las condiciones
        Optional<Persona> personaOpt = personas.stream()
                .filter(p -> p.getEdad() >= 18)
                .filter(p -> p.getCiudad().equalsIgnoreCase("Guatemala"))
                .filter(p -> p.getNombre().contains("Lu"))
                .findFirst();

        // Imprimir el resultado de la búsqueda
        personaOpt.ifPresent(p -> System.out.println("\nPrimera persona encontrada: " + 
                p.getNombre() + " " + p.getApellido()));
    }

    // Método para crear instancias de Persona y llenar la lista
    public static void llenarListaDePersonas() {
        personas.add(new Persona(1, "Luis", "Alberto", "Perez", "Gomez", "M", 123456789, 25, "Guatemala"));
        personas.add(new Persona(2, "Ana", "Maria", "Lopez", "Rodriguez", "F", 987654321, 30, "Guatemala"));
        personas.add(new Persona(3, "Juan", "Carlos", "Diaz", "Hernandez", "M", 192837465, 17, "Antigua"));
        personas.add(new Persona(4, "Lucia", "Fernanda", "Mendez", "Santos", "F", 564738291, 22, "Guatemala"));
        personas.add(new Persona(5, "Carlos", "Jose", "Ramirez", "Cruz", "M", 102938475, 28, "Quetzaltenango"));
    }

    // Método que retorna la lista de personas
    public static List<Persona> obtenerListaDePersonas() {
        return personas;
    }
}
