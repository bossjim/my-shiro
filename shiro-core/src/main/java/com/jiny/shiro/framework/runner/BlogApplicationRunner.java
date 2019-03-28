package com.jiny.shiro.framework.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @ClassName BlogApplicationRunner
 * @Description TODO
 * @Author jinyong
 * @DATE 2019/3/28 14:37
 * @Version 1.0
 **/
@Slf4j
@Component
public class BlogApplicationRunner implements ApplicationRunner {

    @Value("${server.port}")
    private int port;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("程序部署完成，访问地址：http://localhost:" + port);
    }
}
