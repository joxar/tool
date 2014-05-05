package tool;

/*
 * This class is for measuring the running time of program
 */
public class Timer implements CommonTool {
	private String procName = "";
	private long start;
	private long stop;

	/*
	 * Constructor
	 * @param String name
	 */
	public Timer(String name) {
		this.procName = name;
	}
	
	/*
	 * @param
	 * @return
	 */
	public void startTimer() {
		start = System.currentTimeMillis();
	}
	
	/*
	 * @param
	 * @return
	 */
	public void stopTimer() {
	    stop = System.currentTimeMillis();
	}
	
	/*
	 * @param
	 * @return
	 */
	public void dispResult() {
	    System.out.println("ProcName: " + procName);
	    System.out.println("time: " + (stop - start) + "  mili seconds.");		
	}
	
}
