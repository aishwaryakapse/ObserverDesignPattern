import java.util.ArrayList;

public class StockGrabber implements Subject{
	
	private ArrayList<Observer> observers;
	private double ibm;
	private double aapl;
	private double goog;
	
	observers = new ArrayList<Observer>();
	
	
	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
	}

	@Override
	public void unregister(Observer deleteObserver) {
		int observerIndex = observers.indexOf(deleteObserver);
		System.out.println("Observer "+(observerIndex + 1)+"deleted");
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		for(Observer o1 : observers){
			o1.update(ibm, aapl, goog);
		}	
	}
	
	public void setIbm(double ibm){
		this.ibm = ibm;
	}
	
	public void setAapl(double aapl){
		this.aapl = aapl;
	}
	
	public void setGoog(double goog){
		this.goog = goog;
	}
	
}
