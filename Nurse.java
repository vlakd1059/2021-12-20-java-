package �̴��׽�Ʈ;

public class Nurse extends Job {
	private String name = "��ȣ��";
	private int stamina = 100; // ü��
	private int resistance = 10 + 15; // ���׷�

	@Override
	public void selectJob() {
		super.selectJob();
	}

	@Override
	public void J_state(int healthy, int resistance) {
		super.J_state(healthy, resistance);
	}

}
