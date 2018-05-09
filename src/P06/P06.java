package P06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class P06 {
    public static void main(String[] args) {
        String fecha1;
        String fecha2;
        Scanner sca = new Scanner(System.in);
        System.out.print("Introduzca la fecha 1: ");
        fecha1 = sca.nextLine();
        System.out.print("Introduzca la fecha 2: ");
        fecha2 = sca.nextLine();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        Date f1 = null;
        Date f2 = null;
        try {
            f1 = sdf.parse(fecha1);
        } catch (ParseException ex) {
            Logger.getLogger(P06.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            f2 = sdf.parse(fecha2);
        } catch (ParseException ex) {
            Logger.getLogger(P06.class.getName()).log(Level.SEVERE, null, ex);
        }        
        long dif = f2.getTime() - f1.getTime();
        long millaDia = dif / (1000 * 60 * 60 * 24);        
        
        System.out.println("Hay " + (int)millaDia +" dias de diferencia.");
    }   
}
