package com.i520java.springcloud;/**
 * date: 2020/4/29 20:03<br/>
 *
 * @author jinge<br />
 * @version
 * @description 此模板由【Jin ge】提供!
 * 更多教程请访问 https://www.520java.com 交流学习
 * @since JDK 1.8
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @PackageName:com.i520java.springcloud
 * @ClassName:Cloud2020Application
 * @author:金格[JIN_GE]
 * @date:2020/4/29 20:03 
 * @description 此模板由【Jin ge】提供!
 *              更多教程请访问 https://www.520java.com 交流学习
 */
@SpringBootApplication
@MapperScan("com.i520java.springcloud.dao")
@EnableEurekaClient
public class PamentMain8002 {

    public static void main(String[] args) {

        SpringApplication.run(PamentMain8002.class);

    }
}
