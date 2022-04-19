package com.kodilla.testing.extra;


import javax.xml.crypto.Data;
import java.util.HashSet;
import java.util.Set;

public class LotteryMachine implements Database {

    Database database;

    public LotteryMachine(Database database) {
        this.database = database;
    }


}

