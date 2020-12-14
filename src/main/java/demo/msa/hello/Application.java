package demo.msa.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@SpringBootApplication
public class Application {

  @RequestMapping("/")
  public String index() {
    return "Hello";
  }

  @RequestMapping("/test1")
  public String test1(String value) {
    System.out.println(value);
    return "Hello1";
  }

  @RequestMapping("/test2")
  public String test2(@RequestBody String json) {
    System.out.println(json);
    return "Hello2";
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
