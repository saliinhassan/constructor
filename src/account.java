public class account {
    String accountholder;
    double balance;
    account(String acc,double b){
        accountholder=acc;
        balance=b;

    }

    void  displayshow(){
        System.out.println("account: " + accountholder);
        System.out.println("balance: " + balance);
    }
    public static void  main(){
        account account1=new account("zaki",300.0 );
        account  account2=new account("saaraa",30.0);
        account1.displayshow();
        account2.displayshow();

    }
}
