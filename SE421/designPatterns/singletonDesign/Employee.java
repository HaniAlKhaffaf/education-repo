public class Employee{
	private int id;
	private String name;
	private String address;
	private DBUtil db;

	public Employee(int id){
		this.id = id;
		this.db = DBUtilFactory.createInstance();
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public String getAddress(){
		return address;
	}

	public void setName(String name){
		this.name = name;
		db.updateName(id, name);
	}


	public void setAddress(String address){
		this.address = address;
		db.updateAddress(id, address);
	}

}
