public class LengthofLastword {
    public static void main(String[] args) {
        String s = "Hello World";
        String[] words = s.trim().split(" ");
        String lastword = words[words.length - 1];
        System.out.print(lastword.length());

    }
}
