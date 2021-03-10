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

public class User implements IUser{

    private String name;
    private String phone;
    private String address;
    private String userName;
    private String userPass;
    private String ipConn;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getIpConn() {
        return ipConn;
    }

    public void setIpConn(String ipConn) {

        this.ipConn = ipConn;
    }




    @Override
    public void directConnect() {

        System.out.println("Connected as " + ipConn);

    }

    @Override
    public void loginConnect() {

        System.out.println("Connected as " + userName + " pass: " + userPass);

    }







}//===================================================================
