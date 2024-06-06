public class Reverse_a_String {

    public static void main (String []args) {

        String Str = "Vignesh Subramanian";

        String Rev = "";

// increamental approach

        char ch;

        for(int Start = 0 ;Start<Str.length();Start++){

            ch = Str.charAt(Start);

            Rev =  ch+Rev;


        }

        System.out.println(Rev);







































    }


























}