package com.ejemplo;

public class FuncionesADocumentar {
    public static void main(String[] args) {
        
        int a[] = {7, 14, 9, 18, 11, 6, 13, 12, 1, 5, 4, 3, 2, 8, 10};

        System.out.println("La suma de los elementos del arreglo es: " + suma(a));
        System.out.println("El promedio de los elementos del arreglo es: " + promedio(a));
        System.out.println("El mayor de los elementos del arreglo es: " + mayor(a));
        System.out.println("El menor de los elementos del arreglo es: " + menor(a));
        System.out.println("El arreglo invertido es: ");
        invertir(a);
        System.out.println("El arreglo ordenado es: ");
        ordenar(a);
    }
    /**
     * Calcula la suma de todos los elementos del array dado.
     * El array no puede ser nulo o vacío.
     *
     * @param a el array de enteros a ser sumados
     * @return la suma de todos los elementos del array
     */
    public static int suma(int a[]) {
        int suma = 0;
        for (int i = 0; i < a.length; i++)
            suma += a[i];
        return suma;
    }

    /**
     * Calcula el promedio de los elementos de un array de enteros.
     * El array no puede ser nulo o vacío.
     *
     * @param a Array de enteros para calcular el promedio.
     * @return El promedio de los elementos del array.
     */
    public static double promedio(int a[]) {
        return suma(a) / a.length;
    }

    /**
     * Devuelve el mayor elemento de un array de enteros.
     * El array no puede ser nulo o vacío.
     * @param a Array de enteros del cual se desea obtener el mayor elemento.
     * @return El mayor elemento del array.
     */
    public static int mayor(int a[]) {
        int mayor = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > mayor)
                mayor = a[i];
        return mayor;
    }
    /**
     * Devuelve el menor elemento de un array de enteros.
     * El array no puede ser nulo o vacío.
     * @param a Array de enteros del cual se desea obtener el menor elemento.
     * @return El menor elemento del array.
     */
    public static int menor(int a[]) {
        int menor = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] < menor)
                menor = a[i];
        return menor;
    }

    /**
     * Imprime el array de enteros en orden inverso.
     * El array no puede ser nulo o vacío.
     * @param a Array de enteros a imprimir en orden inverso.
     */
    public static void invertir(int a[]) {
        for (int i = a.length - 1; i >= 0; i--)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    /**
     * Ordena el array de enteros en orden ascendente y lo imprime.
     * El array no puede ser nulo o vacío.
     *
     * @param a Array de enteros a ordenar.
     */
    public static void ordenar(int a[]) {
        int aux;
        for (int i = 0; i < a.length - 1; i++)
            for (int j = i; j < a.length; j++)
                if (a[i] > a[j]) {
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

}
