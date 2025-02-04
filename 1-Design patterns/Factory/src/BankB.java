public class BankB implements IBank{
    @Override
    public void withdraw() {
        System.out.println("Now U r withdrawing from Bank B");
    }

    @Override
    public void deposit() {
        System.out.println("Now U r depositing from Bank B");
    }
}
