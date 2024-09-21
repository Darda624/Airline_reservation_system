import java.util.ArrayList;
import java.util.Scanner;
public class Domesticf {

    static void domestic(){
        Scanner dt = new Scanner(System.in);
        FlightManagment.domesticview();
        System.out.println((FlightManagment.domf.size()+1)+". "+"To get return ticket to Dhaka");
        int dhk = dt.nextInt();
        dhk = dhk-1;


        if (dhk < FlightManagment.domf.size()) {
            Internationalf.to = FlightManagment.domf.get(dhk);
            System.out.println(Internationalf.to + " Selected");
        }
        else if (dhk == FlightManagment.domf.size()) {
            System.out.println("Showing return flights to Dhaka");
            domesticr();
        }
        else {
            System.out.println("Use numbers that are shown on screen");
            domestic();
        }
    }
    static void domesticr(){
        Scanner dt = new Scanner(System.in);
        FlightManagment.domesticrview();
        int rdhk = dt.nextInt();
        rdhk = rdhk-1;

        if (rdhk < FlightManagment.domfr.size()) {
            Internationalf.to = FlightManagment.domfr.get(rdhk);
            System.out.println(Internationalf.to + " Selected");
        }
        else {
            System.out.println("Use numbers that are shown on screen");
            domesticr();
        }
    }
}
