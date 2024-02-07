public class Faktoriyel {

    public static int recursiveFaktoriyel(int number){
        if (number < 1){
            return 1;
        }else {
            return number * recursiveFaktoriyel(number - 1);
        }
    }
    public static int loopFaktoriyel(int number){
        int faktoriyel = 1;
        for (int i = number; i > 1; i--){
            faktoriyel *= i;
        }
        return faktoriyel;
    }


}
