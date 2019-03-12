package cloud.test.consumer.controller;

import cloud.test.consumer.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 执笔
 * @date 2019/3/11 11:43
 */
@RestController
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/")
    public String index() {
        return indexService.index();
    }
}
