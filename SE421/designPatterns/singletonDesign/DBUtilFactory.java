public class DBUtilFactory{

	private static DBUtil instances[] = new DBUtil[5];
	// private static DBUtil instance; this is for singleton
	private static Boolean init = false;
	private static int counter = 0;

	private DBUtilFactory(){
	}

	public static DBUtil createInstance(){
		/*
		if(instance == null) {
			instance = new DBUtilMySQL("username_db", "password_name", "uri");
		}
		return instance;
		*/

		if(!init){
			for(int i=0; i < instances.length; i++){
				instances[i] = new DBUtilMySQL("useranme_db", "password_name", "uri");
			}
		}

		if(counter == instances.length)
			counter = 0;
		return instances[counter++];
	}

}
