package pro.sky.java.course1.lesson1;

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

    public boolean equalsAuthor(Object other) {
        if(this.getClass() != other.getClass()){
            return false;
        }
        Author firstName2 = (Author) other;
        return firstName.equals(firstName2.firstName);
    }
    public int hashCode() {
        return  java.util.Objects.hash(lastName);
    }
}
