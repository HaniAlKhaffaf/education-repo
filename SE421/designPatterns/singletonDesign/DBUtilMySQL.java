public class DBUtilMySQL implements DBUtil{

	private MySQL mysql;
	public DBUtilMySQL(String username, String password, String uri){
		//mysql is implemented by MySQL third-party API
		this.mysql = new MySQL();
		mysql.connect(username, password, uri);
	}


	public updateName(int id, String name){
		//mysql.query(*update SQL*)
	}

	public updateAddress(int id, String address){
		//mysql.query(*update SQL*)
	}

	//
	//other update methods
	//
}
