public class Asal {
    final int number;

    Asal(int number){this.number = number;}

    public String isAsal(){
        int number = this.number;

        if(number == 0 || number < 0) return "Girdiğiniz sayı 0 dan büyük olmalıdır!";

        if (number < 0) number *= -1;

        if (number == 1) return "1 sayısı asaldır.";

        boolean control = false;
        for (int i = 2; i < number / 2; i++){
            if (number%i == 0){
                control = true;
                break;
            }
        }

        if (control == true) return number + " sayısı asal değildir.";

        return number + " sayısı asaldır.";
    }
}
