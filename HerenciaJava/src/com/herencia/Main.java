package com.herencia;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Labrador");
        perro.comer(); // Llama al método sobreescrito
        perro.comer("hueso"); // Llama al método sobrecargado
        perro.ladrar(); // Llama al método específico de la clase Perro
        perro.mostrarRaza(); // Muestra la raza del perro
    }
}