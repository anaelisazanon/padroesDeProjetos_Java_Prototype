
package javaapplication2;

public class Pessoa2 implements Cloneable{
    
    private Double altura;
    private Double peso;
    private String nome;
    
    // Construtores
    public Pessoa2() {
    }
    
    public Pessoa2(Pessoa2 prototipo) {
            this.altura = prototipo.getAltura();
            this.peso = prototipo.getPeso();
            this.nome = prototipo.getNome();
    }

    // Getters e Setters
    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Pessoa2 clone() throws CloneNotSupportedException {
        return (Pessoa2) super.clone();
    }
    
    @Override
    public String toString() {
        return "Pessoa:\nNome: " + nome + ", peso: " + peso + ", altura: " + altura + "\n";
    }
}