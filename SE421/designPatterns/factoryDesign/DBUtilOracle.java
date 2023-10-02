public class DBUtilOracle implements DBUtil{

	private OracleDB oracle;
	public DBUtilMySQL(String username, String password, String uri){
		//mysql is implemented by MySQL third-party API
		this.mysql = new MySQL();
		oracle.connectDB(username, password, uri);
	}


	public updateName(int id, String name){
		//oracle.query(*update SQL*)
	}

	public updateAddress(int id, String address){
		//oracle.query(*update SQL*)
	}

	//
	//other update methods
	//
}
