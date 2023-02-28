package ProduseDB;

import Produse.Supliment;

import java.sql.*;

public interface SuplimentDB {static final String url = "jdbc:mysql://localhost:3306/pao";
    static final String user = "root";
    static final String password = "";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    //INSERT
    public static void insertSupliment(int c, Supliment Supliment) {
        String SQL = "INSERT INTO supliment "
                + "VALUES(?,?,?,?,?)";

        long id = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL,
                     Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setInt(1, c);
            pstmt.setString(2, Supliment.getNume());
            pstmt.setFloat(3, Supliment.getPret());
            pstmt.setString(4, Supliment.getDoza_recomandata());
            pstmt.setInt(5, Supliment.getUnitati());


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
    public static int updateNumeSupliment(int id, String Nume) {
        String SQL = "UPDATE supliment "
                + "SET Nume = ? "
                + "WHERE id = ?";

        int affectedrows = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setString(1, Nume);
            pstmt.setInt(2, id);

            affectedrows = pstmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }

    //DELETE
    public static int deleteSupliment(int id) {
        String SQL = "DELETE FROM supliment WHERE id = ?";

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

    private static void displaySupliment(ResultSet rs) throws SQLException {
        System.out.println("id\t Nume\t   Pret\t     Doza\t                    Unitati\t");
        while (rs.next()) {
            System.out.println(rs.getString("id") + "\t" + rs.getString("Nume") + "\t"
                    +rs.getString("Pret")+"\t"
                    + rs.getString("Doza") + "\t"
                    + rs.getString("Unitati")) ;

        }
    }
    public static void getSupliment() {

        String SQL = "SELECT * FROM Supliment";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            displaySupliment(rs);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
