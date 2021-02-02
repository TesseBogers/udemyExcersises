package udemy.challenges.Java;


public class Main {
    public static void main(String[] args) {
        boolean doggie = BarkingDog.shouldWakeUp(false,6);
        //BarkingDog.shouldWakeUp(true,6);
        System.out.println(doggie);
    }
}