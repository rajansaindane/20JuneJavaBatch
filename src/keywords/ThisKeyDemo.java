package keywords;

import java.util.Scanner;

/**
 * Created by rajan on 26/6/18.
 */
public class ThisKeyDemo {

    static int id;
    static String name;
    static String address;

     ThisKeyDemo(int id, String name, String address) {
         this("aasd");
         this.name=name;
        this.id=id;
        this.address=address;

     }
    ThisKeyDemo(String name)
    {
        this(121);
        System.out.println("inside default : "+name);
        display();
    }
    ThisKeyDemo(int id)
    {
        System.out.println("inside default : "+id);
    }

    void display()
    {
        System.out.println("name:"+name+
        "\nid:"+id+
        "\nadd:"+address);
    }

    public static void main(String[] args) {
        System.out.println("enter details : ");
        Scanner scanner=new Scanner(System.in);
        id=scanner.nextInt();
        name=scanner.next();
        address=scanner.nextLine();
        ThisKeyDemo thisKeyDemo=new ThisKeyDemo(id,name,address);
    }
}
