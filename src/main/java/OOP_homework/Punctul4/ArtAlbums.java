package OOP_homework.Punctul4;

public class ArtAlbums extends Books {

    private String goodPaper;

    public String getGoodPaper(){
        return this.goodPaper;
    }
    public void setGoodPaper(String fGoodPaper) {
        this.goodPaper = fGoodPaper;
    }

    private String meanPaper;
    public String getMeanPaper() {
        return this.meanPaper;
    }
    public void setMeanPaper(String fMeanPaper) {
        this.meanPaper = fMeanPaper;
    }

    private String badPaper;
    public String getBadPaper() {
        return this.badPaper;
    }
    public void setBadPaper(String fBadPaper) {
        this.badPaper = fBadPaper;
    }
}
