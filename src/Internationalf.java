import java.sql.SQLOutput;
import java.util.Scanner;

public class Internationalf {
    static String to ="";
    static void international(){
        Scanner ifs = new Scanner(System.in);
        FlightManagment.interfview();
        System.out.println((FlightManagment.interf.size()+1)+". "+"To book return flight to Bangladesh ");
        int ban = ifs.nextInt();
        ban -= 1;


        if (ban < FlightManagment.interf.size()) {
            to = FlightManagment.interf.get(ban);
            System.out.println(to + " Selected");

        }
        else if (ban == FlightManagment.interf.size()) {
            System.out.println("Showing return flights to Dhaka");
            rinternational();
        }
        else {
          System.out.println("Use numbers that are shown on screen");
            international();
        }
    }
    static void rinternational(){
        Scanner ifs = new Scanner(System.in);
        FlightManagment.rinterfview();
        int rban = ifs.nextInt();
        rban -= 1;

        if (rban < FlightManagment.rinterf.size()) {
            to = FlightManagment.rinterf.get(rban);
            System.out.println(to + " Selected");
        }
        else {
            System.out.println("Use numbers that are shown on screen");
            rinternational();
        }
    }
}
