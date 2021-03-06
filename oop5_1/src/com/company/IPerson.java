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

public interface IPerson {
    void printName(int a);
    void printAddress(int a);
    void printPhone(int a);

}
