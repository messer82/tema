package OOP_homework.Punctul4;


public class Books {
    private String title, type;
    private int numberOfPages;

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
