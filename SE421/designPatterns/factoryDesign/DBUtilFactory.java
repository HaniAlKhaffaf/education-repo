
public class DBUtilFactory{


	private DBUtilFactory(){ // so you cant make objects out of it
	}

	public static DBUtil createInstance(){

		DBUtil db = new DBUtilMySQL("useranme_db", "password_name", "uri");
		return db;
	}

}
