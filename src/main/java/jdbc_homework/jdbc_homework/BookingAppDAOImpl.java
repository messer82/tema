package jdbc_homework.jdbc_homework;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//Definiti o baza de date pentru aplicatia de "booking" care sa contina urmatoarele tabele:
//- accomodation: cu urmatoarele  coloane:
//    -- id: int (primary key)
//    -- type: varchar (32)
//    -- bed_type: varchar (32)
//    -- max_guests: int
//    -- description: varchar(512)
//
//- room_fair: cu urmatoarele coloane
//    -- id: int (primary key)
//    -- value: double
//    -- season: varchar(32)
//
//- accomodation_fair_relation: cu urmatoarele coloane:
//    -- id: int (primary key)
//    -- id_accomodation: int (foreign key of accomodation)
//    -- id_room_fair: int (foreign key of room fair)
//
//2. Scrieti un unit test care sa insereze (INSERT INTO ... ) date in tabele folosindu-va de prepared statement si tineti cont de relationarea de date din accomodation_fair_relation.
//
//3. Scrieti un unit test care sa interogheze baza de date (SELECT * FROM ...) si tipariti la consola preturile pe fiecare camera din DB.

public class BookingAppDAOImpl implements BookingAppDAO {
    public static void main(String[] args) throws SQLException {
        BookingAppDAO bookingAppDAO = new BookingAppDAOImpl();

//        bookingAppDAO.insertAccommodation(new Accommodation("small", "single", 1, "corner room"));
//        bookingAppDAO.insertAccommodation(new Accommodation("small", "single", 1, "nice room"));
//        bookingAppDAO.insertAccommodation(new Accommodation("medium", "queen-size", 2, "nice view"));
//        bookingAppDAO.insertAccommodation(new Accommodation("medium", "queen-size", 2, "great room"));
//        bookingAppDAO.insertAccommodation(new Accommodation("large", "king-size", 2, "great terrace"));
//        bookingAppDAO.insertAccommodation(new Accommodation("large", "king-size", 2, "best room"));

//        bookingAppDAO.insertRoomFair(new RoomFair(10, "summer"));
//        bookingAppDAO.insertRoomFair(new RoomFair(15, "winter"));
//        bookingAppDAO.insertRoomFair(new RoomFair(20, "summer"));
//        bookingAppDAO.insertRoomFair(new RoomFair(25, "winter"));
//        bookingAppDAO.insertRoomFair(new RoomFair(30, "summer"));
//        bookingAppDAO.insertRoomFair(new RoomFair(35, "winter"));

//        bookingAppDAO.
//                insertAccommodationFairRelation
//                        (new AccommodationFairRelation
//                                (bookingAppDAO.
//                                        findAccommodationByType("large", "best room").
//                                        iterator().
//                                        next().
//                                        getId(),
//                                        bookingAppDAO.
//                                                findRoomFairId(35, "winter").
//                                                stream().
//                                                iterator().
//                                                next().
//                                                getId()));
        List<AccommodationFairRelation> accommodationFairRelationList = new ArrayList<>(bookingAppDAO.findAllAccommodationFairRelations());

        for (AccommodationFairRelation a: accommodationFairRelationList) {
            System.out.println(bookingAppDAO.findRoomFairById(a.getIdRoomFair()).stream().iterator().next().getValue());
        }

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
        List<Accommodation> accommodationList = new ArrayList<>();
        try(Connection connection = getConnection()) {
            String sqlQuery = "SELECT * FROM accommodations WHERE type = ? AND description = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, type);
            preparedStatement.setString(2, description);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Accommodation accommodation = new Accommodation();
                accommodation.setId(resultSet.getInt("id"));
                accommodation.setType(resultSet.getString("type"));
                accommodation.setBed_type(resultSet.getString("bed_type"));
                accommodation.setMax_guests(resultSet.getInt("max_guests"));
                accommodation.setDescription(resultSet.getString("description"));
                accommodationList.add(accommodation);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accommodationList;
    }

    @Override
    public List<RoomFair> findAllRoomFairs() throws SQLException {
        return null;
    }

    @Override
    public List<RoomFair> findRoomFairById(int id) throws SQLException {
        List<RoomFair> roomFairList = new ArrayList<>();
        try(Connection connection = getConnection()) {
            String sqlQuery = "SELECT * FROM room_fairs WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                RoomFair roomFair = new RoomFair();
                roomFair.setId(resultSet.getInt("id"));
                roomFair.setValue(resultSet.getDouble("value"));
                roomFair.setSeason(resultSet.getString("season"));
                roomFairList.add(roomFair);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return roomFairList;
    }

    @Override
    public List<AccommodationFairRelation> findAllAccommodationFairRelations() throws SQLException {
        List<AccommodationFairRelation> accommodationFairRelationList = new ArrayList<>();
        try(Connection connection = getConnection()) {
            String sqlQuery = "SELECT * FROM accommodation_fair_relations";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                AccommodationFairRelation accommodationFairRelation = new AccommodationFairRelation();
                accommodationFairRelation.setId(resultSet.getInt("id"));
                accommodationFairRelation.setIdAccomodation(resultSet.getInt("id_accommodations"));
                accommodationFairRelation.setIdRoomFair(resultSet.getInt("id_room_fairs"));
                accommodationFairRelationList.add(accommodationFairRelation);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accommodationFairRelationList;
    }

    @Override
    public void insertAccommodation(Accommodation accommodation) {
        try(Connection connection = getConnection()) {
String sqlQuery = "INSERT INTO accommodations (type, bed_type, max_guests, description) VALUES (?, ?, ?, ?)";
PreparedStatement preparedStatement =connection.prepareStatement(sqlQuery);
preparedStatement.setString(1, accommodation.getType());
preparedStatement.setString(2, accommodation.getBed_type());
preparedStatement.setInt(3, accommodation.getMax_guests());
preparedStatement.setString(4, accommodation.getDescription());
int numberOfRowsAffected =preparedStatement.executeUpdate();
if (numberOfRowsAffected == 1) {
    System.out.println("The accommodation was inserted");
} else {
    System.out.println("Something went wrong with the insertion of the accommodation!");
}
        } catch (SQLException e) {
e.printStackTrace();
        }
    }

    @Override
    public void insertRoomFair(RoomFair roomFair) {
try(Connection connection = getConnection()) {
    String sqlQuery = "INSERT INTO room_fairs (value, season) VALUES (?, ?)";
    PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
    preparedStatement.setDouble(1, roomFair.getValue());
    preparedStatement.setString(2, roomFair.getSeason());
    int numberOfRowsAffected = preparedStatement.executeUpdate();
    if (numberOfRowsAffected == 1) {
        System.out.println("The room fair was inserted!");
    } else {
        System.out.println("Something went wrong with the room fair insertion!");
    }
} catch (SQLException e) {
    e.printStackTrace();
}
    }

    @Override
    public void insertAccommodationFairRelation(AccommodationFairRelation accommodationFairRelation) {
try(Connection connection= getConnection()) {
    String sqlQuery = "INSERT INTO accommodation_fair_relations (id_accommodations, id_room_fairs) VALUES (?, ?)";
    PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
    preparedStatement.setInt(1, accommodationFairRelation.getIdAccomodation());
    preparedStatement.setInt(2, accommodationFairRelation.getIdRoomFair());
    int numberOfRowsAffected = preparedStatement.executeUpdate();
    if (numberOfRowsAffected == 1) {
        System.out.println("The accommodation fair relation was inserted!");
    } else {
        System.out.println("Something went wrong with the accommodation fair relation insertion!");
    }
} catch (SQLException e) {
    e.printStackTrace();
}
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<RoomFair> findRoomFairId(double value, String season) {
        List<RoomFair> roomFairList= new ArrayList<>();
        try(Connection connection = getConnection()) {
            String sqlQuery = "SELECT * FROM room_fairs WHERE value = ? AND season = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setDouble(1, value);
            preparedStatement.setString(2, season);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                RoomFair roomFair = new RoomFair();
                roomFair.setId(resultSet.getInt("id"));
                roomFair.setValue(resultSet.getDouble("value"));
                roomFair.setSeason(resultSet.getString("season"));
                roomFairList.add(roomFair);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return roomFairList;
    }

}