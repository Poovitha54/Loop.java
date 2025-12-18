import java.util.Scanner;
public class AlphabetRange {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char start=sc.next().charAt(0);
        char end=sc.next().charAt(0);

        for(char c=start;c<=end;c++)
            System.out.print(c+" ");
    }
}
