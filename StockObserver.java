
public class StockObserver implements Observer {
	
	private double ibm;
	private double aapl;
	private double goog;
	
	private static int observerIDTracker = 0;
	
	private int observerID;
	
	private Subject StockGrabber;
	
	public StockObserver(Subject StockGrabber){
		this.StockGrabber = StockGrabber;
		
		this.observerID = ++observerIDTracker;
		
		System.out.println("New Observer :"+this.observerID);
		
		StockGrabber.register(this);
	}

	@Override
	public void update(double ibm, double aapl, double goog) {
		this.ibm = ibm;
		this.aapl = aapl;
		this.goog = goog;
		
		printThePrices();
	}
	
	public void printThePrices(){
		System.out.println(observerID + "\nIBM" + ibm + "\nAAPL" + aapl + "\nGOOG" + goog);
	}

}
