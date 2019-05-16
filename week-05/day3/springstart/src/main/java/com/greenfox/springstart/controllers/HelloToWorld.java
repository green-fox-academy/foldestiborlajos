package com.greenfox.springstart.controllers;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloToWorld {
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  String[] colors = {"green", "red", "yellow", "blue","crimson"};
  String[] font = {"Calibri", "Times New Roman", "Georgia", "Arial", "Lucida Console"};
  String[] fontSize = {"12px","17px","34px","56px","7px","29px","120px","72px"};
  String[] position = { "right", "center", "bottom","top"};


  @RequestMapping("/hellotoworld")
  public String helloHello(Model model){
    int randomIndex = (int)(Math.random() * (hellos.length-1));

    model.addAttribute("hellos" ,hellos[randomIndex]);
    model.addAttribute("color", colors[(int)(Math.random()* (colors.length-1))]);
    model.addAttribute("font",font[3]);
    model.addAttribute("fontsize", fontSize[(int)(Math.random()* (fontSize.length-1))]);
    model.addAttribute("position", position[(int)(Math.random()*(position.length-1))]);
         return "hellotoworld";
  }

}
