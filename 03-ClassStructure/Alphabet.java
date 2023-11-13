public class Alphabet {
    static boolean isAlphabet(String t) {
        for(int i = 1; i < t.length(); i ++) {
            if(t.charAt(i) < t.charAt(i-1)) {
                return false;
            }
        }
        return true;
    }
}
