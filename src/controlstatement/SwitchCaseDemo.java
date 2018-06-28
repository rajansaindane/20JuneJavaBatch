package controlstatement;

import java.util.Scanner;

/**
 * Created by rajan on 22/6/18.
 */
public class SwitchCaseDemo {
    public static void main(String[] args) {

        System.out.println(
                "1.add\n"+ "2.sub\n"+ "3.mul");
        int choice,a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value of a and b : ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        System.out.print("enter your choice : ");
        choice=scanner.nextInt();


        switch (choice)
        {
            case 1:
                System.out.println("add : "+(a+b));
                break;
            case 2:
                System.out.println("sub : "+(a-b));
                break;
                case 3:
                System.out.println("mul : "+(a*b));
                break;
                default:
                System.out.println("invalid");
        }
    }
}
