package com.example.easyride;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginUnitTest {

    @Test
    public void testIsUser(){
        //FirebaseFirestore database = FirebaseFirestore.getInstance();
        String driver = "jaysinh";
        UserDatabaseManager database = new UserDatabaseManager();
        assertTrue(database.isDriver(driver));
    }

}
