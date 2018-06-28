package loops;

/**
 * Created by rajan on 25/6/18.
 */
public class UneryOperators {
    public static void main(String[] args) {

        int a=10;
        int b=++a;//a=11b=11
        int c=(++a)+(b++);//c=23a=12b=12
        int d=c++;//d=23c=24
        int e=(++d)+(c++)+(++a)+(b++);//e=24+24+13+12=73
        System.out.println("a "+a);
        System.out.println("b "+b);
        System.out.println("c "+c);
        System.out.println("d "+d);
        System.out.println("e "+e);

    }
}
