/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P04;

import java.util.Arrays;

/**
 *
 * @author Ignacio
 */
public class Metodos {
        
        public boolean equals(String cadena1, String cadena2){
        /*Equals: Tienen que ser iguales EXACTAMENTE*/
        boolean resultado=cadena1.equals(cadena2);
        return resultado;
        }
        
        public int compareto(String cadena1, String cadena2 ){
        int resultado1=cadena1.compareTo(cadena2);
        return resultado1;
        }
        
        public void valueof(int cadena1){
        System.out.println(String.valueOf(cadena1) + " - ValueOf");
        }

        public void tochararray(String cadena1){
        /*ToCharArray: Divide las palabras, letra por letra*/
        char letra[]=cadena1.toCharArray();
        System.out.println(Arrays.toString(letra) + " - ToCharArray");
        }
        
        public void length(String cadena1){
        /*Length: Devuelve la cantidad de caracteres de la cadena*/
        int resultado4=cadena1.length();
        System.out.println(resultado4 + " - Length");
        }
        
        public void concat(String cadena1, String cadena2){
        /*Concat: concatener palabras o letras */
        System.out.println(cadena1 + " ".concat(cadena2 + " - Concat"));
        }
        
        public void charat(String cadena1, int pos){
        /*CharArt: Devuelve la letra de la cadena, en la posicion que le mandemos*/
        System.out.println(cadena1.charAt(pos) + " - CharAt");
        }
        
        public void substring(String cadena1, int posi, int posf){
        /*SubString: Este método tiene uno o dos enteros como argumento y devuelve, de la variable que lo invoca, la subcadena que está ocupando la
posición dada desde el primer argumento hasta el segundo SIN incluirlo (hay que recordar que SIEMPRE, en Java, los caracteres de una
cadena empiezan a contarse desde la posición cero) */
        System.out.println(cadena1.substring(posi, posf) + " - Substring");
        }

        public void indexof(String cadena1, char let){
        /*IndexOf: Devuelve la posicion de la variable que pusimos de izquierda a derecha*/
        System.out.println (cadena1.indexOf(let) + " - IndexOf");
        }

        public void lastindexof(String cadena1, char let){
        /*LastIndexOf: Devuelve la posicion de la variable que pusimos de derecha a izquierda */
        System.out.println(cadena1.lastIndexOf(let) + " - LastIndexOf");
        }
        
        public void endswith(String cadena1, String texto){
        /*EndsWith: Este método tiene una cadena como argumento y devuelve true en caso de que la variable que lo invoca TERMINE con el argumento o
false en caso contrario*/
        boolean resultado=cadena1.endsWith(texto);
        System.out.println(resultado + " - EndsWith");
        }        
        
        public void startwith(String cadena1, String texto){
        /*StartWith: Este método tiene una cadena como argumento y devuelve true en caso de que la variable que lo invoca EMPIECE con el argumento o
false en caso contrario*/
        boolean resultado=cadena1.startsWith(texto);
        System.out.println(resultado + " - StartWith");
        }

        public void replace(String cadena1, String r1, String r2){
        /*Replace: Reemplaza en una cadena, la palabra que deseamos por otra*/
        System.out.println(cadena1.replace(r1,r2) + " - Replace");
        }
        
        public void replaceall(String cadena1, String r1, String r2){
        System.out.println(cadena1.replaceAll(r1, r2) + " - ReplaceAll");
        }
        
        public void tolowercase(String cadena1){
        /*ToLowerCase: Convierte todo en minusculo*/
        System.out.println(cadena1.toLowerCase() + " - ToLowerCase");
        }
        
        public void touppercase(String cadena1){
        /*ToUpperCase: Convierte todo en mayuscula */
        System.out.println(cadena1.toUpperCase() + " - ToUpperCase");
        }
        
        public void split (String cadena1){
        /*Split: Divide las palabras y las guarda en un arreglo */
        String palabra[]=cadena1.split(" ");
        System.out.println(Arrays.toString(palabra) + " - Split");
        }
}

