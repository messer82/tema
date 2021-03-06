package oop_homework.punctul4;

import java.util.*;

public class Catalog {
    private List<Books> collection;

    public Catalog() {
        collection = new ArrayList<Books>();
    }

    public void addBook(Books book) {
        collection.add(book);
    }

    @Override
    public String toString() {
        String total = "\n";
        for (int i = 0; i < collection.size(); i++) {
            Books b = collection.get(i);
            total = total + b.toString();
        }
        return total;
    }

    public void removeIf(String book) {
        collection.removeIf(book1 -> book1.getTitle().equals(book));

    }
}


//    String mysteryNovel = "Mystery Book";
//    String sciFiNovel = "SciFi Book";
//    String adventureNovel = "Adventure Book";
//    String horrorNovel = "Horror Book";
//
//    int numberOfPages = 100 + new Random().nextInt(900);
//
//    String[] mNovels = {mysteryNovel, String.valueOf(numberOfPages)};
//    String[] sNovels = {sciFiNovel, String.valueOf(numberOfPages)};
//    String[] aNovels = {adventureNovel, String.valueOf(numberOfPages)};
//    String[] hNovels = {horrorNovel, String.valueOf(numberOfPages)};
//
//    List<String[]> novelList = Arrays.asList(mNovels,sNovels,aNovels,hNovels);
//    a = novelList;