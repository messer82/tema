package jdbc_homework.jdbc_homework;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class BookingAppDAOImplTest implements BookingAppDAO {
    Accommodation accommodation = new Accommodation();
    RoomFair roomFair = new RoomFair();
    AccommodationFairRelation accommodationFairRelation= new AccommodationFairRelation();
    BookingAppDAO bookingAppDAO = new BookingAppDAOImpl();

    @Test
    public void testBookingAppDAOImpl() throws SQLException {
        double value = bookingAppDAO.findRoomFairById(bookingAppDAO.findAllAccommodationFairRelations().iterator().next().getIdRoomFair()).stream().iterator().next().getValue();
        Assert.assertTrue(10 == value);
    }

    private Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/prima",
                    "postgres",
                    "pishititza1986");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Accommodation> findAccommodationByType(String type, String description) throws SQLException {
        return null;
    }

    @Override
    public List<RoomFair> findAllRoomFairs() throws SQLException {
        return null;
    }

    @Override
    public List<AccommodationFairRelation> findAllAccommodationFairRelations() throws SQLException {
        return null;
    }

    @Override
    public void insertAccommodation(Accommodation accommodation) {

    }

    @Override
    public void insertRoomFair(RoomFair roomFair) {

    }

    @Override
    public void insertAccommodationFairRelation(AccommodationFairRelation accommodationFairRelation) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<RoomFair> findRoomFairId(double value, String season) throws SQLException {
        return null;
    }

    @Override
    public List<RoomFair> findRoomFairById(int id) throws SQLException {
        return null;
    }
}
