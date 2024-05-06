package com.herencia;

public class Perro extends Animal {
    private String raza;

    public Perro(String raza) {
        this.raza = raza;
    }

    // Sobreescritura del método comer
    @Override
    public void comer() {
        System.out.println("El perro come");
    }

    // Sobrecarga del método comer
    public void comer(String comida) {
        System.out.println("El perro come " + comida);
    }

    public void ladrar() {
        System.out.println("El perro ladra");
    }

    public void mostrarRaza() {
        System.out.println("La raza del perro es " + this.raza);
    }
}