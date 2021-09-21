package modulo1.aula9;

public class aula9_2_metodos_nome {
    public static void main(String[] args) {
        imprimir_nome("Lorena","Nascimento");
        String nc = retorna_nome_completo("Lorena","Nascimento");
        double taxa = converte_taxa_juros(2);
        System.out.println(taxa);
    }

    //metodo imprimir_nome - que recebe dois parametros string e tem o retorno void
    static void imprimir_nome(String nome, String sobrenome){
        System.out.printf("%s %s \n",nome,sobrenome);
    }

    static String retorna_nome_completo(String nome, String sobrenome){
        String nome_completo = nome +" "+sobrenome;
        return nome_completo;
    }

    static double converte_taxa_juros(int juros_int){
        double juros_double = juros_int;
        double percentual = juros_double/100;
        return percentual;
    }
}
