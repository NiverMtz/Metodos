package com.company;

public class Main {

    public static void main(String[] args) {
        String mensaje = saludar("juan");
        System.out.println(mensaje);
        int resultado = suma(5, 3);
        System.out.println(resultado);
        alerta("Romina");

        // Librerías
        int numero = Math.abs(-4);
        System.out.println(numero);

        double n1 = 13.75;
        double n2 = 23.12;

        System.out.println(Math.ceil(n1));
        System.out.println(Math.floor(n2));

        String mensaje1 = "HOOOOOOOOOOLA - mensaje 1";
        String mensaje2 = "HOLA - mensaje 2";
        System.out.println(mensaje1.length());
        System.out.println(mensaje1.isEmpty());
        System.out.println(mensaje1.concat(mensaje2));
        System.out.println(mensaje1.equalsIgnoreCase(mensaje2));
        System.out.println(mensaje1.compareTo(mensaje2));
    }

    public static String saludar(String nombre) {
        return "Hola, ¿Cómo estás " + nombre + "?";
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static void alerta(String nombre) {
        System.out.println("Mensaje de prueba para " + nombre);
    }
}
