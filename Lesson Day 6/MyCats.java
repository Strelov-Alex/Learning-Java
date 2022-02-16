public class MyCats {
    public static void main(String[] args) {
        Person1 newperson = new Person1();
        newperson.setName("Иван");
        newperson.setAge(25);
        newperson.speak();

    }
}

class Person1 {
    private String name;
    private int age;

    public void setName(String catName) {
        name = catName;
    }


    public String getName() {
        return name;
    }

    public void setAge(int catAge) {
        age = catAge;
    }

    public int getAge() {
        return age;
    }

    int calculateYears() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет.");

    }

}


