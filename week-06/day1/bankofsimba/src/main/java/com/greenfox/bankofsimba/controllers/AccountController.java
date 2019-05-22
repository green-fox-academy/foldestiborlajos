package com.greenfox.bankofsimba.controllers;

import com.greenfox.bankofsimba.models.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountController {
  List<BankAccount> accountList = new ArrayList<>();
  public AccountController(){
    accountList.add(new BankAccount("Simba", 2000, "lion", true, true));
    accountList.add(new BankAccount("timon", 5000, "meerkat", false, true));
    accountList.add(new BankAccount("pumba", 500, "wart-hog", false, true));
    accountList.add(new BankAccount("baboon", 3457, "pavian", false, true));
    accountList.add(new BankAccount("kamari", 769, "jakal", false, false));
    accountList.add(new BankAccount("Mufasa", 6000, "lion", true, true));
    accountList.add(new BankAccount("scar", 5500, "lion", true, false));
  }
  @RequestMapping(path = "/show", method = RequestMethod.GET)
  public String showAccount(Model model) {
    BankAccount simbaAccount = new BankAccount("Simba", 2000, "lion", true, true);
    model.addAttribute("account", simbaAccount);
    return "show";
  }

  @GetMapping("/html")
  public String printHtml(Model model) {
    model.addAttribute("html", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "html";
  }

  @GetMapping("/showlist")
  public String showList(Model model) {
    model.addAttribute("list",accountList);
    return "/showlist";
  }

  @RequestMapping(path = "/raisebalance", method = RequestMethod.GET)
  public String raiseBalanceForm(Model model, BankAccount bankAccount) {
    model.addAttribute(bankAccount);
    return "/raisebalance";
  }

  @PostMapping("/raisebalance")
  public String raiseBalance(String name) {
    for (BankAccount b : accountList) {
      if (b.getName().equals(name)) {
        raiseMoney(b);
      }
    }
    return "redirect:/showlist";
  }

  @GetMapping("/create")
  public String createForm(Model model,@ModelAttribute(name = "account") BankAccount bankAccount){
    model.addAttribute( bankAccount);
    return "/create";
  }

  @PostMapping("/create")
  public String createAccount(@ModelAttribute(name ="account")BankAccount bankAccount ){
    accountList.add(bankAccount);
    return "redirect:/showlist";
  }


  public void raiseMoney(BankAccount bankAccount) {
    if (bankAccount.isKing()) {
      bankAccount.setBalance(bankAccount.getBalance() + 100);
    } else {
      bankAccount.setBalance(bankAccount.getBalance() + 10);
    }
  }
}
