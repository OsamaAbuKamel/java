package codeWars;

public class DidSheSayHallo {
    public static void main(String[] args) {
        System.out.println(validateHello("hallo"));
    }

    public static boolean validateHello(String greetings) {
        String[] greetingss = { "hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc" };
        for (String greeting : greetingss) {
            if (greetings.toLowerCase().contains(greeting)) {
                return true;
            }
        }
        return false;
    }
}
