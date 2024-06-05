import io.github.classgraph.ClassGraph;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        ClassGraph classGraph0 = new ClassGraph();
        ClassGraph classGraph1 = classGraph0.enableSystemJarsAndModules();
        ClassGraph classGraph3 = classGraph1.verbose(true);
        String[] strArray16 = new String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        classGraph3.acceptClasses(strArray16);
    }
}
