package com.webservice.springbootsoapwebservice.service;

import com.webservice.spring_boot_soap_webservice.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

  private static final Map<String, User> users = new HashMap<>();

  @PostConstruct
  public void initialize(){

    User emre = new User();
    emre.setName("Emre");
    emre.setEmpId(1111);
    emre.setSalary(123123);

    User fatih = new User();
    fatih.setName("Fatih");
    fatih.setEmpId(2222);
    fatih.setSalary(12345);

    User mahsun = new User();
    mahsun.setName("Mahsun");
    mahsun.setEmpId(3333);
    mahsun.setSalary(6789);

    users.put(emre.getName(),emre);
    users.put(fatih.getName(),fatih);
    users.put(mahsun.getName(),mahsun);

  }

  public  User getUsers(String name){
    return users.get(name);
  }

}
