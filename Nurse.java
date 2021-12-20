package 미니테스트;

public class Nurse extends Job {
	private String name = "간호사";
	private int stamina = 100; // 체력
	private int resistance = 10 + 15; // 저항력

	@Override
	public void selectJob() {
		super.selectJob();
	}

	@Override
	public void J_state(int healthy, int resistance) {
		super.J_state(healthy, resistance);
	}

}
