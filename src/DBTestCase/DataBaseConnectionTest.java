package DBTestCase;

import java.sql.SQLException;
import java.util.List;

import Utility.DbManager;

public class DataBaseConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		DbManager.setMysqlDbConnection();
		List<String> query = DbManager.getMysqlQuery("Select LastName from employee where P_id='102'");
		for(int i=0; i<query.size(); i++){
			System.out.println(query.get(i));
		}

	}

}
