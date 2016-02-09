package com.yass.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

  @RequestMapping("/echo")
  public String index() {
    return "echo";
  }
}
