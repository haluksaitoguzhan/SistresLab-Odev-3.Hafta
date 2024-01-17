import java.util.ArrayList;

public class EbobEkok {
    private final ArrayList<Integer> divisions = new ArrayList<>();
    private final int number;

    EbobEkok(int number){this.number = number;}

    public ArrayList<Integer> findDivisons(){
        int number = this.number;

        if(number == 0) return divisions;
        if (number < 0) number *= -1;
        if (number == 1) {
            divisions.add(number);
            return divisions;
        }
        int ebob = 1;
        int ekok = 1;

        boolean control = true;
        for (int i = 2; i < number / 2; i++){
            if (number%i == 0){
                if (control){
                    ekok = i;
                    control = false;
                }
                ebob = i;
                divisions.add(i);
            }
        }

        System.out.println("Ekok: " + ekok + " - Ebob: " + ebob);
        divisions.add(number);

        return divisions;
    }
}
