public class Main {
    public static void main(String[] args) {
//    Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации. Типы полей
//    должны быть String, Author (который мы создадим  в п. 2) и int.

        Author bulgakov = new Author("Михаил", "Булгаков");

        Book masterAndMargarita = new Book("Мастер и Маргарита", 2010, bulgakov);
        masterAndMargarita.setYearOfPublication(2005);

        System.out.println(bulgakov);
        System.out.println(masterAndMargarita);


        Author dostoevskij = new Author("Федор", "Достоевский");
        Book crimeAndPunishment = new Book("Преступление и наказание", 1989, dostoevskij);
        crimeAndPunishment.setYearOfPublication(2001);

        System.out.println(dostoevskij);
        System.out.println(crimeAndPunishment);

        Book masterAndMargarita2 = new Book("Мастер и Маргарита", 2005, bulgakov);

        System.out.println(masterAndMargarita.equals(masterAndMargarita2));
        System.out.println(masterAndMargarita.equals(crimeAndPunishment));


    }
}
