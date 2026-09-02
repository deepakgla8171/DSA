package Daalab;
import java.util.*;
public class extracting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
         while(n>0){
            System.out.println(n % 10);
               n= n / 10;

         }
    }
}
