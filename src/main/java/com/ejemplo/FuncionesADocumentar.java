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

    public static int suma(int a[]) {
        int suma = 0;
        for (int i = 0; i < a.length; i++)
            suma += a[i];
        return suma;
    }

    public static double promedio(int a[]) {
        return suma(a) / a.length;
    }

    public static int mayor(int a[]) {
        int mayor = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > mayor)
                mayor = a[i];
        return mayor;
    }

    public static int menor(int a[]) {
        int menor = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] < menor)
                menor = a[i];
        return menor;
    }

    public static void invertir(int a[]) {
        for (int i = a.length - 1; i >= 0; i--)
            System.out.print(a[i] + " ");
        System.out.println();
    }

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
