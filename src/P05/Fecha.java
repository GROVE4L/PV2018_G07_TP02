package P05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fecha {
    public long devolverEdadenSemanas(String fecha) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNac = null;
        try {
            fechaNac = sdf.parse(fecha);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        
        Date hoy = new Date();
        
        long i = (hoy.getTime()-fechaNac.getTime())/(7*24*3600*1000);
        return i;
    }
    public String obtenerEstacion(String fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaEstacion = null;
        try {
            fechaEstacion = sdf.parse(fecha);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        switch(fechaEstacion.getMonth()) { 
            case 12: case 1: case 2: return "Verano";
            case 3: case 4: case 5: return "Otoño";
            case 6: case 7: case 8: return "Invieron";
            case 9: case 10: case 11: return "Primavera";
            default: return "null";
        }
    }
    public void mostrarFechas(String fecha1, String fecha2) {
        Calendar fechaI = Calendar.getInstance();
        Calendar fechaF = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            fechaI.setTime(sdf.parse(fecha1));
        } catch (ParseException ex) {
            Logger.getLogger(Fecha.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fechaF.setTime(sdf.parse(fecha2));
        } catch (ParseException ex) {
            Logger.getLogger(Fecha.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(fechaF.before(fechaI))
            System.out.println("La fecha Final es Menor!");
        else {            
            while(!fechaI.after(fechaF)) {       
                System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(fechaI.getTime()));
                fechaI.add(Calendar.DATE, 1);              
            }
        }
    }      
    public int mostrarcantDomingos(String fecha1, String fecha2) {
        Calendar fechaI = Calendar.getInstance();
        Calendar fechaF = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            fechaI.setTime(sdf.parse(fecha1));
        } catch (ParseException ex) {
            Logger.getLogger(Fecha.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fechaF.setTime(sdf.parse(fecha2));
        } catch (ParseException ex) {
            Logger.getLogger(Fecha.class.getName()).log(Level.SEVERE, null, ex);
        }
        int c = 0;
        if(fechaF.before(fechaI))
            System.out.println("La fecha Final es Menor!");
        else {  
            
            while(!fechaI.after(fechaF)) {       
                if(fechaI.get(Calendar.DAY_OF_WEEK) == 1)
                    c++;
                fechaI.add(Calendar.DATE, 1);              
            }
        }
        return c;
    }
}
