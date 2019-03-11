package cloud.test.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 执笔
 * @date 2019/3/11 11:40
 */
@FeignClient(name = "provider")
public interface FeignService {

    /**
     * 这里要和 provider 服务提供的接口一致
     *
     * @return
     */
    @GetMapping("/")
    String index();

}
