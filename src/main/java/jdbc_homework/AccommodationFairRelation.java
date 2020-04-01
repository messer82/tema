package jdbc_homework;

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
        this.idAccomodation = accommodation.getId();
    }

    public int getIdRoomFair() {
        return idRoomFair;
    }

    public void setIdRoomFair(int idRoomFair) {
        this.idRoomFair = roomFair.getId();
    }

    public AccommodationFairRelation(/*int id, */int idAccomodation, int idRoomFair) {
//        this.id = id;
        this.idAccomodation = accommodation.getId();
        this.idRoomFair = roomFair.getId();
    }

    public AccommodationFairRelation() {

    }
}
