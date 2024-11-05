package boilerPlateEgov.test2.service.impl;

import boilerPlateEgov.test2.service.test2Service;
import boilerPlateEgov.test2.service.test2VO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("test2Service")
public class test2ServiceImpl extends EgovAbstractServiceImpl implements test2Service {

    @Resource(name = "test2DAO")
    private test2DAO test2DAO;

    public void insertMember(String name, int age) {
        test2VO test2VO = new test2VO();
        test2VO.setName(name);
        test2VO.setAge(age);

        test2DAO.insertMember(test2VO);
    }

    public List<test2VO> readAllMember() {
        return test2DAO.selectAll();
    }
}