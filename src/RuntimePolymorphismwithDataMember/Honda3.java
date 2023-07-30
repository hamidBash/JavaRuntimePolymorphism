package RuntimePolymorphismwithDataMember;

public class Honda3 extends Bike{
    int speedLimit = 150;

    public static void main(String[] args) {
        Bike b = new Honda3();
        System.out.println(b.speedLimit);
    }
}
