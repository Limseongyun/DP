package observer;

import java.util.ArrayList;
import java.util.List;

public class Baedi implements Coach {

	private List<Crew> crews = new ArrayList<Crew>();

	public void eatFood() {
		System.out.println("베디코치가 밥을 먹는다");
		notifyCrew("나 밥먹었다 .");
	}

	public void runaway() {
		System.out.println("베디 코치가 농땡이를 친다");
		notifyCrew("나 농땡이 친다 .");
	}
	
	public void upgradePower() {
		System.out.println("베디코치가 힘을 강화했다.");
		notifyCrew("강해졌다 .");
	}

	@Override
	public void subscribe(Crew crew) {
		crews.add(crew);
	}

	@Override
	public void unsubscribe(Crew crew) {
		crews.remove(crew);
	}

	@Override
	public void notifyCrew(String msg) {
		crews.forEach(crew -> crew.update(msg));
	}

}
