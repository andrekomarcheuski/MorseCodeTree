public class Main {
    public static void main(String[] args) {
        MorseTree morseTree = new MorseTree();
        Tree arvore = morseTree.criarMorseTree();
        String codigoMorse = ".- -. -.. .-. . / -.- --- -- .- .-. -.-. .... . ..- ... -.- .. / .-. --- ... .-";
        String resultado = Tree.decodifica(arvore, codigoMorse);
        System.out.println("\n| Código Morse: " + codigoMorse + "\n| Código Morse Decodificado: " + resultado);
        ResultTree.printResultTree(arvore);
        
    }
}
