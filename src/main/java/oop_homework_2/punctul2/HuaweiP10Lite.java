package oop_homework_2.punctul2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HuaweiP10Lite implements Phone {

    private List<Contacts> contactsList;
    private List<TextMessage> textMessageList;

    public HuaweiP10Lite(int batteryLife, String color, String material, long imei) {
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.imei = imei;
        contactsList = new ArrayList<>();
        textMessageList = new ArrayList<>();
    }

    public void addContact(Contacts contacts) {
        contactsList.add(contacts);
    }

    @Override
    public void listContacts() {
        contactsList.forEach(System.out::println);
    }

    public void sendMessage(TextMessage textMessage) {
        textMessageList.add(textMessage);
    }

    @Override
    public void listMessages() {
        textMessageList.forEach(System.out::println);
    }

    @Override
    public void call() {

    }

    @Override
    public void viewHistory() {

    }

    private int batteryLife;
    private String color, material;
    private long imei;

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public long getImei() {
        return imei;
    }

    public void setImei(long imei) {
        this.imei = imei;
    }

//    public HuaweiP10Lite(int batteryLife, String color, String material, long imei) {
//        this.batteryLife = batteryLife;
//        this.color = color;
//        this.material = material;
//        this.imei = imei;
//    }

//    public void huaweiUse() {
//        long leftLimit = 1L;
//        long rightLimit = 16L;
//
//        Phone phone = new HuaweiP10Lite(((int) (Math.random() * 100)), "blue", "plastic", (leftLimit + (long) Math.random() * (rightLimit - leftLimit)));
//
//    }

}
