public class DBUtilFactory2{

	private static DBUtil instance;

	private DBUtilFactory2(){
	}

	public static DBUtil createInstance(){

		if(instance == null)
			instance = new DBUtilMySQL("useranme_db", "password_name", "uri");

		return instance;
	}

	public static void setInstance(DBUtil db){ // so i can change type of db
		instance = db;
	}

	/*
	 * after that in main we will do the following ......
	 * 
	 * DBUtil db1 = DBUtilFacotory.createInstance();
	 * SQL Database
	 * 
	 * DBUtilFacotory.setInstance(new DBUtilOracle());
	 * DBUtil db2 = DBUtilFacotory.createInstance();
	 * Oracle Database
	 */

}
