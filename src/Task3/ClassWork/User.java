package Task3.ClassWork;

public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLengthException {
        if (name.length() > 20) {
                throw new IllegalNameLengthException("The length of name must be less than 20.\nEntered name was " + name);
        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age <= 0 || age >= 100) {
            throw new IllegalAgeException("Age must be between 0 and 100.\nEntered value is " + age);
        }
        this.age = age;
    }
}
