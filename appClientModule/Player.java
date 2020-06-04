
public class Player {
	private String name;
	private int score;

	public Player(String playerName, int playerScore) {
		this.name = playerName;
		this.score = playerScore;
	}

	public Player(String playerName) {
		this.name = playerName;
		this.score = 0;
	}

	public Player() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
