package cloud.test.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 执笔
 * @date 2019/3/11 11:40
 */
@Service
public class IndexService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "indexFall")
    public String index() {
        return restTemplate.getForObject("http://provider/", String.class);
    }

    /**
     * 异常的时候熔断
     * @return
     */
    public String indexFall() {
        return "this is error";
    }
}
