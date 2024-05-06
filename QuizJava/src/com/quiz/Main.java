package com.quiz;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        List<String> preguntas = leerArchivo("preguntas.txt");
        List<String> respuestas = leerArchivo("respuestas.txt");

        Scanner scanner = new Scanner(System.in);
        double puntuacion = 0;

        for (int i = 0; i < preguntas.size(); i++) {
            System.out.println(preguntas.get(i));
            String respuestaUsuario = scanner.nextLine();

            if (respuestaUsuario.equalsIgnoreCase(respuestas.get(i))) {
                puntuacion++;
            } else {
                puntuacion -= 0.5;
            }
        }

        System.out.println("Tu puntuación es: " + puntuacion);
        if (puntuacion >= 5) {
            System.out.println("Has aprobado el cuestionario.");
        } else {
            System.out.println("No has aprobado el cuestionario.");
        }

        scanner.close();
    }

    public static List<String> leerArchivo(String nombreArchivo) {
        List<String> lineas = new ArrayList<>();

        try {
            File archivo = new File(nombreArchivo);
            Scanner scanner = new Scanner(archivo);

            while (scanner.hasNextLine()) {
                lineas.add(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo " + nombreArchivo);
        }

        return lineas;
    }
}