import java.util.ArrayList;
import java.util.Scanner;

public class User {
    static ArrayList<String> uid = new ArrayList<String>();
    static ArrayList<String> pwd = new ArrayList<String>();
    static ArrayList<String> fopsU = new ArrayList<String>();
    static ArrayList<String> fopspw = new ArrayList<String>();
    static void login(){
        uid.add("admin");
        pwd.add("admin");
        Scanner sc = new Scanner(System.in);

        System.out.println("User name");
        String a = sc.nextLine();
        System.out.println("Password");
        String b = sc.nextLine();

        if(uid.contains(a)&&pwd.contains(b)){
            System.out.println("***Welcome to biman Airlines***");
            BookingManagment.book();
        }
        else if (uid.contains(a)||pwd.contains(b)){
            System.out.println("User id or password incorrect");
        }
        else{
            System.out.println("NO user found try SignUp \n");
        }
    }
    static void flightOps(){
        fopsU.add("root");
        fopspw.add("passwd");
        System.out.println("For now Flight Ops User id = root , and password = passwd ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter User name");
        String Uid = s.nextLine();
        System.out.println("Enter password");
        String pwd = s.nextLine();
        if(fopsU.contains(Uid) && fopspw.contains(pwd)){
            Admin.admin();
        }
        else{
            System.out.println("User ID or password not matched");
        }
    }
    static void Signup(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new User name");
        String u = sc.nextLine();

        if(uid.contains(u)){
            System.out.println("User name already taken ");
            System.out.println("Use different user name ");
            u = sc.nextLine();
            uid.add(u);
        }
        else {
            uid.add(u);
        }
        System.out.println("Enter new User password");
        pwd.add(sc.nextLine());
        System.out.println("SignUp successful");
    }
}
