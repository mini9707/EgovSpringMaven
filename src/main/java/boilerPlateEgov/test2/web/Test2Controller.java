package boilerPlateEgov.test2.web;

import boilerPlateEgov.test2.service.test2Service;
import boilerPlateEgov.test2.service.test2VO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class Test2Controller {

    //의존성주입
    @Resource(name = "test2Service")
    private test2Service service;

    //Create
    @RequestMapping(value = "/write.do", method = RequestMethod.POST)
    @ResponseBody
    public String insertMember(@RequestParam String name, @RequestParam int age){
        service.insertMember(name, age);
        return "success";
    }

    //Read
    @RequestMapping("/read.do")
    @ResponseBody
    public List<test2VO> readAllMember(){
        return service.readAllMember();
    }

    //Update

    //Delete
}
