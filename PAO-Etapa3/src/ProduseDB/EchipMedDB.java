package ProduseDB;

import Produse.EchipamentMedical;

import java.sql.*;

public interface EchipMedDB {
    static final String url = "jdbc:mysql://localhost:3306/pao";
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
    public static void insertEchipamentMedical(int c, EchipamentMedical EchipamentMedical) {
        String SQL = "INSERT INTO echipmed "
                + "VALUES(?,?,?,?)";

        long id = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL,
                     Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setInt(1, c);
            pstmt.setString(2, EchipamentMedical.getNume());
            pstmt.setFloat(3, EchipamentMedical.getPret());
            pstmt.setBoolean(4, EchipamentMedical.getAprobare());


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
    public static int updateAprobEchipamentMedical(int id, boolean Aprobare) {
        String SQL = "UPDATE echipmed "
                + "SET Aprobare = ? "
                + "WHERE id = ?";

        int affectedrows = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            pstmt.setBoolean(1, Aprobare);
            pstmt.setInt(2, id);

            affectedrows = pstmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }

    //DELETE
    public static int deleteEM(int id) {
        String SQL = "DELETE FROM echipmed WHERE id = ?";

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

    private static void displayEchipamentMedical(ResultSet rs) throws SQLException {
        System.out.println("id\t  Nume\t    Pret\t     Aprobare\t");
        while (rs.next()) {
            System.out.println(rs.getString("id") + "\t" + rs.getString("Nume") + "\t"
                    + rs.getString("Pret") + "\t"
                    + rs.getString("Aprobare")) ;

        }
    }
    public static void getEchipamentMedical() {

        String SQL = "SELECT * FROM echipmed";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            displayEchipamentMedical(rs);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
