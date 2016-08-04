/**
 * Created by Andrew on 04.08.2016.
 */
public class megaclass {

    static{
        /*String Path = "D:\\users\\andrew\\documents\\visual studio 2015\\Projects\\MathLibrary\\x64\\Debug\\MathLibrary.dll";
        System.load(Path);
        */
        System.loadLibrary("MathLibrary");

    }

    native public static void printOne();
    native public static void printTwo();
    native public static int Addition(int a, int b);
    native public static int Multiplication(int a, int b);
}
