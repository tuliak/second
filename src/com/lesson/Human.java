package com.lesson;

public class Human {
    public static final int MIN_AGE = 0;

    private static final int MAX_AGE = 120;

    private static final int MIN_NAME_LENGTH = 3;

    private String name;

    private int age;

    public String getName() {
        return name;
    }
    public String setName(String newName) {
        if (newName != null && newName.length() > MIN_NAME_LENGTH){
        name = newName;
        }
        return name;
    }
    public int setAge(int newAge) {
        if (newAge > MIN_AGE && newAge > 0 && newAge < MAX_AGE) {
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
