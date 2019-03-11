package cloud.test.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 执笔
 * @date 2019/3/11 11:48
 */
@Configuration
public class BlConfig {
    /**
     * 配置负载均衡策略
     * @return
     */
    @Bean
    public IRule rule() {
        return new RandomRule();
    }
}
