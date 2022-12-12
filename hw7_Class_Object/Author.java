public class Author {
    private String authorName;
    private String authorLastName;
    private int age;

    public Author(String authorName, String authorLastName, int age) {
        this.authorName = authorName;
        this.authorLastName = authorLastName;
        this.age = age;
    }

    public String getAuthorName() {
        return this.authorName;
    }
    public String getAuthorLastName() {
        return this.authorLastName;
    }
    public int getAge() {
        return this.age;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
