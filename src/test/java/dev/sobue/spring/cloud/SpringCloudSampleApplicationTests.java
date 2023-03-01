package dev.sobue.spring.cloud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringCloudSampleApplicationTests {

  private final ApplicationContext context;

  @Autowired
  SpringCloudSampleApplicationTests(ApplicationContext context) {
    this.context = context;
  }

  @Test
  void contextLoads() {
    assertNotNull(context);
  }
}
