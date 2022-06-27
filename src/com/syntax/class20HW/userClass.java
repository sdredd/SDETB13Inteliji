package com.syntax.class20HW;

public class userClass {
    /*
    Write program: userClass  that has a constructor that
    initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable
    and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    String mobilePhone;

    public userClass(String name, String mobilePhone) {
        this.name = name;
        this.mobilePhone= mobilePhone;
    }

}

    class userInfo extends userClass {
    String userAdress;

    userInfo (String name, String mabilePhone, String userAdress) {
        super(name, mabilePhone);
        this.userAdress=userAdress;
    }

    public void userDetails () {
        System.out.println(name+" "+mobilePhone+" "+userAdress);
    }

        public static void main(String[] args) {
            userInfo out=new userInfo("Natalia", "850-850-50-50", "Niceville");
            out.userDetails();
        }

    }



