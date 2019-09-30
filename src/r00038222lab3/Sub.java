package r00038222lab3;

public class Sub extends Player{
	String kicks;
	String intercepts;
	String runs;
	public String getKicks() {
		return kicks;
	}
	public void setKicks(String kicks) {
		this.kicks = kicks;
	}
	public String getIntercepts() {
		return intercepts;
	}
	public void setIntercepts(String intercepts) {
		this.intercepts = intercepts;
	}
	public String getRuns() {
		return runs;
	}
	public void setRuns(String runs) {
		this.runs = runs;
	}
	public void actions() {
		String kicks = "I'm not playing.";
		String intercepts = "Returns the ball.";
		String runs = "To warm up..";
		this.setKicks(kicks);
		this.setIntercepts(intercepts);
		this.setRuns(runs);
	}
	public Sub(String name, String Position) {
		super();
	}
}
