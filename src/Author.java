public class Author {
    private String surname;
    private String name;

    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getSurname(){
        return this.surname;}
    public String getName(){
        return this.name;}

    @Override
    public String toString() {
        return "Автор: " +
                name + " " + surname;
    }
}
