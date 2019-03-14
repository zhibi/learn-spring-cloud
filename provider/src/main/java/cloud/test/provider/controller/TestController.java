package cloud.test.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @GetMapping("/")
    public String index(@RequestHeader(value = "X-B3-TraceId", required = false) String traceId,
                        @RequestHeader(value = "X-B3-SpanId", required = false) String spanId,
                        @RequestHeader(value = "X-B3-ParentSpanId", required = false) String parentSpanId,
                        @RequestHeader(value = "X-B3-Span-Name", required = false) String spanName) {
        log.info("-----  provider");
        log.info("traceId:" + traceId);
        log.info("spanId:" + spanId);
        log.info("parentSpanId:" + parentSpanId);
        log.info("spanName:" + spanName);
        return "index";
    }
}
