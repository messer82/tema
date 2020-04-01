package jdbc_homework;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookingAppImpl implements AccommodationDAO, RoomFairDAO, AccommodationFairRelationDAO {

    RoomFair roomFair= new RoomFair();
    Accommodation accommodation = new Accommodation();
    public static void main(String[] args) throws SQLException {
//        RoomFair roomFair= new RoomFair();
//        Accommodation accommodation = new Accommodation();
        AccommodationDAO accommodationDAO = new BookingAppImpl();
        RoomFairDAO roomFairDAO = new BookingAppImpl();
        AccommodationFairRelationDAO accommodationFairRelationDAO = new BookingAppImpl();

//        RoomFair smallRoom = new RoomFair(10, "one night");
//        RoomFair mediumRoom = new RoomFair(20, "one night");
//        RoomFair largeRoom = new RoomFair(30, "one night");
//
//        roomFairDAO.insert(smallRoom);
//        roomFairDAO.insert(mediumRoom);
//        roomFairDAO.insert(largeRoom);

        Accommodation accommodation1 = new Accommodation("small", "single", 1, "nice room");

//        accommodationDAO.insert(accommodation1);

//        AccommodationFairRelation accommodationFairRelation1 = new AccommodationFairRelation(accommodation1.getId(), );

//        accommodationFairRelationDAO.insert(accommodationFairRelation1);

        accommodationDAO.findAllAccommodation().forEach(System.out::println);
        roomFairDAO.findAllRoomFair().forEach(System.out::println);
        accommodationFairRelationDAO.findAllAccommodationFairRelation().forEach(System.out::println);
    }

    @Override
    public List<Accommodation> findAllAccommodation() {
        List<Accommodation> accommodationList = new ArrayList<>();
        try (Connection connection = getConnection()) {
            String sqlQuery = "SELECT * FROM accommodations";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
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
    public List<Accommodation> findAccommodationByObject(Accommodation accommodation) {
        try (Connection connection = getConnection()) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void insert(Accommodation accommodation) {
        try (Connection connection = getConnection()) {
            String sqlQuery = "INSERT INTO accommodations (/*id, */type, bed_type, max_guests, description) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
//            preparedStatement.setInt(1, accommodation.getId());
            preparedStatement.setString(1, accommodation.getType());
            preparedStatement.setString(2, accommodation.getBed_type());
            preparedStatement.setInt(3, accommodation.getMax_guests());
            preparedStatement.setString(4, accommodation.getDescription());
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected == 1) {
                System.out.println("Accommodation successfully inserted! ");
            } else {
                System.out.println("Something went wrong with accommodation insertion!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<AccommodationFairRelation> findAllAccommodationFairRelation() {
        AccommodationFairRelation accommodationFairRelation = new AccommodationFairRelation();
        List<AccommodationFairRelation> accommodationFairRelationList = new ArrayList<>();
        try (Connection connection = getConnection()) {
            String sqlQuery = "SELECT * FROM accommodation_fair_relations";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
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
    public List<AccommodationFairRelation> findAllAccommodationFairRelationByName(String name) {
        return null;
    }

    @Override
    public void insert(AccommodationFairRelation accommodationFairRelation) {
        try (Connection connection = getConnection()) {
            String sqlQuery = "INSERT INTO accommodation_fair_relations (id_accommodations, id_room_fairs) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
//            preparedStatement.setInt(1, accommodationFairRelation.getId());
            preparedStatement.setInt(1, accommodationFairRelation.getIdAccomodation());
            preparedStatement.setInt(2, accommodationFairRelation.getIdRoomFair());
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected == 1) {
                System.out.println("Accommodation fair relation successfully inserted! ");
            } else {
                System.out.println("Something went wrong with accommodation fair relation insertion!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<RoomFair> findAllRoomFair() {
        List<RoomFair> roomFairList = new ArrayList<>();
        try (Connection connection = getConnection()) {
            String sqlQuery = "SELECT * FROM room_fairs";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
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
    public int findRoomFairIdByValue(Double value) {
        RoomFair roomFair = new RoomFair();
        try(Connection connection=getConnection()) {
            String sqlQuery = "SELECT id FROM room_fairs where value = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return roomFair.getId();
    }

    @Override
    public void insert(RoomFair roomFair) {
        try (Connection connection = getConnection()) {
            String sqlQuery = "INSERT INTO room_fairs (/*id, */value, season) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
//            preparedStatement.setInt(1, roomFair.getId());
            preparedStatement.setDouble(1, roomFair.getValue());
            preparedStatement.setString(2, roomFair.getSeason());
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected == 1) {
                System.out.println("Room fair successfully inserted! ");
            } else {
                System.out.println("Something went wrong with room fair insertion!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {

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
}