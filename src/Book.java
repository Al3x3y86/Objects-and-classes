public class Book {
    String titleOfTheBook;
    Author nameAuthor;
    private int yearOfPublication;

    public Book(String titleOfTheBook, int yearOfPublication, Author nameAuthor) {
        this.titleOfTheBook = titleOfTheBook;
        this.yearOfPublication = yearOfPublication;
        this.nameAuthor = nameAuthor;
    }
    public String getTitleOfTheBook() {
        return this.titleOfTheBook;
    }
    public String getNameAuthor() {
        return this.nameAuthor.firstname+" "+this.nameAuthor.lastname;
    }
    public int getYearOfPublication() {
        return this.yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}