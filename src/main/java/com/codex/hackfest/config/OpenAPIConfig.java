package com.codex.hackfest.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfig {

  @Value("${hackfest.openapi.dev-url}")
  private String devUrl;

  @Value("${hackfest.openapi.prod-url}")
  private String prodUrl;

  @Bean
  OpenAPI myOpenAPI() {

    Server devServer = new Server();
    devServer.setUrl(devUrl);
    devServer.setDescription("Server URL in Development environment");

    Server prodServer = new Server();
    prodServer.setUrl(prodUrl);
    prodServer.setDescription("Server URL in Production environment");

    Info info = new Info()
        .title("HackFest Native Website API")
        .version("1.0")
        .description("This API exposes endpoints to manage hackfest native website.");

    return new OpenAPI().info(info).servers(List.of(devServer, prodServer));
  }
}
