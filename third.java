import java.util.Scanner;
public class third {
    public static void main (String [] args) {

        int i;
        int elements;
        Scanner scnr = new Scanner(System.in);

        System.out.println("How many elements do you want to put?");
        elements = scnr.nextInt();

        int [] integers = new int[elements];

        System.out.print("Now, please put your numbers here:");
        for(i = 0; i < integers.length ; ++i){
            integers[i] = scnr.nextInt();
        }

        for (i = integers.length-1; i >=0 ; --i){
            System.out.print(integers[i]);
        }


    }
}
