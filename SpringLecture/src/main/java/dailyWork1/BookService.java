package dailyWork1;

import java.util.ArrayList;

public class BookService {
	
	private BookDAO dao;
	
	public BookService() {
		// TODO Auto-generated constructor stub
	}
	
	public BookDAO getDao() {
		return dao;
	}

	public void setDao(BookDAO dao) {
		this.dao = dao;
	}

	public BookService(BookDAO dao) {
		this.dao = dao;
	}

	public ArrayList<BookEntity> getListByKeyword(String keyword) {
		return dao.getList(keyword);
	}
	
	public ArrayList<CommentEntity> getCommentsList(String bisbn){
		return dao.getCommentsList(bisbn);
	}

}
