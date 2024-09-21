import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class FlightManagment {
    static ArrayList<String> domf = new ArrayList<String>();
    static ArrayList<String> domfr = new ArrayList<String>();
    static ArrayList<String> interf = new ArrayList<String>();
    static ArrayList<String> rinterf = new ArrayList<String>();
    static void dflight(){
        domf.add("Dhaka to Cox's Bazar");
        domf.add("Dhaka to Chattogram");
        domf.add("Dhaka to Barishal");
        domf.add("Dhaka to Jashore");
        domf.add("Dhaka to Rajshahi");
        domf.add("Dhaka to Sylhet");
        domf.add("Dhaka to Saidpur");
    }
    static void domesticview(){
        for(int i = 0;i<domf.size();i++){
            System.out.println((i+1)+". "+domf.get(i));
        }
    }
    static void dflightr(){
        domfr.add("Cox's Bazar to Dhaka");
        domfr.add("Chattogram to Dhaka");
        domfr.add("Barishal to Dhaka");
        domfr.add("Jashore to Dhaka");
        domfr.add("Rajshahi to Dhaka");
        domfr.add("Sylhet to Dhaka");
        domfr.add("Saidpur to Dhaka");
    }
    static void domesticrview(){
        for(int i = 0;i<domfr.size();i++){
            System.out.println((i+1)+". "+domfr.get(i));
        }
    }
    static void iflight(){
        interf.add("Bangladesh to United Arab Emirates");
        interf.add("Bangladesh to Saudi Arabia");
        interf.add("Bangladesh to Malaysia");
        interf.add("Bangladesh to Qatar");
        interf.add("Bangladesh to Canada");
        interf.add("Bangladesh to Italy");
        interf.add("Bangladesh to Japan ");
        interf.add("Bangladesh to United Kingdom");
    }
    static void interfview(){
        for(int i = 0;i<interf.size();i++){
            System.out.println((i+1)+". "+interf.get(i));
        }
    }
    static void riflight(){
        rinterf.add("United Arab Emirates to Bangladesh");
        rinterf.add("Saudi Arabia to Bangladesh");
        rinterf.add("Malaysia to Bangladesh");
        rinterf.add("Qatar to Bangladesh");
        rinterf.add("Canada to Bangladesh");
        rinterf.add("Italy to Bangladesh");
        rinterf.add("Japan to Bangladesh");
        rinterf.add("United Kingdom to Bangladesh");
    }

    static void rinterfview(){
        for(int i = 0;i<rinterf.size();i++){
            System.out.println((i+1)+". "+rinterf.get(i));
        }
    }


    static void flight_type() {
        System.out.println("Select Your flight type \n1. Domestic Flights \n2. International Flights");
        Scanner f = new Scanner(System.in);
        int ft = f.nextInt();
        if(ft == 1){
            System.out.println("Domestic Flights ");
            Domesticf.domestic();
        }
        else if (ft == 2){
            System.out.println("International Flights");
            Internationalf.international();
        }
        else{
            System.out.println("To chose Domestic or International use 1 or 2");
        }
    }
    static String cabin = "";
    static void Cabin(){
        System.out.println("Chose your cabin class \n" +
                "1. Economy Class\n" +
                "2. Premium Economy Class\n" +
                "3. Business Class\n" +
                "4. First Class");
        Scanner sc = new Scanner(System.in);
        int cin = sc.nextInt();
        switch (cin){
            case 1:
                cabin = " Economy class";
                break;
            case 2:
                cabin = " Premium Economy Class";
                break;
            case 3:
                cabin = " Business Class";
                break;
            case 4:
                cabin = " First Class";
                break;
            default:
                System.out.println("Use number that are shown on Screen");
                Cabin();
                break;
        }
    }
    static String time = "";
    static void Time(){
        System.out.println("Select time \nMorning Flights \n" +
                "1. 6:00 AM(UTC +06:00)\n"+"2. 7:30 AM(UTC +06:00)\n"+"3. 8:15 AM(UTC +06:00)\n"+"Afternoon Flights\n"+
                "4. 12:00 PM(UTC +06:00)\n"+"5. 1:30 PM(UTC +06:00)\n"+"6. 3:45 PM(UTC +06:00)\n"+"Evening Flights\n"+
                "7. 5:00 PM(UTC +06:00)\n"+"8. 6:30 PM(UTC +06:00)\n"+"9. 8:00 PM(UTC +06:00)\n"+"Late Night Flights\n"+
                "11. 10:00 PM(UTC +06:00)\n"+"12. 11:30 PM(UTC +06:00)\n");
        Scanner sc = new Scanner(System.in);
        int tin = sc.nextInt();
        switch (tin){
            case 1:
                time = " 6:00 AM(UTC +06:00)";
                break;
            case 2:
                time = " 7:30 AM(UTC +06:00)";
                break;
            case 3:
                time = " 8:15 AM(UTC +06:00)";
                break;
            case 4:
                time = " 12:00 PM(UTC +06:00)";
                break;
            case 5:
                time = " 1:30 PM(UTC +06:00)";
                break;
            case 6:
                time = " 3:45 PM(UTC +06:00)";
                break;
            case 7:
                time = " 5:00 PM(UTC +06:00)";
                break;
            case 8:
                time = " 6:30 PM(UTC +06:00)";
                break;
            case 9:
                time = " 8:00 PM(UTC +06:00)";
                break;
            case 10:
                time = " 10:00 PM(UTC +06:00)";
                break;
            case 11:
                time = " 11:30 PM(UTC +06:00)";
                break;
            default:
                System.out.println("Use number that are shown on Screen");
                Time();
                break;
        }
    }
    static void add(){
        FlightManagment.Cabin();
        System.out.println(FlightManagment.cabin+" Selected");
        FlightManagment.Time();
        System.out.println(FlightManagment.time+" Selected");
    }
}
