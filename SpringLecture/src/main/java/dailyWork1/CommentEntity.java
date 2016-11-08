package dailyWork1;

import java.util.ArrayList;

public class CommentEntity {
	
	private String bisbn;
	private String comments;
	private ArrayList<CommentEntity> list;
	public String getBisbn() {
		return bisbn;
	}
	public void setBisbn(String bisbn) {
		this.bisbn = bisbn;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public ArrayList<CommentEntity> getList() {
		return list;
	}
	public void setList(ArrayList<CommentEntity> list) {
		this.list = list;
	}
	
	
	

}
