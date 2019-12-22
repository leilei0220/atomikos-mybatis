package com.example.conf;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description TODO
 * @Author leilei
 * @Date 2019/12/21 17:20
 */
@Data
@ConfigurationProperties(prefix = "spring.datasource.db1")
public class DB1Config {

    @Value("${spring.datasource.db1.jdbc-url}")
    private String url_jdbc;

    @Value("${spring.datasource.db1.username}")
    private String username;

    @Value("${spring.datasource.db1.password}")
    private String password;
}
