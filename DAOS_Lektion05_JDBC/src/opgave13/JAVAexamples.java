package opgave13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JAVAexamples {

    /**
     * @param args
     */
    static Connection minConnection;
    static Statement stmt;
    static BufferedReader inLine;

    public static void selectudenparm() {
        try {
            // Laver sql-s�tning og f�r den udf�rt
            String sql = "select navn,stilling from person";
            System.out.println("SQL-streng er " + sql);
            ResultSet res = stmt.executeQuery(sql);
            // genneml�ber svaret
            while (res.next()) {
                String s;
                s = res.getString("navn");
                System.out.println(s + "    " + res.getString(2));
            }
            // p�n lukning
            if (!minConnection.isClosed()) {
                minConnection.close();
            }
        } catch (Exception e) {
            System.out.println("fejl:  " + e.getMessage());
        }
    }

    public static void selectmedparm() {
        try {
            // Indl�ser s�gestreng
            System.out.println("Indtast init");
            String inString = inLine.readLine();
            // Laver sql-s�tning og f�r den udf�rt
            String sql = "select p.aarstal,isnull(p.plac, 0) from placering p where p.init like '" + inString + "%'";
            System.out.println("SQL-streng er " + sql);
            ResultSet res = stmt.executeQuery(sql);
            // genneml�ber svaret
            while (res.next()) {
                if (res.getString(2).equals("0")) {
                    System.out.println(res.getString(1) + "    " + "UDGÅET");
                } else {
                    System.out.println(res.getString(1) + "    " + res.getString(2));

                }
            }
            // p�n lukning
            if (!minConnection.isClosed()) {
                minConnection.close();
            }
        } catch (Exception e) {
            System.out.println("fejl:  " + e.getMessage());
        }
    }

    public static void insertmedstring() {
        try {
            // indl�sning
            System.out.println("Vi vil nu oprette et nyt ans�ttelsesfforhold");
            System.out.println("Indtast rytter init (rytter skal v�re oprettet p� forh�nd");
            String init = inLine.readLine();
            System.out.println("Indtast placering (VM skal være oprettet p� forh�nd");
            String plac = inLine.readLine();

            // sender insert'en til db-serveren
            String sql = "insert into placering values (2016,'" + init + "'," + plac + ")";
            System.out.println("SQL-streng er " + sql);
            stmt.execute(sql);
            // p�nt svar til brugeren
            System.out.println("placeringen er oprettet");
            if (!minConnection.isClosed()) {
                minConnection.close();
            }
        } catch (SQLException e) {
            switch (e.getErrorCode())
            // fejl-kode 547 svarer til en foreign key fejl
            {
            case 547: {
                if (e.getMessage().contains("rytterInit")) {
                    System.out.println("Rytter er ikke oprettet");
                }
                if (e.getMessage().contains("vmAarstal")) {
                    System.out.println("VM er ikke oprettet");
                }
                break;
            }
            // fejl-kode 2627 svarer til primary key fejl
            case 2627: {
                System.out.println("den pågældende placering er allerede oprettet");
                break;
            }
            default:
                System.out.println("fejlSQL:  " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("fejl:  " + e.getMessage());
        }
    }

    public static void insertprepared() {
        try {
            // indl�sning
            System.out.println("Vi vil nu oprette en placering");
            System.out.println("Indtast init (rytter skal v�re oprettet p� forh�nd");
            String init = inLine.readLine();
            System.out.println("Indtast placering (VM skal v�re oprettet p� forh�nd");
            String plac = inLine.readLine();
            // Anvendelse af prepared statement
            String sql = "insert into placering values (2016,?,?)";
            PreparedStatement prestmt = minConnection.prepareStatement(sql);
            prestmt.clearParameters();
            prestmt.setString(1, init);
            prestmt.setInt(2, Integer.parseInt(plac));
            // Udf�rer s�tningen
            prestmt.execute();
            // p�nt svar til brugeren
            System.out.println("placeringen er nu registreret");
            if (!minConnection.isClosed()) {
                minConnection.close();
            }
        } catch (SQLException e) {
            switch (e.getErrorCode())
            // fejl-kode 547 svarer til en foreign key fejl
            {
            case 547: {
                if (e.getMessage().contains("rytterInit")) {
                    System.out.println("Rytter er ikke oprettet");
                }
                if (e.getMessage().contains("vmAarstal")) {
                    System.out.println("VM er ikke oprettet");
                }
                break;
            }
            // fejl-kode 2627 svarer til primary key fejl
            case 2627: {
                System.out.println("den p�g�ldende ans�ttelse er allerede oprettet");
                break;
            }
            default:
                System.out.println("fejlSQL:  " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("fejl:  " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            inLine = new BufferedReader(new InputStreamReader(System.in));
            // generel ops�tning
            // via native driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            minConnection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost;databaseName=opgave07_Cykelrytter;user=sa;password=Michael25;");
            stmt = minConnection.createStatement();
            // Indl�sning og kald af den rigtige metode
            System.out.println("Indtast  ");
            System.out.println("s for select uden parameter  ");
            System.out.println("sp for select med parameter  ");
            System.out.println("i for insert med strengmanipulation");
            System.out.println("ps for insert med prepared statement ");
            String in = inLine.readLine();
            switch (in) {
            case "s": {
                selectudenparm();
                break;
            }
            case "sp": {
                selectmedparm();
                break;
            }
            case "i": {
                insertmedstring();
                break;
            }
            case "ps": {
                insertprepared();
                break;
            }
            default:
                System.out.println("ukendt indtastning");
            }
        } catch (Exception e) {
            System.out.println("fejl:  " + e.getMessage());
        }
    }

}
