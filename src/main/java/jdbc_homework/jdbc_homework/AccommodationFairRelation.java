package jdbc_homework.jdbc_homework;

public class AccommodationFairRelation {
    private int id;
    private int idAccomodation;
    private int idRoomFair;

    Accommodation accommodation = new Accommodation();
    RoomFair roomFair = new RoomFair();

    @Override
    public String toString() {
        return "AccomodationFairRelation{" +
                "id=" + id +
                ", idAccomodation=" + idAccomodation +
                ", idRoomFair=" + idRoomFair +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAccomodation() {
        return idAccomodation;
    }

    public void setIdAccomodation(int idAccomodation) {
        this.idAccomodation = idAccomodation;
    }

    public int getIdRoomFair() {
        return idRoomFair;
    }

    public void setIdRoomFair(int idRoomFair) {
        this.idRoomFair = idRoomFair;
    }

    public AccommodationFairRelation(int idAccomodation, int idRoomFair) {
        this.idAccomodation = idAccomodation;
        this.idRoomFair = idRoomFair;
    }

    public AccommodationFairRelation() {

    }
}
