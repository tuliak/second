package com.lesson;

public class Human {
    private final int minAge = 0;
    private final int maxAge = 120;
    private final int minNameLength = 3;
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public String setName(String newName) {
        if (newName != null && newName.length() > minNameLength){
        name = newName;
        }
        return name;
    }
    public int setAge(int newAge) {
        if (newAge > minAge && newAge > 0 && newAge < maxAge) {
        age = newAge;
        } else {
            System.out.println("Ошибка! Проверьте корректность ввода возраста");
        }
        return age;
    }
    public int getAge() {
        return age;

    }
}
