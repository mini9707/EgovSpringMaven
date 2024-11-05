package boilerPlateEgov.test2.service.impl;

import boilerPlateEgov.test2.service.test2VO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("test2DAO")
public class test2DAO extends EgovAbstractMapper {

    public int insertMember(test2VO vo) {
        return insert("testInsertMember", vo);
    }

    public List<test2VO> selectAll() {
        return selectList("test2SelectAll");
    }
}
