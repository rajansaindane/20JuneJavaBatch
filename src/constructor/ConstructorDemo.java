package constructor;

/**
 * Created by rajan on 26/6/18.
 */
public class ConstructorDemo {

    ConstructorDemo()
    {

    }
    ConstructorDemo(String name)
    {
        System.out.println(name);
    }

    public static void main(String[] args) {
        new ConstructorDemo("codekul");
    }

}
