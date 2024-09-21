import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FlightManagment.dflight();
        FlightManagment.dflightr();
        FlightManagment.iflight();
        FlightManagment.riflight();
        Scanner sc = new Scanner(System.in);
        int rc;
        while(true){
            System.out.println("Chose option from below \nEnter 1 to Login \nEnter 2 to Login as FlightOps" +
                    "\nEnter 3 to Signup");
            rc = sc.nextInt();
            switch (rc) {
                case 1:
                    System.out.println("Demo account User id = admin , and password = admin");
                    User.login();
                    break;
                case 2:
                    User.flightOps();
                    break;
                case 3:
                    User.Signup();
                    break;
                default:
                    System.out.println("please enter numbers that are shown on screen");
                    break;
            }
        }
    }
}
