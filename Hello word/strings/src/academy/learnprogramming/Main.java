package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Todos os tipos primitivos, resumindo:
        //Byte = numero inteiro (8bits)
        //Short = números inteiros (16bits)
        //int = numeros inteiros (usado bastante(32bits))
        //long = numeros inteiros (maior que int(64bits))
        //float = numeros reais de precisão simples.
        //double = numeros reais com maior precisão
        //char = Caractere
        //boolean = True or False

        //Agora ->Strings (não trata de números diretamente, temos que usar Int ou long para isso, então ele utiliza as variaveis da int e long para calcular) que é um data Type em Java que não é tipo primitivo. É uma classe.

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);

        myString = myString + ",and this is more.";
        System.out.println("myString is equal to to " + myString);

        myString = myString + "\u00A9 2022";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);// Aqui é um exemplo que a String sozinha não capta números, se imprimmir este resultado teremos 250.5549.95. Precisamos trabalhar com a variável que utiliza número para então podermos utilizar essas variáveis dentro da String.
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);// Mesmo quando utilizamos INT somente na segunda parte, o java é inteligente o suficiente para entender que se trata de números.
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("Last String equal to " + lastString);


    }
}
