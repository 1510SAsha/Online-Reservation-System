import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x;
        String password1 = null;
        int ch;
        Scanner sc = new Scanner(System.in);

        // Payment obj = new Payment();
        // obj.getinfo();
        // obj.reservation_process();
        // obj.Display();
        // obj.outcomes();
        // obj.payment_method();
        // obj.output();

        ArrayList<Payment> register_list = new ArrayList<>();

        do {
            System.out.println("1.Register\n2.Reservation\n3.Payment\n4.Display");
            x = sc.nextInt();

            switch (x) {
                case 1:
                    Payment obj = new Payment();
                    System.out.println("DO REGISTERATION FOR ONLINE RESERVATION");
                    obj.getinfo();
                    register_list.add(obj);
                case 2:
                    System.out.println("Login your account ");
                    System.out.println("Enter a password");
                    password1 = sc.next();
                    for (int i = 0; i < 1; i++) {
                        if (register_list.get(i).password.equals(password1)) {
                            System.out.println("You successfully login");
                            register_list.get(i).reservation_process();
                        } else {
                            System.out.println("Your password invalid");
                        }
                    }
                case 3:
                    for (int i = 0; i < 1; i++) {
                        if (register_list.get(i).password.equals(password1)) {
                            register_list.get(i).payment_method();
                            // register_list.get(i).payment_method();

                        }
                    }

                case 4:
                    for (int i = 0; i < 1; i++) {
                        if (register_list.get(i).equals(password1)) {
                            register_list.get(i).Display();
                            register_list.get(i).outcomes();
                            register_list.get(i).output();
                        }
                    }

            }

            System.out.println("Do you want to continue this process:\n" + "1.YES\n" + "2.NO");
            ch = sc.nextInt();

        } while (ch == 1);

    }

}
