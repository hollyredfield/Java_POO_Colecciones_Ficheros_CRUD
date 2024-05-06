// Paquete com.colecciones
package com.colecciones;

// Importamos las clases necesarias
import java.util.*;

// Definimos la clase Main
public class Main {
    // Método principal
    public static void main(String[] args) {
        // Creamos una lista para almacenar los nombres de los estudiantes de una clase
        List<String> estudiantes = new ArrayList<>();
        estudiantes.add("Juan");
        estudiantes.add("Ana");
        System.out.println("Estudiantes: " + estudiantes);

        // Creamos una pila para gestionar el historial de navegación en una aplicación web
        Stack<String> historialNavegacion = new Stack<>();
        historialNavegacion.push("Inicio");
        historialNavegacion.push("Perfil");
        System.out.println("Historial de navegación: " + historialNavegacion);

        // Creamos una cola para gestionar las tareas pendientes en una aplicación de gestión de tareas
        Queue<String> tareasPendientes = new LinkedList<>();
        tareasPendientes.add("Estudiar para el examen");
        tareasPendientes.add("Hacer la compra");
        System.out.println("Tareas pendientes: " + tareasPendientes);

        // Creamos un vector para almacenar los elementos de una matriz en una aplicación de procesamiento de imágenes
        Vector<Integer> matrizImagen = new Vector<>();
        matrizImagen.add(255);
        matrizImagen.add(128);
        System.out.println("Matriz de imagen: " + matrizImagen);
    }
}