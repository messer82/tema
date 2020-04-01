package jdbc_homework;

import java.sql.SQLException;
import java.util.List;

public interface AccommodationFairRelationDAO {
    List<AccommodationFairRelation> findAllAccommodationFairRelation() throws SQLException;
    List<AccommodationFairRelation> findAllAccommodationFairRelationByName(String name);
    void insert(AccommodationFairRelation accommodationFairRelation);
    void delete(int id);
}
