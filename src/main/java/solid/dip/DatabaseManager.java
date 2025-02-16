package solid.dip;

//High-level module that directly depends on the concrete MySQLDatabaseConnection
public class DatabaseManager {

	private MySQLDatabaseConnection connection;

	public DatabaseManager() {
		// Direct instantiation creates tight coupling
		connection = new MySQLDatabaseConnection();
	}

	public void openConnection() {
		connection.connect();
	}

	public void closeConnection() {
		connection.disconnect();
	}
}
