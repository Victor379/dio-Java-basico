package edu.Victor.PrimeiroTopico;
public class MinhaClasse {
    public static void main(String[] args) {
        // Maneira de printar uma frase
        //System.out.print("Olá mundo");

        // para declarar variaveis sempre começando com letra minuscula
        // Unicos simbolos permitidos _ e $
        // Exemplo: tipo nomeBemDefinido = atribuição;

        // String meuNome = "Victor";

        // int numero_1 = 1;

        // Declaro Variaveis e Chamo o metodo
        String primeiroNome = "Victor";
        String segundoNome = "Fiuza";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    // Para metodos a nomenclatura é sempre no infinitivo
    // Exemplo: tipoRetorno nomeInfinitivo parametro(s)
    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return primeiroNome.concat(" ").concat(segundoNome);

    }
}
