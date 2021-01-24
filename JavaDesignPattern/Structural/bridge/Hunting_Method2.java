package bridge;

public class Hunting_Method2 implements Hunting_Handler{

	@Override
	public void Find_Quarry() {
		System.out.println("지상에서 찾느다.");
	}

	@Override
	public void Detected_Quarry() {
		System.out.println("노루 발견");
	}

	@Override
	public void attack() {
		System.out.println("물어뜯는다.");
	}

}
