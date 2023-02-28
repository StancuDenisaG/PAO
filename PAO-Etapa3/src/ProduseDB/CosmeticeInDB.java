package ProduseDB;

import Produse.Cosmetice;

import java.sql.*;

//import static jdk.internal.org.jline.keymap.KeyMap.display;

//import static jdk.internal.org.jline.keymap.KeyMap.display;

public interface CosmeticeInDB {

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
    public static void insertcosmetice(int c,Cosmetice cosmetice) {
        String SQL = "INSERT INTO cosmetice "
                + "VALUES(?,?,?,?,?,?)";

        long id = 0;

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL,
                     Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setInt(1, c);
            pstmt.setString(2, cosmetice.getNume());
            pstmt.setFloat(3, cosmetice.getPret());
            pstmt.setString(4, cosmetice.getSubstante_active());
            pstmt.setString(5, cosmetice.getTip());
            pstmt.setString(6, cosmetice.getTipul_tenului());

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
    public static int updatePretCosmetice(int id, float Pret) {
        String SQL = "UPDATE cosmetice "
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
    public static int deleteCosmetice(int id) {
        String SQL = "DELETE FROM cosmetice WHERE id = ?";

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


    private static void displayCosmetice(ResultSet rs) throws SQLException {
        System.out.println("id\t Nume\t   Pret\t Substante active\t Tip\t Tip ten\t");
        while (rs.next()) {
            System.out.println(rs.getString("id") + "\t" + rs.getString("Nume") + "\t"
                    + rs.getString("Pret") + "\t"
                    + rs.getString("Substante_active") + "\t"
                    + rs.getString("Tip") + "\t"
                    + rs.getString("Tip_ten"));

        }
    }
    public static void getCosmetice() {

        String SQL = "SELECT * FROM cosmetice";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            displayCosmetice(rs);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }




}
