
public class Aufgabe4_3 extends MiniJava {
    public static void main(String[] args) {
        char in;
        while (true) {
            String eingabe = readString("Bitte Vokal eingeben");
            if (eingabe.length() != 1) {
                write("Geben Sie EINEN Vokal ein!");
            }
            else {
                in = eingabe.charAt(0);
                if (in != 'A' && in != 'E' && in != 'I'
                        && in != 'O' && in != 'U' && in != 'a'
                        && in != 'e' && in != 'i' && in != 'o' && in != 'u') {
                    write("Eingabe ist kein Vokal!");
                }
                else {
                    if (in > 'Z') in += 'A' - 'a';
                    break;
                }
            }
        }

        String text = "Hat der alte Hexenmeister\n" +
                "sich doch einmal wegbegeben!\n" +
                "Und nun sollen seine Geister\n" +
                "auch nach meinem Willen leben.\n" +
                "Seine Wort und Werke\n" +
                "merkt ich und den Brauch,\n" +
                "und mit Geistesstärke\n" +
                "tu ich Wunder auch.\n" +
                "Walle! walle\n" +
                "Manche Strecke,\n" +
                "daß, zum Zwecke,\n" +
                "Wasser fließe\n" +
                "und mit reichem, vollem Schwalle\n" +
                "zu dem Bade sich ergieße.";

        String out = "";
        int i = 0;
        while (i < text.length()) {
            char c = text.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                c = in;
            else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                c = (char) (in + 'a' - 'A');
            out += c;
            i++;
        }
        write(out);
    }
}
