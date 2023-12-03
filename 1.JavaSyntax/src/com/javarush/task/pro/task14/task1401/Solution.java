package com.javarush.task.pro.task14.task1401;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Поработай обработчиком
*/

public class Solution {

    public static final String INPUT_NAME = "\nВведите имя: ";
    public static final String INPUT_AGE = "Введите возраст пользователя '%s': ";

    public static final String CANNOT_BE_NULL = "Имя не может быть null.";
    public static final String CANNOT_BE_EMPTY = "Имя не может быть пустым.";
    public static final String CANNOT_CONTAIN_DIGIT = "Имя не может содержать цифры.";
    public static final String CANNOT_BE_NEGATIVE = "Возраст не может быть меньше 0.";
    public static final String CANNOT_BE_TOO_BIG = "Возраст не может быть больше 150.";
    public static final String UNKNOWN_ERROR = "Неизвестная ошибка.";

    public static final String FOUND = "\nПользователь '%s' найден под индексом %d.\n";
    public static final String NOT_FOUND = "\nПользователь '%s' не найден.\n";

    static List<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            addUser(new User());
        }

        User userToSearch = new User();
        userToSearch.setName("Рафаэль");

        findUserIndex(userToSearch);
    }

    static void addUser(User user) {
        System.out.print(INPUT_NAME);
        String name = scanner.nextLine();

        System.out.printf(INPUT_AGE, name);
        int age = Integer.parseInt(scanner.nextLine());

        //напишите тут ваш код
        int abc=user.setName(name);
        if(abc==-1){
            System.out.println(CANNOT_BE_NULL);
        }else if(abc==-2){
            System.out.println(CANNOT_BE_EMPTY);
        }else if(abc==-3){
            System.out.println(CANNOT_CONTAIN_DIGIT);
        }else if(abc!=0){
            System.out.println(UNKNOWN_ERROR);
        }

        int abc1=user.setAge(age);
        if(abc1==-1){
            System.out.println(CANNOT_BE_NEGATIVE);
        }else if(abc1==-2){
            System.out.println(CANNOT_BE_TOO_BIG);
        }else if(abc1!=0){
            System.out.println(UNKNOWN_ERROR);
        }
        users.add(user);
    }

    static void findUserIndex(User user) {
        //напишите тут ваш код
        int a=users.indexOf(user);
        if(a==-1){
            System.out.printf(NOT_FOUND,user.getName());
        }else
        System.out.printf(FOUND, user.getName(), users.indexOf(user));
    }
}
