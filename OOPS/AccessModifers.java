public class AccessModifers {
    // Access Modifers and Specifiers define who can access the data or information
    // or code
    // private default protected public
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.username = "Aman";
        // password is not visible
        myAccount.SetPassword("babas");
    }

}

class BankAccount {
    public String username;
    private String password;

    public void SetPassword(String pwd) {
        password = pwd;
    }
}
