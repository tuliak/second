import com.lesson.Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Andrew");
        human.setName("Max");
        human.setName("Lex");
        System.out.println(human.getName());
        human.setAge(-12);
        System.out.println(human.getAge());
        System.out.println(human.getAge());
        human.setName(null);
        System.out.println(human.getName());
        human.setName("A");
        System.out.println(human.getName());
    }
}