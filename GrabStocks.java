
public class GrabStocks {

	public static void main(String[] args) {
		StockGrabber sg = new StockGrabber();
		
		StockObserver o1 = new StockObserver(sg);
		
		sg.setIbm(197.00);
		sg.setAapl(638.00);
		sg.setGoog(677.00);
		
		StockObserver o2 = new StockObserver(sg);
	}

}
