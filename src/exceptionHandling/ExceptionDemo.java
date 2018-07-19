package exceptionHandling;

public class ExceptionDemo {


    public static void main(String[] args) {
        String s="abcd";
        String s1=new String("abcd");
        String s2="abc";
        if(s==s1)
        {
            System.out.println(s.hashCode());
            System.out.println(s1.hashCode());
            System.out.println("true");
        }
        else
        {
            System.out.println(s.hashCode());
            System.out.println(s1.hashCode());
            System.out.println("false");

        }
        try {
            int[] array=new int[10];
            String name="chetan";
            System.out.println(name);
            try {


                System.out.println(Integer.parseInt(name));
            }catch (NumberFormatException e)
            {
                System.out.println(e);

            }
            }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("rest of the code....");
        }

    }

}
