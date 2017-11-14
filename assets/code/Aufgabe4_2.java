
public class Aufgabe4_2 extends MiniJava {
    public static void main(String[] args) {
        String input = readString();
        int shift = read();

        shift %= 26; // shift = shift % 26;
        if (shift < 0)
            shift += 26;

        String output = "";
        int i = 0;

        while (i < input.length()) {
            char c = input.charAt(i);
            if ('a' <= c && c <= 'z') {
                c += shift;
                if (c > 'z')
                    c -= 26;
            }
            else if ('A' <= c && c <= 'Z') {
                c += shift;
                if (c > 'Z')
                    c -= 26;
            }
            output += c;
            i++;
        }

        write(output);
    }
}
