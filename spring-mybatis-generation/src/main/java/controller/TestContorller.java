package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestContorller {

    @GetMapping(value = "test01")
    public String test01() {
        String result = "===test01===";
        System.out.println(result);
        return result;
    }
}