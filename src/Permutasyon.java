public class Permutasyon {

    public static int recursivePermutasyon(int number){
        if (number < 1){
            return 1;
        }else {
            return number * recursivePermutasyon(number - 1);
        }
    }
    public static int loopPermutasyon(int number){
        int permutasyon = 1;
        for (int i = number; i > 1; i--){
            permutasyon *= i;
        }
        return permutasyon;
    }


}
