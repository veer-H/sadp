// Singleton DatabaseConnection class
public class A_2_que_1 {

    // Step 1: Create a private static instance (initialized to null)
    private static A_2_que_1 instance;

    // Step 2: Private constructor to prevent instantiation from outside
    private A_2_que_1() {
        // Simulate database connection setup
        System.out.println("Database Connection Established");
    }

    // Step 3: Provide a public static method to get the instance
    public static A_2_que_1 getConnection() {
        // Double-checked locking for thread safety
        if (instance == null) {
            synchronized (A_2_que_1.class) {
                if (instance == null) {
                    instance = new A_2_que_1();
                }
            }
        }
        return instance;
    }

    // A method to simulate querying the database
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }

    // Main method to test the Singleton pattern
    public static void main(String[] args) {
        // Get the single instance of DatabaseConnection
        A_2_que_1 connection1 = A_2_que_1.getConnection();
        connection1.query("SELECT * FROM users");

        // Trying to get another instance of DatabaseConnection
        A_2_que_1 connection2 = A_2_que_1.getConnection();
        connection2.query("SELECT * FROM products");

        // Check if both references point to the same instance
        System.out.println("Are both connections the same instance? " + (connection1 == connection2));
        // Output: true
    }
}
