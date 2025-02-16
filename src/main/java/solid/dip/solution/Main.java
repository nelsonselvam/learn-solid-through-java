package solid.dip.solution;

//Client code
public class Main {

	public static void main(String[] args) {
		// We can now easily swap out the connection implementation if needed
		DatabaseConnection mysqlConnection = new MySQLDatabaseConnection();
		DatabaseManager dbManager = new DatabaseManager(mysqlConnection);
		dbManager.openConnection();
		// Perform database operations...
		dbManager.closeConnection();
	}

}
