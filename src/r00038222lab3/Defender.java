package r00038222lab3;

public class Defender extends Player{
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
		String kicks = "Clears the ball out.";
		String intercepts = "Takes the ball from the oposition player.";
		String runs = "To tackle the oposition player.";
		this.setKicks(kicks);
		this.setIntercepts(intercepts);
		this.setRuns(runs);
	}
	public Defender(String name, String Position) {
		super();
	}
}
