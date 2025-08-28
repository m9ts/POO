package Conteúdo;
public class breakRotulado {
    public static void main(String[] args) {
        int i = 0;

        externo: for (; true;) { // laço externo infinito
            interno: for (; i < 10; i++) {
                System.out.println("i = " + i);

                if (i == 2) {
                    prt("continue"); // chamada ao método prt
                    continue; // continua o loop interno
                }

                if (i == 3) {
                    System.out.println("break"); // quebra o loop interno
                    i++;
                    break;
                }

                if (i == 7) {
                    System.out.println("continue externo"); // continua o loop externo
                    i++;
                    continue externo;
                }

                if (i == 8) {
                    System.out.println("break externo"); // quebra o loop externo
                    break externo;
                }

                // loop interno adicional
                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        System.out.println("continue interno");
                        continue interno;
                    }
                }
            }
        }

        // Não é possível usar break ou continue com rótulos fora de loops rotulados
    }

    static void prt(String s) {
        System.out.println(s);
    }
}
