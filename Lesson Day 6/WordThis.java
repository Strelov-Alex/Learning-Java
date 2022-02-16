package GetterAndSetter;

public class WordThis {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Василий");
        human1.setAge(20);
        human1.speak();
        Human human2 = new Human();
        human2.setName("Николай");
        human2.setAge(65);
        human2.speak();
    }
}

class Human {
    private String name;
    private int age;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void speak() {
        System.out.println("Моего друга зовут " + name + ". Ему " + age + " лет.");
    }
}