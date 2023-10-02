package designPatterns.ObserverDesign;

public class Main {
	public static void main(String...args){
		Number n = new Number();
		n.setX(10);
		Number n2 = new Number();
		n.setX(20);


		NumberListener nl = new NumberListener(){
				public void xChanged(Number old, Number n){
					System.out.println(old.getX());
					System.out.println(n.getX());
				}
			};
		n.setListener(nl);
		n2.setListener(nl);

		// n2.setX(100);

		n.setX(1000);

    }
}
