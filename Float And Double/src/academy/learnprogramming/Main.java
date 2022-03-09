package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = "+ myMinFloatValue);
        System.out.println("Float maximum value = "+ myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double minimum value = "+ myMinDoubleValue);
        System.out.println("double maximum value = "+ myMaxDoubleValue);
        
        int myIntValue = 5 / 3;
                float myFloatValue= 5f / 3f;
                double myDoubleValue = 5.00 / 3.00;// também pode colocar 5.00 ou 3.00 no doble ou 5d por 3d
        System.out.println("My Int value = " + myIntValue);
        System.out.println("My Float Value = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double numberPoundValue= 200d;
        double numberKilogramValue = numberPoundValue * 0.45359237d;
        System.out.println("The awanser is : " + numberKilogramValue);

        double pi= 3.145927d;
        double anotherNumber = 3_000_000.4_457_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);



    }
}
