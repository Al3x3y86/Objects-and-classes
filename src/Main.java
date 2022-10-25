public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Author bulgakov = new Author("Михаил", "Булгаков");
        Book theMasterAndMargarita = new Book("Мастер и Маргарита", 1967, bulgakov);

        System.out.println("Название книги - "+theMasterAndMargarita.getTitleOfTheBook()+", Автор книги - "+ theMasterAndMargarita.getNameAuthor()+". Дата издательства - "+ theMasterAndMargarita.getYearOfPublication());

        Author turgenev = new Author("Иван", "Тургенев");
        Book fathersAndSons = new Book("Отцы и Дети", 1880, turgenev);
        fathersAndSons.setYearOfPublication(1862);

        System.out.println("Название книги - "+fathersAndSons.getTitleOfTheBook()+", Автор книги - "+ fathersAndSons.getNameAuthor()+". Дата издательства - "+ fathersAndSons.getYearOfPublication());
    }
}