import java.util.Scanner;
public class SentenceWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        String[] words = line.split(" ");
        for(int x=0; x<words.length; x++){
            System.out.println(words[x]);
        }
    }
}
