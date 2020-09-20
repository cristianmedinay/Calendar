import java.util.Calendar;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        String nombre;

        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        int minuto = calendar.get(Calendar.MINUTE);
        int mes = calendar.get(Calendar.MONTH);
        int año = calendar.get(Calendar.YEAR);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Por favor introduce tu nombre: ");
        nombre = in.next();
        in.nextLine();
        String opcion;
        do{

            int op=0;
            if (hora>=18 && hora<24){
                op=3;
            }
            else if(hora>12 && hora<18 ){
                op=2;
            }
            else if(hora>=0){
                op=1;
            }

            switch (op){
                case 1:
                    System.out.println("Buenos dias "+nombre+" Son las "+hora+":"+minuto+" del "+
                            dia+" de "+mes+" de "+año);
                    break;
                case 2:
                    System.out.println("Buenas tardes "+nombre+" Son las "+hora+":"+minuto+" del "+
                            dia+" de "+mes+" de "+año);
                    break;
                case 3:
                    System.out.println("Buenas noches "+nombre+" Son las "+hora+":"+minuto+" del "+
                            dia+" de "+mes+" de "+año);
                    break;
            }
            System.out.println("Quieres volver a comprobar la hora ? ");
            opcion = in.nextLine();
        }while (opcion.equals("S") || opcion.equals("s"));
    }

}
