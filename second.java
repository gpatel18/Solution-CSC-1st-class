import java.util.Scanner;
public class second {
    public static void main (String [] args){
        double temF;
        double temC;
        Scanner scnr = new Scanner(System.in);

        temF = scnr.nextDouble();

        temC = ((temF - 32) * 5)/9;

        System.out.print(temC);
    }


}
