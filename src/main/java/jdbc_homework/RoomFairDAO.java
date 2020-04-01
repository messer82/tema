package jdbc_homework;

import java.sql.SQLException;
import java.util.List;

public interface RoomFairDAO {
    List<RoomFair> findAllRoomFair() throws SQLException;
    int findRoomFairIdByValue(Double value);
    void insert(RoomFair roomFair);
    void delete(int id);
}
