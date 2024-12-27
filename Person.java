public class Person implements Comparable<Person> {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        // Compare by age
        return Integer.compare(this.age, other.age);
    }

    public static void main(String[] args) {
        Person person1 = new Person(23);
        Person person2 = new Person(24);

        int result = person1.compareTo(person2);
        System.out.println(result);
    }
}
