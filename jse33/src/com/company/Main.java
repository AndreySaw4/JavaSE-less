package com.company;
/**

Создайте класс DocumentWorker. В теле класса создайте три метода:
        openDocument(), editDocument(), saveDocument(). В тело каждого из методов
        добавьте вывод на экран соответствующих строк: "Документ открыт",
        "Редактирование документа доступно в версии Про", "Сохранение
        документа доступно в версии Про" соответственно. Создайте
        производный класс ProDocumentWorker. Переопределите соответствующие
        методы, при переопределении методов выводите следующие строки: "Документ
        отредактирован", "Документ сохранен в старом формате. Сохранение в
        остальных форматах доступно в версии Эксперт".
        Создайте класс ExpertDocumentWorker — производный от базового класса
        ProDocumentWorker. Переопределите соответствующий метод, при вызове
        которого необходимо выводить на экран "Документ сохранен в новом формате".


        В теле метода main() реализуйте возможность приема от пользователя ключа
        доступа: pro или exp. Если пользователь не вводит ключ, то он может пользоваться
        только бесплатной версией (создается экземпляр базового класса), если
        пользователь ввел номера ключа доступа pro или exp, то должен создаться
        экземпляр соответствующей версии класса, приведенный к базовому —
        DocumentWorker.

*/


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("==================================");
        System.out.println("==================================");
        System.out.println("==================================");
        System.out.println("==================================");
  //      instance_c.saveDocument(s);


        Scanner in = new Scanner(System.in);
        System.out.print("Input your license key: ");
        //String str = in.nextLine();

        String str = in.nextLine();  // Read user input


        //String str1 = str;
        System.out.println(str);

        String s = "filename";
        String key1 = "pro";
        String key2 = "expert";

        if (str.equals(key1)) {
            System.out.println("License key activated in pro version\n");
            ProDocumentWorker instance_b = new ProDocumentWorker();

            System.out.println("\nProDocumentWorker");

            instance_b.openDocument(s);
            instance_b.editDocument(s);
            instance_b.saveDocument(s);

        }

        else if (str.equals(key2)){
            System.out.println("License key activated in expert version\n");
            ExpertDocumentWorker instance_c = new ExpertDocumentWorker();

            System.out.println("\nExpertDocumentWorker");
            instance_c.openDocument(s);
            instance_c.editDocument(s);
            instance_c.saveDocument(s);

        }

        else if (!str.equals(key1) && !str.equals(key2)){
            System.out.println("Wrong key, sterting base version\n");
            DocumentWorker instance_a = new DocumentWorker();
            System.out.println("\nDocumentWorker");


            instance_a.openDocument(s);
            instance_a.editDocument(s);
            instance_a.saveDocument(s);

        }

    }



}
