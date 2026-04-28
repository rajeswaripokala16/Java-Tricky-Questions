
import java.util.Date;

public class AboutJavaFile {
    public static void main(String[] args) {
        System.out.println("This is a random Java file.");
        System.out.println("The current time is " + System.currentTimeMillis());
        System.out.println("The current date and time is " + new Date());
        System.out.println("The current user is " + System.getProperty("user.name"));
        System.out.println("The current working directory is " + System.getProperty("user.dir"));
        System.out.println("The current operating system is " + System.getProperty("os.name"));
        System.out.println("The current architecture is " + System.getProperty("os.arch"));
        System.out.println("The current version of the JVM is " + System.getProperty("java.version"));
        System.out.println("The current vendor of the JVM is " + System.getProperty("java.vendor"));
        System.out.println("The current home directory of the JVM is " + System.getProperty("java.home"));
        System.out.println("The current temporary directory of the JVM is " + System.getProperty("java.io.tmpdir"));
    }
}
