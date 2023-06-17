package modernjavainaction.chap02;

import java.util.List;

public class Q2a {

    public static void prettyPrintApple(List<FilteringApples.Apple> inventory, AppleFancyFormatter appleFormatter) {
        for (FilteringApples.Apple apple : inventory) {
            String output = appleFormatter.accept(apple);
            System.out.println(output);
        }
    }

    public interface AppleFormatter {
        String accept(FilteringApples.Apple a);
    }

    public class AppleFancyFormatter implements AppleFormatter {
        public String accept(FilteringApples.Apple a) {
            String cha = a.getWeight() > 150 ? "heavy" : "light";
            return "A " + cha + " " + a.getColor() + " apple";
        }
    }

    public class AppleSimpleFormatter implements AppleFormatter {

        @Override
        public String accept(FilteringApples.Apple a) {
            String cha = a.getWeight() > 150 ? "heavy" : "light";
            return "A " + cha + " apple";
        }
    }



    public static void main(String[] args) {

    }
}
