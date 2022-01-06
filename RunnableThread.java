import java.util.Random;

public class RunnableThread extends Thread{
	
	public int hitcount;
	public int totalcount;
	private String name;
	private int total = 1000000000/8;
	
	public RunnableThread (String s) {
		name = s;
		
	}
	
	public void run() {
		System.out.println("Thread " + name + " is running.");
		Random xr = new Random();
		Random yr = new Random();
		double x;
		double y;
		for(int i = 0; i < total; i++) {
			x = xr.nextDouble();
			y = yr.nextDouble();
			double distance = Math.sqrt((x*x) + (y*y));
			if(distance < 1.0)
				hitcount++;
			totalcount++;
		}
	}
	
	public String name() {
		return name;
	}

}

