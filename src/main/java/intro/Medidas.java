// 1 - Pacote
package intro;

// 2 - Referencia as bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas
    // 3.2 - Metodos e Funções

    public static void main(String[] args) {
calcularAreaModoCurto();
calcularAreaModoExtenso();

    }

    public static void calcularAreaModoCurto(){
        System.out.println("Calculo de areas modo curto");

        // Calculo de area - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para largura de " + largura + "m e o comprimento de " + comprimento + "m a area é de "
                + largura * comprimento + "m2");
    }
    public static void calcularAreaModoExtenso(){
        System.out.println("Calculo de areas modo extenso");
        // Calculo de area - Exemplo: o tamanho do tapete do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5;
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento + "m a area é de " + resultado + "m2");



    }
}
