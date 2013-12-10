package java8.fi;

/**
 * Created with IntelliJ IDEA.
 * User: msuchecki
 * Date: 12/10/13
 * Time: 6:27 PM
 */
public interface SimpleFuncInterface {
    String toString();
    default public void doWork() {
        System.out.println("doWork");
    }
}
