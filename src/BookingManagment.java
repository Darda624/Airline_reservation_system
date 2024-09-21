import java.util.ArrayList;
import java.util.Scanner;

public class BookingManagment {
    static ArrayList<String> booking = new ArrayList<String>();
    static void book(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1. Book your flight reservation");
            System.out.println("2. View your reservations");
            System.out.println("3. Cancel your reservation");
            System.out.println("4. Logout");
            int in = sc.nextInt();
            if (in == 4){
                break;
            }
            else{
            switch (in) {
                case 1:
                    FlightManagment.flight_type();
                    FlightManagment.add();
                    String s = Internationalf.to+FlightManagment.time+FlightManagment.cabin;
                    booking.add(s);
                    break;
                case 2:
                    viewr();
                    break;
                case 3:
                    cancelr();
                    break;
                default:
                    System.out.println("Use number that are shown on screen ");
                    book();
                    break;
                }
            }
        }
    }
    static void viewr(){
        if (booking.isEmpty()){
            System.out.println("You don't have any reservation yet");
        }
        else {
            System.out.println("Currently Your available reservations");
            for (String s : booking) {
                System.out.println(s);
            }
        }
    }
    static void cancelr(){
        if (booking.isEmpty()){
            System.out.println("You don't have any reservation yet");
        }
        else{
            Scanner sc = new Scanner(System.in);
            System.out.println("Select which Reservation you want to Cancel");
            for (int i = 0;i<booking.size();i++) {
                System.out.println((i+1)+". "+booking.get(i));
            }
            int in = sc.nextInt();
            booking.remove(in-1);
            System.out.println("Your reservation has been canceled");
        }
    }
}
