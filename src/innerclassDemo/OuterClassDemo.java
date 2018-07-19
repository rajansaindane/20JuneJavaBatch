package innerclassDemo;

public class OuterClassDemo {

    private int a=10;

    class LocalInnerDemo
    {
        void display()
        {

           class MethodInner{

               void methodInner()
               {
                   System.out.println("inside method inner");
               }

           }
           MethodInner methodInner=new MethodInner();
           methodInner.methodInner();
        }
    }

    void show()
    {
        System.out.println("inside show");
    }

    public static void main(String[] args) {
        OuterClassDemo localInnerDemo=new OuterClassDemo();
        OuterClassDemo.LocalInnerDemo innerDemo=localInnerDemo.new LocalInnerDemo();
        innerDemo.display();
        DemoClass demoClass=new DemoClass() {
            @Override
            void shoeData() {
                System.out.println("inside show");
            }
        };
        demoClass.shoeData();
    }


}
