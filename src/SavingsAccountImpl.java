public class SavingsAccountImpl
{
    public static void main(String[] args)
    {
        SavingsAccount savings=new SavingsAccount("Savings,","Abhishek",33,1234567890L,4000,"Active");

        float deposit= savings.depositAmount(4000,300);

        float withdraw= savings.withdrawAmount(4000,200);

        float tranfer= savings.transferAmount(4000,500);

        int accountBalance= savings.accountBalance;


    }

}
