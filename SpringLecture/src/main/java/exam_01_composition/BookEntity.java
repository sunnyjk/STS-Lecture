package exam_01_composition;

// DTO를 만들수 있는 class
// Database를 근간으로 만들기
public class BookEntity {
	
	// field 명은 데이터베이스 column명과 동일하게 작성
	private String bisbn;
	private String btitle;
	private String bauthor;
	private int bprice;
	
	public BookEntity() {}
	
	public String getBisbn() {
		return bisbn;
	}
	public void setBisbn(String bisbn) {
		this.bisbn = bisbn;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public int getBprice() {
		return bprice;
	}
	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
		

}
