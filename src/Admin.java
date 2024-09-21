import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    static void admin(){
        while (true){
            System.out.println("**Flight Operations**\n1. Add new Flights\n2. Remove Flights\n3. View user Reservations" +
                    "\n4. See current available flights\n5. logout");
            Scanner sc = new Scanner(System.in);
            int ain = sc.nextInt();
            if (ain == 5){
                break;
            }
            else {
                switch (ain) {
                    case 1:
                        System.out.println("Add new flights");
                        addf();
                        break;
                    case 2:
                        System.out.println("Remove flights");
                        remove();
                        break;
                    case 3:
                        System.out.println("Showing user Reservations");
                        BookingManagment.viewr();
                        break;
                    case 4:
                        System.out.println("Showing current available flights");
                        view();
                        break;
                    default:
                        System.out.println("Use number that are shown on screen");
                        admin();
                        break;
                }
            }
        }
    }
    static void view(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. View Domestic \n2. View International\n3. View Domestic return\n" +
                "4. View International Return");
        int vin = sc.nextInt();
        switch (vin) {
            case 1:
                FlightManagment.domesticview();
                break;
            case 2:
                FlightManagment.interfview();
                break;
            case 3:
                FlightManagment.domesticrview();
                break;
            case 4:
                FlightManagment.rinterfview();
                break;
            default:
                System.out.println("Use number that are shown on screen");
                view();
                break;
        }
    }
    static void addf(){
        System.out.println("Which type of flight you want to Add \n1. Domestic Flight \n2. Domestic Returning Flight" +
                "\n3. International Flight \n4. International Return Flights");
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int addin = sc.nextInt();
        switch (addin){
            case 1:
                System.out.println("Showing Current Domestic Flight");
                FlightManagment.domesticview();
                System.out.println("Enter Flight name");
                String add = s.nextLine();
                FlightManagment.domf.add(add);
                System.out.println("Flight has been added Successfully");
                break;
            case 2:
                System.out.println("Showing Current Domestic Return Flight");
                FlightManagment.domesticrview();
                System.out.println("Enter Flight name");
                add = s.nextLine();
                FlightManagment.domfr.add(add);
                System.out.println("Flight has been added Successfully");
                break;
            case 3:
                System.out.println("Showing Current International Flight");
                FlightManagment.interfview();
                System.out.println("Enter Flight name");
                add = s.nextLine();
                FlightManagment.interf.add(add);
                System.out.println("Flight has been added Successfully");
                break;
            case 4:
                System.out.println("Showing Current International Return Flight");
                FlightManagment.rinterfview();
                System.out.println("Enter Flight name");
                add = s.nextLine();
                FlightManagment.rinterf.add(add);
                System.out.println("Flight has been added Successfully");
                break;
            default:
                System.out.println("Enter number that are shown on screen only");
                break;
        }
    }
    static void remove(){
        System.out.println("Which type of flight you want to Remove \n1. Domestic Flight \n2. Domestic Returning Flight" +
                "\n3. International Flight \n4. International Return Flights");
        Scanner sc = new Scanner(System.in);
        int remin = sc.nextInt();
        switch (remin) {
            case 1:
                System.out.println("Select which Domestic Flight You wan to remove");
                for (int i = 0; i < FlightManagment.domf.size(); i++) {
                    System.out.println((i + 1) + ". " + FlightManagment.domf.get(i));
                }
                int in = sc.nextInt();
                FlightManagment.domf.remove(in - 1);
                System.out.println("Flight has been removed Successfully");
                break;
            case 2:
                System.out.println("Select which Domestic Return Flight You want to remove");
                for (int i = 0; i < FlightManagment.domfr.size(); i++) {
                    System.out.println((i + 1) + ". " + FlightManagment.domfr.get(i));
                }
                in = sc.nextInt();
                FlightManagment.domfr.remove(in - 1);
                System.out.println("Flight has been Removed Successfully");
                break;
            case 3:
                System.out.println("select which International Flight You want to remove");
                for (int i = 0; i < FlightManagment.interf.size(); i++) {
                    System.out.println((i + 1) + ". " + FlightManagment.interf.get(i));
                }
                in = sc.nextInt();
                FlightManagment.interf.remove(in - 1);
                System.out.println("Flight has been Removed Successfully");
                break;
            case 4:
                System.out.println("Showing Current International Return Flight");
                for (int i = 0; i < FlightManagment.rinterf.size(); i++) {
                    System.out.println((i + 1) + ". " + FlightManagment.rinterf.get(i));
                }
                in = sc.nextInt();
                FlightManagment.rinterf.remove(in - 1);
                System.out.println("Flight has been Removed Successfully");
                break;
            default:
                System.out.println("Enter number that are shown on screen only");
                addf();
                break;
        }
    }
}