
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        int a = 0;
        int f = 0;
        int c = 0;
        int d = 0;
        int flag = 0;
        try {
            Scanner console = new Scanner(System.in);
            System.out.println("Введите первое значение");
            a = console.nextInt();
            System.out.println("Введите второе значение");
            f = console.nextInt();
            System.out.println("Введите третье значение");
            c = console.nextInt();
            System.out.println("Введите четвёртое значение");
            d = console.nextInt();
            console.close();
            }
        catch (InputMismatchException e) {
            System.out.println("Error");
            flag=1;
        }
        if ((a<=f) & (a<=c) & (a<=d) & (flag==0)) {
            flag=1;
            System.out.print (a);
            System.out.print(" Первое значение наименьшее");
        }
        if ((f <= a) & (f <= c) & (f <= d) & (flag==0)) {
                flag=1;
                System.out.print (f);
                System.out.print(" Второе значение наименьшее");
        }

        if ((c <= a) & (c <= f) & (c <= d) & (flag==0)) {
            System.out.print (c);
            System.out.print(" Третье значение наименьшее");
            flag=1;
        }
        if ((d <= a) & (d <= f) & (d <= c) & (flag==0)) {
            System.out.print(d);
            System.out.print(" Четвёртое значение наименьшее");
            flag = 1;
        }
    }
}
