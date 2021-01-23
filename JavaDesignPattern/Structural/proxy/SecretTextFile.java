package proxy;

public class SecretTextFile implements TextFile {
	
	private String plainText;
	
	public SecretTextFile(String fileName) {
		//	특별한 복호화 기법을 이용해 데이터를 복원해서 내용을 반환합니다.
		this.plainText = SecretFileHolder.decodeByFileName(fileName);
	}
	@Override
	public String fetch() {
		return plainText;
	}

}
