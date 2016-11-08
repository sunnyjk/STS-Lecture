package exam_01_composition;

import java.util.ArrayList;

public class BookService {

	public ArrayList<BookEntity> getListByKeyword(String keyword) {

		// 로직처리
		// DB처리
		// 객체가 다른 객체를 사용할 때 있어서의 관계
		// 서비스 객체가 자신의 method 내에서 다른 객체(DAO)를 생성해서 사용
		// 이를 composition 관계에 있다고 얘기한다.
		// 두 개의 객체가 강하게 결합할 수 밖에 없다.(tightly coupled)
		// 클래스를 재사용하기가 힘들다. 유지보수적인 측면도 좋지 않다. 
		// 이는 우리가 하려는 객체지향 프로그램과 상반되는 현상.
		BookDAO dao = new BookDAO();
		return dao.selectAll(keyword);
	}

}
