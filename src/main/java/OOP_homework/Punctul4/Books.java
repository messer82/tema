package OOP_homework.Punctul4;

import java.util.Arrays;
import java.util.Random;

public abstract class Books {
    static void carti() {
        int numarPagini = 100 + new Random().nextInt(900);

        Novels mystery = new Novels();
        mystery.setMystery("Carte mister");
        Novels sciFi = new Novels();
        sciFi.setSchiFi("Carte SciFi");
        Novels adventure= new Novels();
        adventure.setAdventure("Carte Aventuri");
        Novels horror = new Novels();
        horror.setHorror("Carte Horror");

        String[] numeCarti = {mystery.getMystery(),sciFi.getSchiFi(),adventure.getAdventure(),horror.getHorror()};
        System.out.println(Arrays.toString(numeCarti));

        ArtAlbums goodPaper = new ArtAlbums();
        goodPaper.setGoodPaper("Album nou calitate superioara");
        ArtAlbums meanPaper = new ArtAlbums();
        meanPaper.setMeanPaper("Album nou calitate medie");
        ArtAlbums badPaper = new ArtAlbums();
        badPaper.setBadPaper("Album nou calitate inferioara");

        String[] calitateHartie = {goodPaper.getGoodPaper(),meanPaper.getMeanPaper(),badPaper.getBadPaper()};
//        System.out.println(Arrays.toString(calitateHartie));

//        System.out.println("The book " + mystery.getMystery() + " has " + numarPagini + " pages.");
//        System.out.println(goodPaper.getGoodPaper() + " has " + numarPagini + " number of pages.");
    }

}
