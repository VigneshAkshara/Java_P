import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

public class Scanner_les {

    public static void main(String[]args){

     Scanner Sc =  new Scanner(System.in);

        System.out.println("What is your Favourite Car ?");

        // Scan and store the User input in a String.

        String CarName = Sc.nextLine();
        System.out.println("How many You want to own ?");
        String No = Sc.nextLine();
        System.out.println("How many Super Cars you want to Own ");
        int Total = Sc.nextInt(); // After printing the Int whe need to provide
        Sc.nextLine();
        System.out.println("How  many countries you want to visit ?");

        String country = Sc.nextLine();

        System.out.println(CarName);
        System.out.println(No);
        System.out.println(Total);
        System.out.println(country);
    }


















}
