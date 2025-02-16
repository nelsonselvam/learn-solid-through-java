package solid.dip.solution;

//Abstraction for a database connection
public interface DatabaseConnection {

	void connect();

	void disconnect();

}
