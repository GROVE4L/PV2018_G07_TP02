package P03;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Ingrese texto: ");
        String cadena = sca.nextLine();
        System.out.println("Ingrese letra que quiere contar: ");
        String letra = sca.nextLine();        
        int contador = 0;
        for(int i=0; i<cadena.length(); i++) {
            if(cadena.charAt(i) == letra.charAt(0))
                contador ++;
        }
        if(contador == 0)
            System.out.println("La letra '" + letra.charAt(0) + "' NO existe en la frase '"+cadena+"'.");
        else if(contador == 1)
            System.out.println("La letra '" + letra.charAt(0) + "' se repite: "+contador+" vezcas.");
        else
            System.out.println("La letra '" + letra.charAt(0) + "' se repite: "+contador+" veces.");
    }
}
