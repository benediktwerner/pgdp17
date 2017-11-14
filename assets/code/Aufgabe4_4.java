
public class Aufgabe4_4 extends MiniJava {
    public static void main(String[] args) {
        String input = readString();
        String output = "";
        int delta = 'a' - 'A';
        int i = 0;

        while (i < input.length()) {
            char c = input.charAt(i);
            if ('a' <= c && c <= 'z') {
                c -= delta;
            }
            else if ('A' <= c && c <= 'Z') {
                c += delta;
            }
            output += c;
            i++;
        }
        write(output);
    }
}
