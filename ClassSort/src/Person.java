import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    private int age;
    private String name;
    private String hairColor;

    public Person(int age, String name, String hairColor) {
        this.age = age;
        this.name = name;
        this.hairColor = hairColor;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        if(this.age > p.getAge()){
            return 1;
        }else if(this.age < p.getAge()){
            return -1;
        }else return 0;
    }
}