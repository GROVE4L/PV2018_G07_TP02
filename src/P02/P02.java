package P02;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Ingrese texto: ");
        String cadena = sca.nextLine();
        String reverso = new StringBuffer(cadena).reverse().toString();
        System.out.println("La frase invertida: " + reverso);
    }
}
