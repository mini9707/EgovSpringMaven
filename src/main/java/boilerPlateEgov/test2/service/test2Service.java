package boilerPlateEgov.test2.service;

import java.util.List;

public interface test2Service {

    void insertMember(String name, int age);

    List<test2VO> readAllMember();
}
