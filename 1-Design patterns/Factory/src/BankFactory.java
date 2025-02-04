public class BankFactory implements IBankFactory{

    @Override
    public IBank createBank(String CardNumber) {

        String First6Char = CardNumber.substring(0, 6);

        if(First6Char.equals("111111"))
        {
            return new BankA();
        }
        else if (First6Char.equals("111112"))
        {
            return new BankB();
        }

        return null;
    }
}
