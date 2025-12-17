import java.util.Scanner;
public class Squarecubes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sqSum=0,cubeSum=0;

        while (n>0){
            int d=n%10;
            sqSum+=d*d;
            cubeSum+=d*d*d;
            n/=10;
        }
        System.out.println("Square Sum="+sqSum);
        System.out.println("Cube Sum="+cubeSum);
    }
}
    
