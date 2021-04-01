package mainpackage;

public class Users {
    public Users() {
        usersCounter++;
    }

    private String username;
    private String password;
    private String name;
    private String surname;
    public static int usersCounter=0;

    public void SetUsername(String Username) {
        this.username= Username;
    }

    public String GetUsername() {
        return this.username;
    }



    public void SetPassword(String Password) {
        this.password= Password;
    }

    public String GetPassword() {
        return this.password;
    }



    public void SetName(String Name) {
        this.name= Name;
    }

    public String GetName() {
        return this.name;
    }



    public void SetSurname(String Surname) {
        this.surname= Surname;
    }

    public String GetSurname() {
        return this.surname;
    }


    public void login(){
        System.out.println("Logged in!!!");
    }

    public void logout(){
        System.out.println("Logged out!!!");
    }
}
