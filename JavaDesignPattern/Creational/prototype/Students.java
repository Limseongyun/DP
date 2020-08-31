package prototype;

import java.util.ArrayList;
import java.util.List;

public class Students implements Cloneable {
	
	
	private List<String> studentlist;
	//어레이리스트 초기화
	public Students() {
		studentlist = new ArrayList<String>();
	}
	//새성자로 받으면 갈아치우기
	public Students(List<String> list) {
		this.studentlist = list;
	}
	//DB에서 받아오겠지 원래는
	public void loadData() {
		studentlist.add("임성윤");
		studentlist.add("홍길동");
		studentlist.add("김수환");
		studentlist.add("최코딩");
	}
	
	//리스트 반환
	public List<String> getStudents(){
		return studentlist;
	}
	
	//클론을 재정의 깊은복사 ㄱ
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for(String e : this.studentlist) {
			temp.add(e);
		}
		return new Students(temp);
	}
	
	/////////////////////////////////////////
	public static void main(String[] args) throws CloneNotSupportedException {
		//기본생성자로 어레이 리스트를 생성한다
		Students std = new Students();
		//생성한 어레이 리스트에 값을 넣는다
		std.loadData();
		
		//깊은 복사를통해 std 객체를 그대로 복사해온다
		Students stdNew1 = (Students)std.clone();
		Students stdNew2 = (Students)std.clone();
		stdNew1.getStudents().add("테스트");
		stdNew2.getStudents().remove("임성윤");
		
		System.out.println("student List : "+std.getStudents()+std.hashCode());
		System.out.println("studentNew1 List : "+stdNew1.getStudents()+stdNew1.hashCode());
		System.out.println("studentNew2 List : "+stdNew2.getStudents()+stdNew2.hashCode());
	}
}
