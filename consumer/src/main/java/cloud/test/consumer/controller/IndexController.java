package cloud.test.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 通过 restTemplate调用
     * 调用时候指定 实例id
     *
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return restTemplate.getForObject("http://provider/", String.class);
    }
}
