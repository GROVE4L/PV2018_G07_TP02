package P07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.print("Introduzca el dia (dd): ");
        int dia = sca.nextInt();
        System.out.print("Introduzca el mes (mm): ");
        int mes = sca.nextInt();
        System.out.print("Introduzca el año (aaaa): ");
        int anio = sca.nextInt();
        /*int dia = 28;
        int mes = 3;
        int anio = 2018;*/
        Calendar c = Calendar.getInstance();
        c.set(anio, mes-1, dia);  
        Date d = new Date(mes+"/"+dia+"/"+anio);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //System.out.println("Fecha Capturada (Date): "+sdf.format(d));
        System.out.println("Fecha Capturada: "+sdf.format(c.getTime()));
        c.add(Calendar.DATE, 100);       
        System.out.println("Nueva fecha Posterior: "+c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("ES"))+", "
                +c.get(Calendar.DAY_OF_MONTH) + " de " + c.getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("ES"))+
                " de "+ c.get(Calendar.YEAR));      
    }
}
