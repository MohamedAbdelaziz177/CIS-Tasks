public class BankA implements IBank{
    @Override
    public void withdraw() {
        System.out.println("Now U r withdrawing from Bank A");
    }

    @Override
    public void deposit() {
        System.out.println("Now U r depositing from Bank A");
    }
}
