package oop_homework_2.punctul2;

import java.util.Random;

public class SamsungGalaxyA50 implements Phone {
    public SamsungGalaxyA50() {

    }

    @Override
    public void addContact() {

    }

    @Override
    public void listContacts() {

    }

    @Override
    public void sendMessage() {

    }

    @Override
    public void listMessages() {

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

    public SamsungGalaxyA50(int batteryLife, String color, String material, long imei) {
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.imei = imei;
    }

    public void samsungUse() {
        long leftLimit = 1L;
        long rightLimit = 16L;

        Phone phone = new SamsungGalaxyA50(((int) Math.random() * 10), "blue", "plastic", (leftLimit + (long) Math.random() * (rightLimit - leftLimit)));

    }
}
