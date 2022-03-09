public class Hello {

    public static void main (String[] args){
        System.out.println("Hello World");

        int myFirstNumber = (10+5) + (2*10);
        int mySecondNumber = (6+6);
        int myThirdNumber =(2*3);
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = myTotal - 1000;
        System.out.println("The result is: " + myFirstNumber);

        System.out.println("The result is: " + mySecondNumber);

        System.out.println("The result is: " + myThirdNumber);

        System.out.println("The total sum is: " + myTotal);

        System.out.println("The total minus 1000 equals: " + myLastOne);
    }
}
