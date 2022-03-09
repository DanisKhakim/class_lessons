public class Friend {
    int age;
    char sex;
    String name;

    public void initialize(String name)
    {
        this.name = name;
    }
    public void initialize(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    public void initialize(char sex, int age, String name)
    {
        this.sex = sex;
        this.age = age;
        this.name = name;
    }
    Friend(String name) {
        this.name = name;
    }
    Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Friend(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
