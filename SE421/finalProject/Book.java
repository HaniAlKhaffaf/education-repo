package finalProject;

public class Book implements Lendable{

	private Lendable l;

	public Book() {
		l = new Items(null, null, null);
	}

	public Book(Lendable b){ // can provide different implementations
        l = b;
    }
	
	@Override
	public String getId() {
		return l.getId();
	}
	
	@Override
	public String getTitle() {
		return l.getTitle();
	}
	
	@Override
	public String getDesc() {
		return l.getDesc();
	}

	@Override
	public String getType() {
		return l.getType();
	}
	
	@Override
	public float fine(int days) {
		return l.fine(days) * 3f;
	}

	@Override
	public int maxLendDays() {
		return l.maxLendDays();
	}

	@Override
	public void setDesc(String desc) {
		l.setDesc(desc);
	}

}
