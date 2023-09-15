public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int threes = 0;
        int fives = 0;
        while(i < 1000){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3 && divisibleBy5) {

                threes++;
                fives++;

            } else if (divisibleBy3) {

                threes++;

            } else if (divisibleBy5) {

                fives++;

            }
            i++;
        }
        System.out.println(threes);
        System.out.println(fives);
    }
}
