public class Person {

    private final String name;
    private final SimpleDate birthday;
    private final int height;
    private final int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person comparedPerson = (Person) compared;

        if (this.name.equals(comparedPerson.name)
                && this.birthday.equals(comparedPerson.birthday) && this.weight == comparedPerson.weight &&
                this.height == comparedPerson.height) {
            return true;
        }
        return false;
    }

    // implement an equals method here for checking the equality of objects
}
