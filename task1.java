// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.

// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов

// Вывести данные по сотрудникам с фамилией Иванов.

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.put(123456, "Иванов");
        db.put(321456, "Васильев");
        db.put(234561, "Петрова");
        db.put(234432, "Иванов");
        db.put(654321, "Петрова");
        db.put(345678, "Иванов");

        Scanner scan = new Scanner(System.in);
        // System.out.println("Введите фамилию для поиска: ");
        String sekond_name = "Иванов";

        for (int str : db.keySet()) {

            if (db.get(str).equals(sekond_name)) {
                System.out.printf("%s %s \n", str, db.get(str));
            }

        }
    }

}

//другое решение
// public static void main(String[] args) {
//     TreeMap<Integer, String> db = new TreeMap<>();
//     db.put(123456, "Иванов");
//     db.put(321456, "Васильев");
//     db.put(234561, "Петрова");
//     db.put(234432, "Иванов");
//     db.put(654321, "Петрова");
//     db.put(345678, "Иванов");
//     for (var item : db.entrySet()) {
//     if (item.getValue().equals("Иванов")) {
//     System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
//     }
//     }
//     }

//другое решегние
// Map<Integer, String> map = new HashMap<>();
// map.put(123456, "Иванов");
// map.put(321456, "Васильев");
// map.put(234561, "Петрова");
// map.put(234432, "Иванов");
// map.put(654321, "Петрова");
// map.put(345678, "Иванов");
// System.out.println(map.values());

// for (var item : map.entrySet())
// {
// if (item.getValue().equals("Иванов"))
// {
// System.out.println("паспорт: " + item.getKey() + " фамилия: " + item.getValue());
// }
// }