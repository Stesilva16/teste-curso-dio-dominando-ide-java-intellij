package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma {
    public static void main(String[] args, Object nome, Object numPaginas, Object numPagina) {
        Gato gato = new Gato() ;

        System.out.println(gato);
        livro Livro;
        livro Livro1 = new livro ();
        System.out.println(Livro1);
       /* int a = 5;
        int b = 3;

        System.out.println("Hello Wold!" + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(numPaginas, livro.numPaginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numPaginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;




    }
}



