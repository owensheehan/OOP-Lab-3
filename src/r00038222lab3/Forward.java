package r00038222lab3;

public class Forward extends Player{
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
		String kicks = "Scores a goal.";
		String intercepts = "Turns toward goal.";
		String runs = "Runs toward goal.";
		this.setKicks(kicks);
		this.setIntercepts(intercepts);
		this.setRuns(runs);
	}
	public Forward(String name, String Position) {
		super();
	}
}
