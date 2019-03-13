package cloud.test.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    @LoadBalanced
    private RestTemplate loadBalanced;


    /**
     * 通过 restTemplate调用
     * 调用时候指定 实例id
     * 多个restTemplate 会不会使用负载均衡
     *
     * @return
     */
    @RequestMapping("/")
    public String index() {
        System.out.println(loadBalanced.getForObject("http://provider/", String.class));
        /**
         * 会报错  不使用loadBalanced 不能使用 eureka 服务
         */
        System.out.println(restTemplate.getForObject("http://provider/", String.class));
        return loadBalanced.getForObject("http://provider/", String.class);
    }
}
