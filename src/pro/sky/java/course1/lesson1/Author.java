package pro.sky.java.course1.lesson1;
import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
    @Override
    public boolean equals(Object other) {
        if(other == null || this.getClass() != other.getClass()){
            return false;
        }
        Author firstName2 = (Author) other;
        return toString().equals(firstName2.toString());
    }

    @Override
    public int hashCode() {
        return  Objects.hash(firstName,lastName);
    }

}
