package exam_01__aggregation;

import java.util.ArrayList;

public class BookService {
	
	private DAO dao;
	
	public BookService(DAO dao){
		this.dao = dao;
	};

	public ArrayList<BookEntity> getListByKeyword(String keyword) {
		return dao.selectAll(keyword);
	}

}
