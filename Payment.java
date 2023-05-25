import java.util.*;
public class Payment extends Reservation{
    private int city;
    private int amount,GST=25;
    private String payment_type;
    private String A,B;
    private int n,ch,m;
    int ticket_amount;

    Scanner sc=new Scanner(System.in);

    public void payment_method() {
        do{

            System.out.println("1.Nanded-to-Jalana");
            System.out.println("2.Parbhani-to-Aurangabad");
            System.out.println("3.Nanded-to-Ahmadnagar");
            System.out.println("4.Pune-to-Mumbai");
            System.out.println("5.Kolhapur-to-Pune");
            System.out.println("6.Pune-to-Parbhani");
            System.out.println("7.Jalana-to-Parbhani");
            System.out.println("8.Nanded-to-Parbhani");
            System.out.println("9.Auraganbad-to-Pune");
            System.out.println("10.Ahmadnager-to-Pune");
            city=sc.nextInt();
            switch(city){
                case 1:
                if(city==1){
                    System.out.println("1.Nanded-to-Jalana");
                    System.out.println("Ticket :- 200");
                }
                case 2:
                if(city==2){
                    System.out.println("2.Parbhani-to-Aurangabad");
                    System.out.println("Ticket :-100");
                }
                case 3:
                if(city==3){
                    System.out.println("3.Nanded-to-Ahmadnagar");
                    System.out.println("Ticket :-300");
                }
                case 4:
                if(city==4){
                    System.out.println("4.Pune-to-Mumbai");
                    System.out.println("Ticket :-100");
                }
                case 5:
                if(city==5){
                    System.out.println("5.Kolhapur-to-Pune");
                    System.out.println("Ticket :-250");
                }
                case 6:
                if(city==6){
                    System.out.println("6.Pune-to-Parbhani");
                    System.out.println("Ticket :-941");
                }
                case 7:
                if(city==7){
                    System.out.println("7.Jalana-to-Parbhani");
                    System.out.println("Ticket :-150");
                }
                case 8:
                if(city==8){
                    System.out.println("8.Nanded-to-Parbhani");
                    System.out.println("Ticket :-50");
                }
                case 9:
                if(city==9){
                    System.out.println("9.Auraganbad-to-Pune");
                    System.out.println("Ticket :-350");
                }
                case 10:
                if(city==10){
                    System.out.println("10.Ahmadnager-to-Pune");
                    System.out.println("Ticket :-200");
                }
            }
            
        
            System.out.println("Please choose payment type which you want to safely pay");
            System.out.println("1.UPI\n2.Credit card\n3.Debit card\n4.Yono SBI");
            payment_type=sc.next();
            if(n==1){
                A="UPI";
            }else if(n==2){
                A="Credit card";
            }else if(n==3){
                A="Debit card";
            }else if(n==4){
                A="Yono SBI";
            }

            
            System.out.println("Pay for Reservation what your root that way with GST");
            amount=sc.nextInt();
            ticket_amount=amount+GST;
            if(ticket_amount==amount+GST){
                System.out.println("Congrats !! Your ticket is successfull in that amount " + ticket_amount);
            }else{
                System.out.println("Sorry ! Ticket cancelled.");
            }
           
            
            System.out.println("Do you want to continue ?\n1.Yes\n2.No");
            ch=sc.nextInt();

        }while(ch==1);    

    }
    public void output() {
            System.out.println(city);
            System.out.println(A);
            System.out.println(ticket_amount);
    }
    
}
