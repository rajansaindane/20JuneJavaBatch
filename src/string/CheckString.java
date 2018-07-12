package string;

public class CheckString {

    public String strindDemo()
    {
        String s="codekul";

        for (int i=0;i<10000;i++)
        {
            s=s.concat("institute");
        }
        return s;
        }

    public StringBuffer strindBufferDemo()
    {
        StringBuffer s=new StringBuffer("codekul");

        for (int i=0;i<10000;i++)
        {
            s=s.append("institute");
        }
        return s;
    }

    public StringBuilder strindBuilderDemo()
    {
        StringBuilder s=new StringBuilder("codekul");

        for (int i=0;i<10000;i++)
        {
            s=s.append("institute");
        }
        return s;
    }

    public static void main(String[] args) {
        CheckString checkString= new CheckString();
        Long currentTimeForString=System.currentTimeMillis();
        checkString.strindDemo();
        System.out.println("String Execution Time : "+(System.currentTimeMillis()-currentTimeForString)+"ms");

        Long currentTimeForStringBuffer=System.currentTimeMillis();
        checkString.strindBufferDemo();
        System.out.println("StringBuffer Execution Time : "+(System.currentTimeMillis()-currentTimeForStringBuffer)+"ms");

        Long currentTimeForStringBuilder=System.currentTimeMillis();
        checkString.strindBuilderDemo();
        System.out.println("String Builder Execution Time : "+(System.currentTimeMillis()-currentTimeForStringBuilder)+"ms");

    }


}
