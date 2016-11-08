package exam_01__aggregation;

import java.util.ArrayList;

public interface DAO {

	ArrayList<BookEntity> selectAll(String keyword);

}
