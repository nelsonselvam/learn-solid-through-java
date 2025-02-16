package solid.dip;

// client code
public class Main {

	/**
	 * The DatabaseManager (high-level module) is directly tied to
	 * MySQLDatabaseConnection (low-level module). Changing to another type of
	 * database (e.g., PostgreSQL) would require modifying DatabaseManager's code.
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		DatabaseManager dbManager = new DatabaseManager();
		dbManager.openConnection();
		// Perform database operations...
		dbManager.closeConnection();
	}

}
