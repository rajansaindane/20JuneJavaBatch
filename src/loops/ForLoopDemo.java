package loops;

/**
 * Created by rajan on 25/6/18.
 */
public class ForLoopDemo {
    public static void main(String[] args) {

        for (int i=0;i<4;i++)
        {

            for (int j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
   /* *
   * *
  * * *

*
* *
* * *

    1
   1 2
  1 2 3*/