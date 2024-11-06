package boilerPlateEgov.test2.service;

import java.util.List;

public interface test2Service {

    void insertMember(String name, int age);

    List<test2VO> readAllMember();

    test2VO readOneMember(String name);

    String updateMember(String name, int age);

    String deleteMember(String name);
}
