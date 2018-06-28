/**
 * Created by rajan on 21/6/18.
 */
public class FirstDemo {

    static int i;
     void showName()
    {
        System.out.println("Inside show");
    }

    void showName(String name)
    {
        System.out.println(name);

    }

    String showName(String name,String address)
    {
        return name.concat(address);
    }
    int addition(int a,int b)
    {
        return (a+b);
    }

    public static void main(String[] args) {

        FirstDemo firstDemo=new FirstDemo();

        firstDemo.showName("codekul");
     }

}
