package com;

import io.swagger.annotations.Api;
import io.swagger.annotations.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 注意，这里的@MapperScan是tk包下的，而不是org
 * @author
 */
@MapperScan("com.jt.mapper")
@EnableSwagger2
@SpringBootApplication
public class MappergeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MappergeneratorApplication.class, args);
    }

}
