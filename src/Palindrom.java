public class Palindrom {
    private final String word;
    Palindrom(String word){
        this.word = word;
    }

    Palindrom(int number){
        if (number < 0 ) number *= -1;
        this.word = String.valueOf(number);
    }

    public String isPalindrom(){
        int wordLength = word.length();

        for (int i = 0; i < wordLength / 2; i++){
            if (word.charAt(i) != word.charAt(wordLength - i - 1)){
                return "Bu kelime palindrom değil";
            }
        }
        return "Bu kelime palindrom";
    }

}
