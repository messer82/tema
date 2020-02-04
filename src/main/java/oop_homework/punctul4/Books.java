package oop_homework.punctul4;


import java.util.Objects;

public class Books {
    private String title, type;
    private int numberOfPages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return numberOfPages == books.numberOfPages &&
                Objects.equals(title, books.title) &&
                Objects.equals(type, books.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, type, numberOfPages);
    }

    public Books() {
        title = null;
        type = null;
        numberOfPages = 0;
    }

    public Books(String title, String type, int numberOfPages) {
        this.title = title;
        this.type = type;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "\nTitle: " + title + "\nType: " + type + "\nNumberOfPages: " + numberOfPages;
    }
}
