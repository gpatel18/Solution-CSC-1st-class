import java.util.Scanner;
public class first{
    public static void main (String [] args) {
        int [] fourNum = new int[4];
        int i;
        Scanner scnr = new Scanner(System.in);

        for(i = 0; i < fourNum.length; ++i ){
            fourNum[i] = scnr.nextInt();
        }

        if (fourNum[0] == fourNum[1] && fourNum[1] == fourNum[2] && fourNum[2] == fourNum[3]){
            System.out.print("equal");
        }
        else {
            System.out.print("not equal");
        }

    }
}
