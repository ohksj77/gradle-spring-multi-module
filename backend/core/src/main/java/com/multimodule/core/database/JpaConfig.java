package com.multimodule.core.database;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "com.multimodule")
@EnableJpaRepositories(basePackages = "com.multimodule")
public class JpaConfig {}
