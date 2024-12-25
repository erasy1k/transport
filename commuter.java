package com.transport;

public class Commuter {
    private String name;
    private String id;
    private String contactNumber;

    // Конструктор
    public Commuter(String name, String id, String contactNumber) {
        this.name = name;
        this.id = id;
        this.contactNumber = contactNumber;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Метод для отображения информации о пассажире
    public void displayInfo() {
        System.out.println("Имя пассажира: " + name + ", ID: " + id + ", Контакт: " + contactNumber);
    }
}
