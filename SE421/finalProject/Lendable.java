package finalProject;

public interface Lendable {
	public float fine(int days);
	public int maxLendDays();
	
	public String getType();
	
	public String getId();
	
	public String getTitle();
	
	public String getDesc();
	public void setDesc(String desc);
}
