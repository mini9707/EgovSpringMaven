package boilerPlateEgov.test.service.impl;

import boilerPlateEgov.test.service.testVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("testDAO")
public class testDAO extends EgovAbstractMapper{
	
	public List<testVO> selectAll() {
		//selectOne()
		//update() int 5
		//delete() int  1
		//insert() int 4
		// return map
		return selectList("testSelectAll");
		// 매개변수가 2개 들어갈수 있어
		// 첫번째는 이름, 두번째는 값
	}

}
