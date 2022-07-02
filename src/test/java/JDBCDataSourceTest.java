
import static org.junit.Assert.*;
import org.junit.Test;
import java.sql.Connection;


import webapp.utility.JDBCDataSource;

public class JDBCDataSourceTest {
	
    @Test 
    public void getConnectionTest() throws Exception {
        Connection dbConnection = (Connection) JDBCDataSource.getConnection();
        assertNotNull("connection should be successfull.", dbConnection);
 
    }
}
