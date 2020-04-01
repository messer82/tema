package jdbc_homework;

import java.sql.SQLException;
import java.util.List;

public interface AccommodationDAO {
    List<Accommodation> findAllAccommodation() throws SQLException;
    List<Accommodation> findAccommodationByObject(Accommodation accommodation);
    void insert(Accommodation accommodation) throws SQLException;
    void delete(int id);
}
