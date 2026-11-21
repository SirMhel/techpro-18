class Student {
    String name;

    void introduce() {
        System.out.println("Hello, I am " + name + ".");
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student first = new Student();
        first.name = "Mia";

        Student second = new Student();
        second.name = "Leo";

        first.introduce();
        second.introduce();
    }
}
