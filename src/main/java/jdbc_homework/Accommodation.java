package jdbc_homework;

public class Accommodation {

    RoomFair roomFair = new RoomFair();

    private int id;
    private String type;
    private String bed_type;
    private int max_guests;
    private String description;

    @Override
    public String toString() {
        return "Accomodation{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", bed_type='" + bed_type + '\'' +
                ", max_guests=" + max_guests +
                ", description='" + description + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBed_type() {
        return bed_type;
    }

    public void setBed_type(String bed_type) {
        this.bed_type = bed_type;
    }

    public int getMax_guests() {
        return max_guests;
    }

    public void setMax_guests(int max_guests) {
        this.max_guests = max_guests;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Accommodation(/*int id, */String type, String bed_type, int max_guests, String description) {
//        this.id = id;
        this.type = type;
        this.bed_type = bed_type;
        this.max_guests = max_guests;
        this.description = description;
    }

    public Accommodation() {

    }

    public void accommodationTypeToRoomFairValue() {
        switch (this.type) {
            case "small":
                roomFair.setValue(10);
                break;
            case "medium":
                roomFair.setValue(20);
                break;
            case "large":
                roomFair.setValue(30);
                break;
        }
    }

}
