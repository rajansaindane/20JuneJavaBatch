package string;

public class StringDemo {




    void showString()
    {
        String s="codekul";
        String s3=new String("codekul");
        String s2="codekul";
        StringBuffer stringBuffer=new StringBuffer("chetan");
        StringBuilder stringBuilder=new StringBuilder("Yeshi");
        stringBuffer.append(" yeshi");
        s.concat(" institute");
        System.out.println(s);
        System.out.println(stringBuffer.reverse());


       /* if(s.equals(s3))
        {
         s=s.concat("institute");
            System.out.println("s :  "+s+" s3 : "+s3);
        }
        else
        {
            System.out.println("different");
        }*/
    }

    public static void main(String[] args) {
        StringDemo stringDemo=new StringDemo();
        stringDemo.showString();

    }

}
