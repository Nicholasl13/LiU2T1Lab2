public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot person = new ChatBot("AI123", 10);
        person.greeting("Nicholas");
        person.weather();
        int sum = person.addNumbers(1,2,3);
        System.out.println("Sum of numbers 1,2,3 is: " + sum);
        double sum2 = person.convertFeetToMeters(sum);
        System.out.println("The sum of 1,2,3 feet converted to meters is " + sum2);
        person.favoriteNumber(15);
        person.favoriteFood("Fries");
        int product = person.multiplyNumbers(2,3);
        System.out.println("Product of 2 and 3 is " + product);
        String goodbyeMessage = person.goodbye();
        System.out.println(goodbyeMessage);
    }
}
