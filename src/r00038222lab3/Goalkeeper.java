package r00038222lab3;

public class Goalkeeper extends Player{
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
		String kicks = "Kicks the Ball out.";
		String intercepts = "Saves a goal.";
		String runs = "To catch the ball.";
		this.setKicks(kicks);
		this.setIntercepts(intercepts);
		this.setRuns(runs);
	}
	public Goalkeeper() {
		
	}
	public Goalkeeper(String name, String Position) {
		super();
	}
	public void print() {
		System.out.println(position);
		System.out.println(name);
		System.out.println(kicks);
		System.out.println(intercepts);
		System.out.println(runs);
	}
	
}
