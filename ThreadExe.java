//Lucas Christianson
//My PC has 4 physical cores, 8 with hyper-threading

//Trial
//Each run performed 1,000,000,000 "dart throws"
//  Thread Count        Calculation Time (ms)     Value of Pi
//		  1					40673					3.141589
//		  2					20223					3.141625
//        4					10618					3.141592
//        8					6900					3.141569

public class ThreadExe {

//private static int cores = Runtime.getRuntime().availableProcessors();
// ^ Used this to check amount of physical and virtual cores ^

	public static void main(String[] args) {
		RunnableThread[] threads = new RunnableThread[8];
		long start = System.nanoTime();
		for(int i = 0; i < threads.length; i++) {
			threads[i] = new RunnableThread("" + (i+1));
			threads[i].start();
			System.out.println("Thread " + (i+1) + " has been created and started.");
		}

		try {
			for(RunnableThread t : threads)
				t.join();
			
		} catch (InterruptedException e) {}
		
		
		int actualhits = 0;
		int actualtotals = 0;
		for(RunnableThread t : threads) {
			actualhits += t.hitcount;
			actualtotals += t.totalcount;
		}
		
		System.out.println(actualhits + " is the number of hits.");
		System.out.println(actualtotals + " is the total number.");
		System.out.println("The value of pi equals " + returnPi((double)actualhits, (double)actualtotals));
		long end = System.nanoTime();
		long duration = (end - start)/1000000;
		System.out.println("This took " + duration + "ms to complete.");
		
		
		
	}
	
	public static double returnPi(double h, double t) {
		return (h/t*4);
	}
	
}

