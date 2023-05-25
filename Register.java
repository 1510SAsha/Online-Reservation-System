import java.security.KeyStore.PasswordProtection;
import java.util.*;
public class Register {

    private String name,sname,mname;
    private int age;
    private int d,m,yr;
    private String mbno;
    private String emailString;
    private String city;
    private int pincode;
    protected String password;


    public void getinfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Online Rservation");
        System.out.println("Enter name:");
        System.out.println("Enter the surname");
        sname=sc.next();
        System.out.println("Enter the middle name");
        mname=sc.next();
        System.out.println("Enter the name");
        name=sc.next();
        System.out.println("Enter the Mobile no.");
        do{
            mbno = sc.next();
        }while(mbno.length()!=10);
       
       do {
            System.out.println("Enter the Date of Birth");
            System.out.println("Date");
            d = sc.nextInt();
            System.out.println("Month");
            m= sc.nextInt();
            System.out.println("Year");
            yr = sc.nextInt();
        } while (d> 31 || d < 0 || m > 12 || m < 0 || yr < 1900 || yr > 2025);
        do {
            System.out.println("Enter the Age");
            age = sc.nextInt();
        } while (age < 20 || age > 100);
        System.out.println("Plz enter the city in Which you are leaving currently");
        city=sc.next();
        System.out.println("Enter your city pin-code");
        pincode=sc.nextInt();
    
        System.out.println("Enter a Valid Email for info ");
        emailString=sc.next();
        System.out.println("Create Password");
        password=sc.next();
      
    }



    

    public void Display(){
        System.out.println(sname+ "" +mname+ "" +name);
        System.out.println(d+ "/" +m+ "/" +yr);
        System.out.println("Age :-" +age);
        System.out.println("Your City :-" +city);
        System.out.println("Enter a city pin-code :-" +pincode);    
        System.out.println("Your email address is"+emailString);
    }

    
}
