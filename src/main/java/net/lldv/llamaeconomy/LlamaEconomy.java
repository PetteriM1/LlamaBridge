package net.lldv.llamaeconomy;

import net.lldv.llamaeconomy.components.api.API;

import java.text.DecimalFormat;

public class LlamaEconomy {

    private static final API api = new API();

    public static API getAPI() {
        return api;
    }

    public double getDefaultMoney() {
        return api.getDefaultMoney();
    }

    public String getMonetaryUnit() {
        return api.getMonetaryUnit();
    }

    public DecimalFormat getMoneyFormat() {
        return api.getMoneyFormat();
    }
}
