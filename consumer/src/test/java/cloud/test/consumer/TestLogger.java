package cloud.test.consumer;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 执笔
 * @date 2019/3/13 10:02
 */
public class TestLogger {

    private Logger logger = LoggerFactory.getLogger(TestLogger.class);

    @Test
    public void test(){
        logger.info("123");
        logger.debug("123");
        logger.warn("123");
        logger.error("123");
    }
}
