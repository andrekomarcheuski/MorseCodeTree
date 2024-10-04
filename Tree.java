public class Tree {
    public String caracter;
    public Tree esquerda;
    public Tree direita;

    public Tree(String caracter, Tree esquerda, Tree direita) {
        this.caracter = caracter;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public static String morseParaCaracter(Tree morseTree, String sinal) {
        Tree noRaiz = morseTree;
        for (int i = 0; i < sinal.length(); i++) {
            if (sinal.charAt(i) == '.') {
                noRaiz = noRaiz.esquerda;
            } else {
                noRaiz = noRaiz.direita;
            }
        }
        return noRaiz.caracter;
    }

    public static String decodifica(Tree morseTree, String codigoMorse) {
        StringBuilder codigoDecodificado = new StringBuilder();
        String[] sequencia = codigoMorse.split(" ");
        for (String sinal : sequencia) {
            if (sinal.equals("/")) {
                codigoDecodificado.append(" ");
            } else {
                codigoDecodificado.append(morseParaCaracter(morseTree, sinal));
            }
        }
        return codigoDecodificado.toString();
    }
}
