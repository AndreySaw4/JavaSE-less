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

public class Users implements IPerson{

    User[] myArray = new User[3];

    public void doArr(User a, User b, User c ){

        myArray[0] = a;
        myArray[1] = b;
        myArray[2] = c;


    }






    @Override
    public void printAddress(int a) {
        System.out.println(myArray[a].getAddress());

    }

    @Override
    public void printName(int a) {

        System.out.println(myArray[a].getName());

    }

    @Override
    public void printPhone(int a) {

        System.out.println(myArray[a].getPhone());

    }






}
