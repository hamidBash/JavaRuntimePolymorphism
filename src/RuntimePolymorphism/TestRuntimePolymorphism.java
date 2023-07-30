package RuntimePolymorphism;

public class TestRuntimePolymorphism {
    public static void main(String[] args) {
        Bank bank = new SBI();
        System.out.println("RuntimePolymorphism.SBI interestRate is : "+bank.getRateInterest());

        bank = new ICICI();
        System.out.println("RuntimePolymorphism.ICICI interestRate is : "+ bank.getRateInterest());

        bank = new AXIS();
        System.out.println("RuntimePolymorphism.AXIS interestRate is :"+bank.getRateInterest());
    }
}
