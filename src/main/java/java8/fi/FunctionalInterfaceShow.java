package java8.fi;

/**
 * Created with IntelliJ IDEA.
 * User: msuchecki
 * Date: 12/10/13
 * Time: 6:26 PM
 */
public class FunctionalInterfaceShow {

    public static void main(String[] args) {

        new SimpleFuncImpl().doWork();

    }

    static class SimpleFuncImpl implements SimpleFuncInterface {
    }
}
