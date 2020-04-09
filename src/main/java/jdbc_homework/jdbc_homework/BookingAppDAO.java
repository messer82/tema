package jdbc_homework.jdbc_homework;

import java.sql.SQLException;
import java.util.List;

public interface BookingAppDAO {
    List<Accommodation> findAccommodationByType(String type, String description) throws SQLException;

    List<RoomFair> findAllRoomFairs() throws SQLException;

    List<AccommodationFairRelation> findAllAccommodationFairRelations() throws SQLException;

    void insertAccommodation(Accommodation accommodation);

    void insertRoomFair(RoomFair roomFair);

    void insertAccommodationFairRelation(AccommodationFairRelation accommodationFairRelation);

    void delete(int id);

    public List<RoomFair> findRoomFairId(double value, String season) throws SQLException;

    public List<RoomFair> findRoomFairById(int id) throws SQLException;
}
