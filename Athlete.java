package 미니테스트;

public class Athlete extends Job {
	private String name = "운동선수";
	private int stamina = 120; // 체력
	private int resistance = 10; // 저항력

	@Override
	public void selectJob() {
		super.selectJob();
	}

	@Override
	public void J_state(int healthy, int resistance) {
		super.J_state(healthy, resistance);
	}

}
