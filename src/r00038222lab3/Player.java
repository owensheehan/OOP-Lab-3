package r00038222lab3;

public class Player {
	String position;
	String name;
	
	public Player() {
		
	}
	public Player(String Name,String Position) {
		this.name = name;
		this.position = position;
	}
	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void print() {
		System.out.println(position);
		System.out.println(name);
	}
	

}
