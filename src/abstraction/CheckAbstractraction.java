package abstraction;

import java.util.Scanner;

public class CheckAbstractraction extends AbsratctClass implements InterfaceDemo{

    @Override
    int intValue(int a, int b) {
        int result=a+b;
        return result;
    }

    void showData()
    {
        int id;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name : ");
        String name=scanner.nextLine();
        System.out.println("enter id : ");
        id=scanner.nextInt();
        System.out.println("id : "+id+ " name : "+name);
    }

    public static void main(String[] args) {
        CheckAbstractraction checkAbstractraction =new CheckAbstractraction();
        System.out.println("result = "+ checkAbstractraction.intValue(1,2));
        checkAbstractraction.showData();
    }


    @Override
    public int math(int a, int b) {
        return 0;
    }

}
