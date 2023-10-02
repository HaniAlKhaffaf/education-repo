package finalProject;

public class Videos implements Lendable{
	
	private Lendable l;

	public Videos() {
		l = new Items(null, null, null);
	}

	public Videos(Lendable v){ // can provide different implementations
        l = v;
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
		return l.fine(days) * 1f;
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
