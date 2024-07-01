package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    private int cargaHoraria;

    // criando construtor vazio
    public Curso() {
    }

    // inserindo os métodos get e set

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
