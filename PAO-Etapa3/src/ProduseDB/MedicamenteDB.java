package ProduseDB;

import Produse.Medicament;

import java.sql.*;

public interface MedicamenteDB {

    static final String url = "jdbc:mysql://localhost:3306/pao";
    static final String user = "root";
    static final String password = "";


    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    //INSERT
    public static void insertMedicament(int c, Medicament Medicament) {
        String SQL = "INSERT INTO Medicament "
                + "VALUES(?,?,?,?,?)";

        long id = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL,
                     Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setInt(1, c);
            pstmt.setString(2, Medicament.getNume());
            pstmt.setFloat(3, Medicament.getPret());
            pstmt.setString(4, Medicament.getSubstante_active());
            pstmt.setBoolean(5, Medicament.getReteta());


            int affectedRows = pstmt.executeUpdate();
            // check the affected rows 
            if (affectedRows > 0) {
                // get the ID back
                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        id = rs.getLong(1);
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    //UPDATE
    public static int updatePretMedicament(int id, float Pret) {
        String SQL = "UPDATE Medicament "
                + "SET Pret = ? "
                + "WHERE id = ?";

        int affectedrows = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setFloat(1, Pret);
            pstmt.setInt(2, id);

            affectedrows = pstmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }

    //DELETE
    public static int deleteMedicament(int id) {
        String SQL = "DELETE FROM medicament WHERE id = ?";

        int affectedrows = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setInt(1, id);

            affectedrows = pstmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }

//SELECT

    private static void displayMedicament(ResultSet rs) throws SQLException {
        System.out.println("id\t  Nume\t   Pret\t   Substante active\t    Reteta\t");
        while (rs.next()) {
            System.out.println(rs.getString("id") + "\t" + rs.getString("Nume") + "\t"
                    + rs.getString("Pret") + "\t"
                    + rs.getString("Substante_active") + "\t"
                    + rs.getString("Reteta"));

        }
    }
    public static void getMedicament() {

        String SQL = "SELECT * FROM Medicament";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            displayMedicament(rs);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
