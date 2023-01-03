

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author (String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public void setEmail (String email) {
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return getName() + " , " + getGender() + " , " + getEmail();
    }
    public class TestAuthor{
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", " m ");

        public Author getAnAuthor() {
            return anAuthor;
            // System.out.println(anAuthor);
            anAuthor.setEmail("ahteck@somewhere.com");
            System.out.println(anAuthor);
        }

    }

}
