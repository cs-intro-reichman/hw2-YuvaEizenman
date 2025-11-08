public class Cheers {
        public static void main(String[] args) {
                String word = args[0].toUpperCase(); 
                int times = Integer.parseInt(args[1]);
                String anLetters = "AEFHILMNORSX";
                for (int i = 0; i < word.length(); i++) {
                        char letter = word.charAt(i);
                        if (anLetters.indexOf(letter) >= 0) {
                                System.out.println("Give me an " + letter + ": " + letter + "!");
                        } else {
                                System.out.println("Give me a " + letter + ": " + letter + "!");
                        }
                 } 
                 System.out.println("What does that spell?");              
                for (int i = 0; i < times; i++) {
                System.out.println(word + "!!!");

        }
}
}
