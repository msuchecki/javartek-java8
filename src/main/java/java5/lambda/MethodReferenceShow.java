package java5.lambda;

/**
 * Created with IntelliJ IDEA.
 * User: msuchecki
 * Date: 12/10/13
 * Time: 2:28 PM
 */
public class MethodReferenceShow {

    public static void main(String[] args) {


        ((Printer) System.out::println).print("Ala ma kota");


    }

    interface Printer {
        void print(String s);
    }

}

