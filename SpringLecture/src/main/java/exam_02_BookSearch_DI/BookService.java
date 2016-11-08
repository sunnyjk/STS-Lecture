package exam_02_BookSearch_DI;

import java.util.ArrayList;

public class BookService {
	
	private BookDAO dao;
	private String keyword;
	
	public BookService() {
		// default constructor는 무조건 만들어주는게 좋다.
	}
	
	public BookService(BookDAO dao) {
		this.dao = dao;
	}
	
	public BookDAO getDao() {
		return dao;
	}

	public void setDao(BookDAO dao) {
		this.dao = dao;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public ArrayList<BookEntity> getListByKeyword() {
		return dao.selectAll(keyword);
	}

}
