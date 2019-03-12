package cloud.test.gateway.config;

import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 执笔
 * @date 2019/3/12 16:21
 */
@Configuration
public class BeanConfig {
    /**
     * 自定义路由规则
     * @return
     */
    @Bean
    public PatternServiceRouteMapper routeMapper() {
        return new PatternServiceRouteMapper("?<name>.*)-(?<version>v.*$)", "${version}/${name}");
    }
}
