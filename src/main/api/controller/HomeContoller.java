package api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeContoller {
    @GetMapping
    public String hello() { return "<h1> Вас приветствует Система по управлению бибилиотекой<h1>";}
}
