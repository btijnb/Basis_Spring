package test.com.ex;

import javax.annotation.*;

public class Player2 {

  private String name;
  private int age;

  public Player2() {}

  public Player2(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @PostConstruct
  public void init() {
    System.out.println("Bean生成時処理する「作業」");
  }

  @PreDestroy
  public void destroy() {
    System.out.println("Bean消滅時処理する「作業」");
  }
}
