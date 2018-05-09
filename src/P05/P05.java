package P05;

public class P05 {
    public static void main(String[] args) {
        Fecha f = new Fecha();   
        
        String fecha1 = "8/6/1994";
        String fecha2 = "25/4/2018";
        String fecha3 = "20/3/2018";
        String fecha4 = "23/3/2018";
        String fecha5 = "15/2/2018";
        String fecha6 = "28/3/2018";
        
        
        System.out.println("Nacio en el "+fecha1+" y tiene "+f.devolverEdadenSemanas(fecha1)+" semanas de edad.");
        System.out.println("\nLa estacion de la fecha "+fecha2+" es: "+ f.obtenerEstacion(fecha2));
        
        System.out.println("\nAhora se mostraran las fechas entre el "+fecha3+" y el "+fecha4);   
        f.mostrarFechas(fecha3, fecha4);
        
        System.out.println("\nHay "+f.mostrarcantDomingos(fecha5, fecha6)+" domingos entre las fechas "+fecha5+" y el "+fecha6);
    }
}
