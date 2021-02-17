package classes;

public class Book {
    private String name;
    private String authorName;
    private int yearOfPublish;
    private String publishingHouse;
    private String Genre;
    private int countPages;

    public Book(String name, String authorName, int yearOfPublish, String publishingHouse, String genre, int countPages) {
        this.name = name;
        this.authorName = authorName;
        this.yearOfPublish = yearOfPublish;
        this.publishingHouse = publishingHouse;
        Genre = genre;
        this.countPages = countPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", Genre='" + Genre + '\'' +
                ", countPages=" + countPages +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }
}
