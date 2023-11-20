package org.example.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class SimpleDatabase {

    public static Map<String, Account> database;

    static {
        database = new HashMap<>();
        database.put("testAccount1", Account.builder().name("testAccount1").nickName("tA1").remark("1").build());
        database.put("testAccount2", Account.builder().name("testAccount2").nickName("tA2").remark("2").build());

        Account Account1 = database.get("testAccount1");
        Account1.setChildAccount(new ArrayList<>());
        for (int i = 0; i < 10; i++) {
            Account1.getChildAccount().add(Account.builder().name("testChild1_" + i).nickName("tC1_" + i).remark(i + "").build());
        }

        Account qqAccount2 = database.get("testAccount2");
        qqAccount2.setChildAccount(new ArrayList<>());
        for (int i = 0; i < 7; i++) {
            qqAccount2.getChildAccount().add(Account.builder().name("testChild2_" + i).nickName("tC2_" + i).remark(i + "").build());
        }
    }
}