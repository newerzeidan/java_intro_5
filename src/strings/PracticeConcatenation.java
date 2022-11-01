package strings;

public class PracticeConcatenation {
    public static void main(String[] args) {
        String wordPart1 = "le";
        String wordPart2 = "ar";
        String wordPart3 = "ning";
        String fullWord = wordPart1 + wordPart2 + wordPart3;

        System.out.println(fullWord);


        String sentencePart1 = "I can";
        String sentencePart2 = "learn Java";

        System.out.println(sentencePart1.concat(" ").concat(sentencePart2));


    }
}
