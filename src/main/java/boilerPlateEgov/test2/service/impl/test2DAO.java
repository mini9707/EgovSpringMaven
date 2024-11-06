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

    public test2VO selectOne(String name){
        return selectOne("test2SelectOne", name);
    }

    public void updateMember(test2VO vo) {
        update("test2UpdateMember", vo);
    }

    public void deleteMember(test2VO vo) {
        delete("test2DeleteMember", vo);
    }
}
