
public class TennisGame {

	Player player1 = new Player();
	Player player2 = new Player();

	public TennisGame(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public void updateScore(int p1Score, int p2score) {
		this.player1.setScore(p1Score);
		this.player2.setScore(p2score);
	}

	public String getScore() {

		if (win()) {
			return leader().getName() + " win";
		}

		if (advantage()) {
			return ScoreEnum.getScoreName(leader().getScore()) + " " + leader();
		}

		if (deuce()) {
			return (player1.getScore() >= 4) ? "Deuce" : ScoreEnum.getScoreName(player1.getScore()) + " all";
		}

		return ScoreEnum.getScoreName(player1.getScore()) + " " + ScoreEnum.getScoreName(player2.getScore());
	}

	private boolean deuce() {
		return player1.getScore() == player2.getScore();
	}

	private Player leader() {
		return (player1.getScore() > player2.getScore()) ? player1 : player2;
	}

	private boolean win() {
		return ((player1.getScore() == player2.getScore() - 2) && player1.getScore() >= 4)
				|| ((player2.getScore() == player1.getScore() - 2) && player2.getScore() >= 4);
	}

	private boolean advantage() {
		return ((player1.getScore() == player2.getScore() - 1) && player1.getScore() >= 4)
				|| ((player2.getScore() == player1.getScore() - 1) && player2.getScore() >= 4);

	}

}
