package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Здраствуйте! Это наш список по имени <<A>>." +
                "\nВведите сюда 5 слов, в одну строку по одному слову \uD83D\uDC47");
        ArrayList<String> spisok_a = new ArrayList<>();
        spisok_a.add(scanner.next());
        spisok_a.add(scanner.next());
        spisok_a.add(scanner.next());
        spisok_a.add(scanner.next());
        spisok_a.add(scanner.next());
        System.out.println(spisok_a);
        System.out.println("__________________________");
        System.out.println("Это наш ещё один список по имени <<B>>." +
                " Пожалуйста введите ещё 5 слов, в одну строку по одному слову \uD83D\uDC47");
        ArrayList<String> spisok_b = new ArrayList<>();
        spisok_b.add(scanner.next());
        spisok_b.add(scanner.next());
        spisok_b.add(scanner.next());
        spisok_b.add(scanner.next());
        spisok_b.add(scanner.next());
        System.out.println(spisok_b);
        System.out.println("__________________________");
        System.out.println("Это ещё один список по имени <<C>>." +
                "\n Это список смешанных со встречей <<A>> и <<B>>\uD83D\uDC47");
        ArrayList<String> spisok_c = new ArrayList<>();
        Iterator <String> iterA = spisok_a.listIterator();
        Iterator <String> iterB = spisok_b.listIterator();
        Collections.reverse(spisok_b);
        for (int i = 0; i < spisok_a.size(); i++) {
            spisok_c.add(iterA.next());
            spisok_c.add(iterB.next());
        }
        System.out.println("Это список <<C>> только я здесь отсортировал элементы списка <<С>> по длине слова");
        System.out.println("список <<С>>: " + spisok_c);
        Collections.sort(spisok_c, new LengthFirstComparator());
        System.out.println(spisok_c);
    }

}