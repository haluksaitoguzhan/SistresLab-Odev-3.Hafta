import java.util.ArrayList;

public class Armstrong {

    private final ArrayList<Integer> digits = new ArrayList<>();
    final int number;

    Armstrong(int number){
        this.number = number;
        digitsAddToArray();
    }
    private ArrayList<Integer> digitsAddToArray(){
        int number = this.number;

        if (number == 0){
            digits.add(0);
            return digits;
        }

        if (number < 0){
            number = -1 * number;
        }

        while (number > 0) {
            int digit = number%10;
            digits.add(digit);
            number = number / 10;
        }
        return digits;
    }


    public boolean isArmstrong(){
        int sum = 0;
        for (Integer digit : digits) sum += pow(digit);

        System.out.println("sum: " + sum + " number: " + number + (sum == number ? " -> Armstrong sayı":"Armstrong sayı değil"));
        return sum == number;
    }

    private int pow(int digit){
        int result = 1;
        for (int i = 0; i < digits.size(); i++){
            result *= digit;
        }
        return result;
    }

    public static int pow2(int sayi, int us){
        if (us > 0){
            return sayi * pow2(sayi,us-1);
        }else{
            return 1;
        }
    }

}
