import com.lesson.*;

public class Main {
    public static void main(String[] args) {
        ExampleStaticFieldClass exampleStaticFieldClass = new ExampleStaticFieldClass();
        exampleStaticFieldClass.nonStaticField = 4;

        ExampleStaticFieldClass exampleStaticFieldClass2  = new ExampleStaticFieldClass();
        exampleStaticFieldClass.nonStaticField = 5;

    }
}