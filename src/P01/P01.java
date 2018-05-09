package P01;

import java.util.Scanner;

public class P01 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Ingrese texto: ");
        String cadena = sca.nextLine();
        int contador=0;
        for(int i=0; i<cadena.length(); i++) {
            switch(cadena.charAt(i)) {
                case 'a':case 'A':
                case 'e':case 'E':
                case 'i':case 'I':
                case 'o':case 'O':
                case 'u':case 'U': contador ++;
            }
        }
        System.out.println("La frase tiene "+contador+" vocales.");
    }    
}