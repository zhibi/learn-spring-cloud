package cloud.test.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 请求权限过滤器
 *
 * @author 执笔
 * @date 2019/3/12 15:25
 */
@Component
@Slf4j
public class AccessFilter extends ZuulFilter {
    /**
     * 过滤器类型
     * @return
     */
    @Override
    public String filterType() {
        log.info("filterType");
        return "pre";
    }

    /**
     * 过滤器的执行顺序
     * @return
     */
    @Override
    public int filterOrder() {
        log.info("filterOrder");
        return 0;
    }

    /**
     * 判断过滤器是否需要执行
     * @return
     */
    @Override
    public boolean shouldFilter() {
        log.info("shouldFilter");
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        log.info("send {} request to {}",request.getMethod(),request.getRequestURI());

        String accessToken = request.getParameter("accessToken");
        if(accessToken == null){
            log.warn("accessToken is empty");
            /**
             * 过滤请求  不路由
             */
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(401);
        }

        return null;
    }
}
