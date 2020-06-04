
public enum ScoreEnum {

	LOVE(0, "love"), FIFTEEN(1, "fifteen"), THIRTY(2, "thirty"), FORTY(3, "forty"), ADVANTAGE(4, "advantage");

	private int score;
	private String name;

	ScoreEnum(int score, String name) {
		this.score = score;
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public static String getScoreName(int score) {
		for (ScoreEnum scoreEnum : ScoreEnum.values()) {
			if (scoreEnum.score == score) {
				return scoreEnum.name;
			}
			if (score > 4) {
				return ADVANTAGE.name;
			}
		}

		throw new UnsupportedOperationException();
	}
}
