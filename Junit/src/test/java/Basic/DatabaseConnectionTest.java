package Basic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; // Import assertions to use assertNotNull
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {
    DatabaseConnection db;
    @BeforeEach
    public void setUp() {
        db = new DatabaseConnection(); // Initialize the connection before each test
        db.connect();
    }

    @AfterEach
    public void tearDown() {
        db.disconnect(); // Close connection after each test
    }

    @Test
    public void testConnection() {
        assertNotNull(db); // Ensures the database object is not null
    }
}