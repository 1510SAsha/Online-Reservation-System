import java.security.Principal;
import java.util.*;

public class Reservation extends Register{
    private String CityBranch;
    private String Berthtype;
    private String traintype;
    private String tno;
    private int classtype;
    private int C,N,ch,D,B;
    private String a,b,c,d;
    private int dt,m,yr;
    
    Scanner sc=new Scanner(System.in);

    public void reservation_process() {

        do {
            System.out.println("Enter the Date of Journey");
            System.out.println("Date");
            dt = sc.nextInt();
            System.out.println("Month");
            m= sc.nextInt();
            System.out.println("Year");
            yr = sc.nextInt();
        } while (dt> 31 || dt < 0 || m > 12 || m < 0 || yr < 1900 || yr > 2022);
        
        do{
            System.out.println("Choose a city where you want to go");
            System.out.println("1.Pune\n2.Nanded\n3.Parbhani\n4.Jalana\n5.Aurangabad\n6.Kolhapur\n7.Ahmadnagar\n8.Mumbai");
            CityBranch=sc.next();
            if(C==1){
                a="Pune";
            }else if(C==2){
                a="Nanded";
            }else if(C==3){
                a="Parbhani";
            }else if(C==4){
                a="Jalana";
            }else if(C==5){
                a="Aurangabad";
            }else if(C==6){
                a="Kolhapur";
            }else if(C==7){
                a="Ahmadnagar";
            }else if(C==8){
                a="Mumbai";
            }
            System.out.println("Enter a Train type");
            System.out.println("1.Panawela\n2.Deccan Express\n3.Manmad\n4.NndPuneExpress");
            traintype=sc.next();
            if(N==1){
                b="Panwela";
                tno=" 11091";
            }else if(N==2){
                b="Decan Express";
                tno="11007";
            }else if(N==3){
                b="Manmad";
                tno="11005";
            }else if(N==4){
                b="NndPuneExpress";
                tno="17614";

            }
            System.out.println("Which class if you want in train");
            System.out.println("Given seats");
            System.out.println("1.1A (AC 1 Tier) ");
            System.out.println("2.2A (AC 2 Tier)");
            System.out.println("3.3A (AC 3 Tier)");
            System.out.println("4.SL (Sleeper)");
            System.out.println("5.2S (2nd Seating)");
            System.out.println("Super fast charge :-");
            System.out.println("6.1A (AC 1 Tier)");
            System.out.println("7.2A (AC 2 Tier)");
            System.out.println("8.3A (AC 3 Tier)");
            System.out.println("9.SL (Sleeper)");
            System.out.println("choose your seat type  ");
            classtype=sc.nextInt();
            switch(classtype){
                case 1:
                if(classtype==1){
                    System.out.println("1A (AC 1 Tier)");
                    
                }
                case 2:
                if(classtype==2){
                    System.out.println("2A (AC 2 Tier)");
                    
                }
                case 3:
                if(classtype==3){
                    System.out.println("3A (AC 3 Tier)");
                   
                }
                case 4:
                if(classtype==4){
                    System.out.println("SL (Sleeper)");
                    
                }
                case 5:
                if(classtype==5){
                    System.out.println("2S (2nd Seating)");
                    
                }
                case 6:
                if(classtype==6){
                    System.out.println("1A (AC 1 Tier)");
                    
                }
                case 7:
                if(classtype==7){
                    System.out.println("2A (AC 2 Tier)");
                    
                }
                case 8:
                if(classtype==8){
                    System.out.println("SL (Sleeper) ");
                    
                }
                case 9:
                if(classtype    ==9){
                    System.out.println("SL (Sleeper)");
                   
                }
                
            }

            System.out.println("choose a Berth Type");
            System.out.println("1.Lower\n2.Middle\n3.Upper");
            Berthtype=sc.next();
            if(B==1){
                d="Lower";
            }else if(B==2){
                d="Middle";
            }else if(B==3){
                d="Upper";
            }



            System.out.println("Do you want to change the branch:\n" + "1.YES\n" + "2.NO");
            ch = sc.nextInt();


        }while(ch==1);

        

    }

    public void outcomes() {
        System.out.println("Date of journey" +dt+"/"+m+"/"+yr);
        System.out.println("Which city we want to go" +a);
        System.out.println("Please enter a train type" +b);
        System.out.println("Train Number" +tno);
        System.out.println("Class Type" +c);
        System.out.println("Berth Type" +d);
    }

    

}