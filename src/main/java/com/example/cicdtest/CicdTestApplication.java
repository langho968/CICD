package com.example.cicdtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CicdTestApplication {

    public static final String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.properties,"
            + "classpath:appspec.yml";

    // S3
// application.properties와 aws.yml 두개의 파일 모두를 설정 파일로 읽어서 사용
    public static void main(String[] args) {
        new SpringApplicationBuilder(CicdTestApplication.class)
                .properties(APPLICATION_LOCATIONS)
                .run(args);
    }
}