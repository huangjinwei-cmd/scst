package cn.tycoding.scst.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 分布式配置中心  Config
 *
 * @author tycoyyding
 * @date 2019-06-08
 */
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class ScstConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScstConfigApplication.class, args);
    }
}