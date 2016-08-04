/**
 * Created by Andrew on 04.08.2016.
 */
public class Main {


    public static void main(String[] args) {
        String S = new String("HELLO");
        System.out.println(S);
        S = S.substring(0,S.length()-1);
        System.out.println(S);

        megaclass.printOne();
        megaclass.printTwo();

        System.out.println(megaclass.Addition(5,6));
        System.out.println(megaclass.Multiplication(5,6));
    }
}
