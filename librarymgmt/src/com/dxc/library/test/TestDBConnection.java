package com.dxc.library.test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.dxc.library.dao.DBConnection;
import java.sql.Connection;
public class TestDBConnection 
{
	@Test
	public void testGetConnection() 
	{
		try
		{
		   assertNotNull(DBConnection.getConnection());
		}    
		catch(Exception ex)
		{
			fail();
		}
	}

}
