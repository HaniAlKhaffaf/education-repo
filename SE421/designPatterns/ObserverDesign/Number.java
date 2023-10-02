package designPatterns.ObserverDesign;

public class Number{
	private int x;
	private NumberListener listener;
	public Number(){
	}
	public Number(Number n){
		this.x = n.x;
		// this.y = n.y;
	}

	public int getX(){
		return this.x;
	}

	public void undo(){
	}
	public void setX(int x){
		Number old = new Number(this);
		this.x = x;
		//Send an event to listener
		if(this.listener != null)
			this.listener.xChanged(old, this);
	}

	public void setListener(NumberListener l){
		this.listener = l;
	}
	// private void notifyListener(int x){
	//	if(this.listener != null)
	//		this.listener.xChanged(x, this);
	// }

}
