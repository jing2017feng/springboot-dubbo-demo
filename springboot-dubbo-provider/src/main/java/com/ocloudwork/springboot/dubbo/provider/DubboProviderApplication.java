package com.ocloudwork.springboot.dubbo.provider;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author minghui
 */
@SpringBootApplication
@DubboComponentScan("com.ocloudwork.springboot.dubbo.provider.service")
public class DubboProviderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(DubboProviderApplication.class).web(WebApplicationType.NONE).run(args);
    }
}
