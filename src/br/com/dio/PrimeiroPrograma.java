package br.com.dio;


import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("problema dos 3 corpos",300);
        System.out.println(livro1);
//        int a = 3;
//        int b = 4;
//        System.out.println("Hello Word "+ (a+b));


    }
}
class Livro {
    private String nome;
    private Integer pgs;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPgs() {
        return pgs;
    }

    public void setPgs(Integer pgs) {
        this.pgs = pgs;
    }

    public Livro(String nome, Integer pgs) {
        this.nome = nome;
        this.pgs = pgs;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", pgs=" + pgs +
                '}';
    }
}