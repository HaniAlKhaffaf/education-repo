package finalProject;

public class TechnicalPaper implements Lendable{
	
	private Lendable l;

	public TechnicalPaper() {
		l = new Items(null, null, null);
	}

	public TechnicalPaper(Lendable t){ // can provide different implementations
        l = t;
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
		return l.fine(days) * 2f;
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
