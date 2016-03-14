/**
 * Copyright 2015 jianglibo@gmail.com
 *
 */

/**
 * @author jianglibo@gmail.com
 *         2016年3月14日
 *
 */
@Configuration
@EnableAutoConfiguration
@RestController
public class Application {

    @Value("${config.name}")
    String name = "World";

  @RequestMapping("/")
  public String home() {
    "Hello " + name;
  }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}