package net.lldv.llamaeconomy.components.api;

import cn.nukkit.Player;
import me.onebone.economyapi.EconomyAPI;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class API {

    private final EconomyAPI api;

    public API() {
        api = EconomyAPI.getInstance();
    }

    public boolean hasAccount(UUID uuid) {
        return api.hasAccount(uuid);
    }

    public boolean hasAccount(Player player) {
        return api.hasAccount(player);
    }

    public boolean hasAccount(String username) {
        return api.hasAccount(username);
    }

    public void hasAccount(Player player, Consumer<Boolean> callback) {
        boolean account = api.hasAccount(player);
        CompletableFuture.runAsync(() -> callback.accept(account));
    }

    public void hasAccount(String player, Consumer<Boolean> callback) {
        boolean account = api.hasAccount(player);
        CompletableFuture.runAsync(() -> callback.accept(account));
    }

    public void createAccount(UUID uuid, double money) {
        api.createAccount(uuid, money);
    }

    public void createAccount(Player player, double money) {
        api.createAccount(player, money);
    }

    public void createAccount(String username, double money) {
        api.createAccount(username, money, false);
    }

    public void createAccount(UUID uuid, double money, Runnable runnable) {
        api.createAccount(uuid, money);
        CompletableFuture.runAsync(runnable);
    }

    public void createAccount(Player player, double money, Runnable runnable) {
        api.createAccount(player, money);
        CompletableFuture.runAsync(runnable);
    }

    public void createAccount(String username, double money, Runnable runnable) {
        api.createAccount(username, money, false);
        CompletableFuture.runAsync(runnable);
    }

    public double getMoney(UUID uuid) {
        return api.myMoney(uuid);
    }

    public double getMoney(Player player) {
        return api.myMoney(player);
    }

    public double getMoney(String username) {
        return api.myMoney(username);
    }

    public void getMoney(UUID uuid, Consumer<Double> callback) {
        double money = api.myMoney(uuid);
        CompletableFuture.runAsync(() -> callback.accept(money));
    }

    public void getMoney(Player player, Consumer<Double> callback) {
        double money = api.myMoney(player);
        CompletableFuture.runAsync(() -> callback.accept(money));
    }

    public void getMoney(String username, Consumer<Double> callback) {
        double money = api.myMoney(username);
        CompletableFuture.runAsync(() -> callback.accept(money));
    }

    public void setMoney(UUID uuid, double money) {
        api.setMoney(uuid, money);
    }

    public void setMoney(Player player, double money) {
        api.setMoney(player, money);
    }

    public void setMoney(String username, double money) {
        api.setMoney(username, money);
    }

    public void setMoney(UUID uuid, double money, Runnable runnable) {
        api.setMoney(uuid, money);
        CompletableFuture.runAsync(runnable);
    }

    public void setMoney(Player player, double money, Runnable runnable) {
        api.setMoney(player, money);
        CompletableFuture.runAsync(runnable);
    }

    public void setMoney(String username, double money, Runnable runnable) {
        api.setMoney(username, money);
        CompletableFuture.runAsync(runnable);
    }

    public void addMoney(UUID uuid, double money) {
        api.addMoney(uuid, money);
    }

    public void addMoney(Player player, double money) {
        api.addMoney(player, money);
    }

    public void addMoney(String username, double money) {
        api.addMoney(username, money);
    }

    public void addMoney(UUID uuid, double money, Runnable runnable) {
        api.addMoney(uuid, money);
        CompletableFuture.runAsync(runnable);
    }

    public void addMoney(Player player, double money, Runnable runnable) {
        api.addMoney(player, money);
        CompletableFuture.runAsync(runnable);
    }

    public void addMoney(String username, double money, Runnable runnable) {
        api.addMoney(username, money);
        CompletableFuture.runAsync(runnable);
    }

    public void reduceMoney(Player player, double money) {
        api.reduceMoney(player, money);
    }

    public void reduceMoney(UUID uuid, double money) {
        api.reduceMoney(uuid, money);
    }

    public void reduceMoney(String username, double money) {
        api.reduceMoney(username, money);
    }

    public void reduceMoney(Player player, double money, Runnable runnable) {
        api.reduceMoney(player, money);
        CompletableFuture.runAsync(runnable);
    }

    public void reduceMoney(UUID uuid, double money, Runnable runnable) {
        api.reduceMoney(uuid, money);
        CompletableFuture.runAsync(runnable);
    }

    public void reduceMoney(String username, double money, Runnable runnable) {
        api.reduceMoney(username, money);
        CompletableFuture.runAsync(runnable);
    }

    public void getAll(Consumer<Map<String, Double>> callback) {
        Map<String, Double> money = new LinkedHashMap<>(api.getAllMoney());
        CompletableFuture.runAsync(() -> callback.accept(money));
    }

    public Map<String, Double> getAll() {
        return api.getAllMoney();
    }

    public String getMonetaryUnit() {
        return api.getMonetaryUnit();
    }

    public DecimalFormat getMoneyFormat() {
        return EconomyAPI.MONEY_FORMAT;
    }

    public double getDefaultMoney() {
        return api.getDefaultMoney();
    }
}