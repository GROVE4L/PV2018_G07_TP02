/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P04;

import com.sun.org.apache.xpath.internal.operations.Equals;
import com.sun.xml.internal.bind.v2.schemagen.Util;
import java.util.Arrays;
/**
 *
 * @author Ignacio
 */
public class Cuerpo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena1="Ignacio";
        String cadena2="ignacio";
        String cadena3="    IGNACIO";
        String cadena4="Martin es un kat";
        int posicion=6;/*CharAt*/
        int posicioninicial=6;/*SubString*/
        int posicionfinal=10;/*SubString*/
        int cadena5=65;
        char letra='a';/*IndexOf*/
        String testo="cio";/*EndWith*/
        String replace1="    ";/*replace*/
        String replace2="hola";/*replace*/
        String ra1="i";/*Replaceall*/
        String ra2="e";/*Replaceall*/
        
        Metodos mequals = new Metodos();
        System.out.println(mequals.equals(cadena1, cadena4) + " - Equals");
    
        Metodos mcompareto = new Metodos();
        System.out.println(mcompareto.compareto(cadena1, cadena2) + " - CompareTo");
        
        Metodos mvalueof = new Metodos();
        mvalueof.valueof(cadena5);
        
        Metodos mtochararray = new Metodos();
        mtochararray.tochararray(cadena3);
        
        Metodos mlength = new Metodos();
        mlength.length(cadena2);
        
        Metodos mconcat = new Metodos();
        mconcat.concat(cadena2, cadena4);
    
        Metodos mcharat = new Metodos();
        mcharat.charat(cadena1, posicion);
        
        Metodos msubstring = new Metodos();
        msubstring.substring(cadena4, posicioninicial, posicionfinal);
    
        Metodos mindexof = new Metodos();
        mindexof.indexof(cadena4,letra);
    
        Metodos mlastindesof = new Metodos();
        mlastindesof.lastindexof(cadena1, letra);
        
        Metodos mendwith = new Metodos();
        mendwith.endswith(cadena1, testo);
        
        Metodos mstartwith = new Metodos();
        mstartwith.startwith(cadena1, testo);
    
        Metodos mreplace = new Metodos();
        mreplace.replace(cadena1, replace1, replace2);
    
        Metodos mreplaceall = new Metodos();
        mreplaceall.replaceall(cadena1, ra1, ra2);
    
        Metodos mtolowercase = new Metodos();
        mtolowercase.tolowercase(cadena1);
        
        Metodos mtouppercase = new Metodos();
        mtouppercase.touppercase(cadena1);
        
        Metodos msplit = new Metodos();
        msplit.split(cadena4);
    }
}
