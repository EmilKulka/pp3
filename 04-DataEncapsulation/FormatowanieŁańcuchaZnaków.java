public class FormatowanieŁańcuchaZnaków {
    private String text;
    

    public String getTekst() {
        return this.text;
    }

    public void setTekst(String text) {
        this.text = text;
    }

    public void displayNumberOfCharacters() {
        int numberOfCharacters = 0;
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != ' ') {
                numberOfCharacters ++;
            }
        }
        System.out.println("Number of letters in this text is: " + numberOfCharacters);
    }

    public void firistNineCharacters() {
        int sum = 0; // sum of spaces
        System.out.println("First nine characters are: ");

        for(int i = 0; i < 9; i++) {
            if(text.charAt(i) != ' ') {
                continue;
            }else{
                sum ++;
            }
        }

        for(int i = 0; i < 9 + sum; i++) {
            if(text.charAt(i) != ' ') {
                System.out.print(text.charAt(i) + " ");
            }
        }
        System.out.println();
    }

    public void endsWithSuffix(String suffix) {
        if(text.endsWith(suffix)) {
            System.out.println("True");;
        }else {
            System.out.println("False");
        }
    }

    public void isNotEmpty() {
        if(text.length() != 0) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }

    public void lastOccurence(char x) {
        for(int i = text.length() -1; i >= 0 ; i-- ){
            if(text.charAt(i) == x) {
                System.out.println("Index of the last occurence of the charater " + x + " is: " + i);
                break;
            }
        }
    }

    public void spaceReplaced() {
        System.out.println("Text without spaces: " + text.replace(' ', '-'));
    }

    public void textUpperCase() {
        System.out.println("Text to upper case: " + text.toUpperCase());
    }

    public static void main(String[] args) {
        FormatowanieŁańcuchaZnaków text1 = new FormatowanieŁańcuchaZnaków();

        text1.setTekst("Have  a nice day!");
        text1.getTekst();
        text1.lastOccurence('e');
        text1.displayNumberOfCharacters();
        text1.firistNineCharacters();
        text1.endsWithSuffix("day!");
        text1.isNotEmpty();
        text1.lastOccurence('e');
        text1.spaceReplaced();
        text1.textUpperCase();
    }
}
