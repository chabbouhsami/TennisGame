import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TennisGameTest {

	Player federer = new Player("Federer");
	Player nadal = new Player("Nadal");

	TennisGame game = new TennisGame(new Player("Djokovic", 1), new Player("Murray", 2));

	@Test
	public void setGamers() {
		game.setPlayer1(federer);
		game.setPlayer2(nadal);
	}

	@Test
	public void testFifteenLove() {
		game.updateScore(1, 0);

		String score = game.getScore();
		assertEquals(ScoreEnum.FIFTEEN.getName() + " " + ScoreEnum.LOVE.getName(), score);
	}

	@Test
	public void testFifteenAll() {
		game.updateScore(1, 1);

		String score = game.getScore();
		assertEquals(ScoreEnum.FIFTEEN.getName() + " all", score);
	}

	@Test
	public void testThirtyAll() {
		game.updateScore(2, 2);

		String score = game.getScore();
		assertEquals(ScoreEnum.THIRTY.getName() + " all", score);
	}

	@Test
	public void testDeuce() {
		game.updateScore(4, 4);

		String score = game.getScore();
		assertEquals("Deuce", score);
	}

	@Test
	public void testAdvantage() {
		game.updateScore(4, 5);
		
		String score = game.getScore();
		assertEquals(ScoreEnum.ADVANTAGE.getName() + " " + game.getPlayer2(), score);
	}

	@Test
	public void testLeading() {
		game.updateScore(3, 1);
		
		String score = game.getScore();
		assertEquals(ScoreEnum.FORTY.getName() + " " + ScoreEnum.FIFTEEN.getName(), score);
	}
	
	@Test
	public void testWinGame() {
		game.updateScore(7, 5);

		String score = game.getScore();
		assertEquals(game.getPlayer1().getName() + " win", score);
	}

}
