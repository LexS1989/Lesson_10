package skypro.ru;

import java.util.Objects;

public class Author {
    private String name;
    private String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return this.name + " " + lastName;
    }

    @Override
    public String toString() {
        return "Автор: " + name + " " + lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author n = (Author) other;
        return name.equals(n.name) && lastName.equals(n.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}
