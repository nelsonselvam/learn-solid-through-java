package solid.dip.solution;

//High-level module: Depends on the abstraction DatabaseConnection
public class DatabaseManager {

	private DatabaseConnection connection;

	// Dependency injection via the constructor
	public DatabaseManager(DatabaseConnection connection) {
		this.connection = connection;
	}

	public void openConnection() {
		connection.connect();
	}

	public void closeConnection() {
		connection.disconnect();
	}

}
