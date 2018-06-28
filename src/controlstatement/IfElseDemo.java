package controlstatement;

import java.util.Scanner;

/**
 * Created by rajan on 22/6/18.
 */
public class IfElseDemo {
    public static void main(String[] args) {
        int num;
        String name;

        System.out.print("enter the name and num : ");

        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();
        if(num%2==0)
        {
            System.out.println("even num");
        }
        else
        {
            System.out.println("odd num");
        }
    }
}
