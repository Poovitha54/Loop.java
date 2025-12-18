import java.util.Scanner;
public class Countbinary {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin=sc.next();
        int ones=0,zeros=0;

        for(char c:bin.toCharArray()) {
            if(c=='1')ones++;
            else if(c=='0')zeros++;
        }
        System.out.println("1s ="+ones);
        System.out.println("0s ="+zeros);
    }
}
