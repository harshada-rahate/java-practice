public class Bankclass
{
public void createAccount()
{
System.out.println("create an account");
}
public void deposit()
{
System.out.println("add money into account");
}
public void withdraw()
{
System.out.println("you take money out of an account");
}
public void checkBalance()
{
System.out.println("check balance into the account");
}
public static void main(String [] args)
{
Bankclass b=new Bankclass();
b.createAccount();
b.deposit();
b.withdraw();
b.checkBalance();
}
}