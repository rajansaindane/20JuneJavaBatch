package controlstatement;

import java.util.Scanner;

/**
 * Created by rajan on 22/6/18.
 */
public class ElseIfDemo {
    public static void main(String[] args) {
        int percentage;
        System.out.println("enter per : ");
        Scanner scanner=new Scanner(System.in);
        percentage=scanner.nextInt();

        if(percentage<35)
        {
            System.out.println("fail");
        }
        else if(percentage>=35 && percentage<60)
        {
            System.out.println("pass");
        }
        else if(percentage>=60 && percentage<=100)
        {
            System.out.println("first");
        }
        else
        {
            System.out.println("invalid");
        }
    }
}
