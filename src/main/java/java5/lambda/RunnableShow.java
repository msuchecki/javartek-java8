package java5.lambda;

/**
 * Created with IntelliJ IDEA.
 * User: msuchecki
 * Date: 12/10/13
 * Time: 2:04 PM
 */
public class RunnableShow {

    public static void main(String[] args) {
        Runnable runnable1 = () -> System.out.println("Running without Lambda");

        runnable1.run();
    }
}
