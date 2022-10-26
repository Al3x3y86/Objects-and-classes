public class Book {
    private final String titleOfTheBook;
    private final Author Author;
    private int yearOfPublication;

    public Book(String titleOfTheBook, int yearOfPublication, Author nameAuthor) {
        this.titleOfTheBook = titleOfTheBook;
        this.yearOfPublication = yearOfPublication;
        this.Author = nameAuthor;
    }
    public String getTitleOfTheBook() {
        return this.titleOfTheBook;
    }
    public String getNameAuthor() {
        return this.Author.getFirstname()+ this.Author.getLastname();
    }
    public int getYearOfPublication() {
        return this.yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}