package solid.dip;

//Concrete class for MySQL database connection
public class MySQLDatabaseConnection {
	
	public void connect() {
        System.out.println("Connecting to MySQL database...");
    }
    
    public void disconnect() {
        System.out.println("Disconnecting from MySQL database...");
    }

}
