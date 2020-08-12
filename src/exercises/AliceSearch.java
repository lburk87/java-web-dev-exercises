package exercises;
import java.util.Scanner;

public class AliceSearch {

    public static void main(String[] args) {
        String passage = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Search:");
        String word = input.next();
        String lowWord = word.toLowerCase();
        String lowPass = passage.toLowerCase();
        System.out.println(lowPass.contains(lowWord));
        int index = lowPass.indexOf(lowWord);
        System.out.println("index: " + index);
        System.out.println(new StringBuilder().append("length: ").append(lowWord.length()).toString());
        String part1 = passage.substring(0,(index-1));
        String part2 = passage.substring(index+lowWord.length(),passage.length());
        System.out.println(part1 + part2);
    }

}
