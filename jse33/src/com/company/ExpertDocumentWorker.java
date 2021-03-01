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
class ExpertDocumentWorker extends ProDocumentWorker {



     //   System.out.println("Документ сохранен в новом формате\n");


    @Override
    public int saveDocument(String s) {
        System.out.println("Документ сохранен в новом формате");
        return 0;
    }
}