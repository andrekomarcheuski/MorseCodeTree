import java.util.LinkedList;
import java.util.Queue;

public class ResultTree {
    public static void printResultTree(Tree noRaiz) {
        Queue<Tree> fila = new LinkedList<>();
        fila.add(noRaiz);

        int nivelAtual = 0;
        while (!fila.isEmpty()) {
            int tamanhoNivel = fila.size();
            int espacoEntreNos = (int) Math.pow(2, 5 - nivelAtual + 2) - 1; 
            int espacoInicio = (int) Math.pow(2, 5 - nivelAtual + 1) - 1; 
            espacoEntreNos = Math.max(espacoEntreNos, 0);
            espacoInicio = Math.max(espacoInicio, 0);
            StringBuilder nosNivel = new StringBuilder();
            nosNivel.append(" ".repeat(espacoInicio));
            for (int i = 0; i < tamanhoNivel; i++) {
                Tree noAtual = fila.poll();
                nosNivel.append(noAtual.caracter.isEmpty() ? "_" : noAtual.caracter);
                if (i < tamanhoNivel - 1) {
                    nosNivel.append(" ".repeat(espacoEntreNos));
                }
                if (noAtual.esquerda != null) {
                    fila.add(noAtual.esquerda);
                }
                if (noAtual.direita != null) {
                    fila.add(noAtual.direita);
                }
            }
            System.out.println(nosNivel.toString());
            nivelAtual++;
        }
    }    
}
