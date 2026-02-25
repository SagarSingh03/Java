public class ReverseString {
    public static void main(String[] args) {
        String str = "Sagar is a loyal men";
        String a[] = str.split(" ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}