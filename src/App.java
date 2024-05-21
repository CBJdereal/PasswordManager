import java.util.Scanner;

import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        App pro = new App();
        pro.createConnection();
    }

    void createConnection(){

        User user;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "//YOURPASSWORD");
           if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("Connection to MySql established.");

                ResultSet tables = meta.getTables(null, null, "versions", null);
                if (tables.next()) {
                    // Database exists
                    try (PreparedStatement stmt = conn.prepareStatement("SELECT MAX(version) as version FROM versions")) {
                        ResultSet rs = stmt.executeQuery();
                        if (rs.next()) System.out.println("Database found. Version: " + rs.getInt("version"));
                    }
                } else {
                    System.out.println("Database not found");
                }

                Scanner input = new Scanner(System.in);

                System.out.println("Are you a new user? Y/N");
                String yn = input.next();
                
                if (yn.equalsIgnoreCase("y")) {
                    user = User.registerNewUser(conn, input);
                }
                else {
                    user = User.login(conn, input);
                }
                if (user == null) throw new RuntimeException("Error while logging in.");
                System.out.println("User " + user.getUsername() + " is now logged in.");

                Menu menu = new Menu(conn, input, user);
                menu.menu();
            }

            
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
