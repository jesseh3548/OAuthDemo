package org.example.controller;

import org.example.entity.Account;
import org.example.entity.SimpleDatabase;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class RESTfulApiController {

    @RequestMapping("/info/{account}")
    public Account info(@PathVariable("account") String account) {
        return SimpleDatabase.database.get(account);
    }

    @RequestMapping("child/{account}")
    public List<Account> child(@PathVariable("account") String qq) {
        return SimpleDatabase.database.get(qq).getChildAccount();
    }
}
