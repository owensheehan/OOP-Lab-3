package r00038222lab3;

import java.util.ArrayList;

public class BuildList {
	static int keeperCount;
	static int subCount;
	static int teamCount;
	String name;
	String position;
	ArrayList<Player> players = new ArrayList<Player>();
	public BuildList() {
		
	}
	
	public void add(String name, String position) {
		this.name = name;
		this.position = position.toLowerCase();
		if (teamCount < 20) {
			teamCount ++;
			switch (position) {
			case "goalkeeper":goalkeeper();break;
			case "defender":break;
			case "midfeilder":break;
			case "forward":break;
			case "sub":break;
			default : System.out.println("Invalid position given for " + name);
			}
		}else {System.out.println("The team is full player "+name+" not added");
		}
	}
	public void goalkeeper() {
		Player keeper = new Goalkeeper(name,position);
		players.add(keeper);
	}
	public void defender() {
		Player defender = new Defender(name,position);
		players.add(defender);
	}
	public void midfeilder() {
		Player midfeilder = new Midfeilder(name,position);
		players.add(midfeilder);
	}
	public void forward() {
		Player forward = new Forward(name,position);
		players.add(forward);
	}
	public void sub() {
		Player sub = new Sub(name,position);
		players.add(sub);
	}
	
}
