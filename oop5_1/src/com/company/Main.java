/*        Создайте интерфейсы
        IPerson с методом для получения имени и контактных данных(ФИО, адрес и телефон) и
        IUser с методами подключения(по указанному IP-адресу) и
         аутентификации(с указанным именем пользователя и паролем).

       В классе User добавьте поля
        для хранения имени, контактных данных, адреса подключения, имени пользователя и пароля,
        типа пользователя. Реализуйте методы интерфейса для работы с указанными полями. Создайте
        класс Users, который будет содержать в себе массив пользователей. Продемонстрируйте работу
        с классами.
*/


package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


       /* User u11 = new User();
        u11.setIpConn("192.168.1.35");

        System.out.println(u11.getIpConn());

        u11.directConnect();
        u11.loginConnect();

        */

        User u01 = new User();
        User u02 = new User();
        User u03 = new User();

        u01.setName("Andrew");
        u02.setName("Boris");
        u03.setName("Cane");


        u01.setPhone("1111111");
        u02.setPhone("2222222");
        u03.setPhone("3333333");

        u01.setAddress("Street aaaaaaaa");
        u02.setAddress("Street bbbbbbbb");
        u03.setAddress("Street cccccccc");

        u01.setUserName("A0001");
        u02.setUserName("B0002");
        u03.setUserName("C0003");

        u01.setUserPass("******");
        u02.setUserPass("######");
        u03.setUserPass("@@@@@@");

        u01.setIpConn("10.0.0.1");
        u02.setIpConn("10.0.0.2");
        u03.setIpConn("10.0.0.3");

        u01.setIpConn("111.111.111.111");
        u02.setIpConn("222.222.222.222");
        u03.setIpConn("333.333.333.333");




        Users workUsers = new Users();

        workUsers.doArr(u01, u02, u03);





        System.out.println("");
        workUsers.printName(0);
        workUsers.printAddress(0);
        workUsers.printPhone(0);
        u01.directConnect();
        u01.loginConnect();

        System.out.println("");
        workUsers.printName(1);
        workUsers.printAddress(1);
        workUsers.printPhone(1);
        u02.directConnect();
        u02.loginConnect();

        System.out.println("");
        workUsers.printName(2);
        workUsers.printAddress(2);
        workUsers.printPhone(2);
        u03.directConnect();
        u03.loginConnect();

    }
}
