package cloud.test.prodiver2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
public class TestController {

    @GetMapping("/")
    public String index(HttpServletRequest request) {
        return "index-2";
    }
}
