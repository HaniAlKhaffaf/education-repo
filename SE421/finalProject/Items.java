package finalProject;

public class Items implements Lendable {

	private final String id;
	private final String title;
	private String desc;
	private final String type;

	public Items(String id, String type, String title) {
		this.id = id;
		this.type = type;
		this.title = title;
	}


	@Override
	public float fine(int days) {
		return days;
	}

	@Override
	public int maxLendDays() {
		return 14;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getDesc() {
		return desc;
	}

	@Override
	public void setDesc(String desc) {
		this.desc = desc;
	}


}