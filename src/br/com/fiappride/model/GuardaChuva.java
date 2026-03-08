package br.com.fiappride.model;

public class GuardaChuva {
    public String cor;
    public boolean aberto;
    public String material;
    public int durabilidade;

    public GuardaChuva(String cor, String material, int durabilidade) {
        this.cor = cor;
        this.material = material; 
        this.aberto = false;
        // Definimos a durabilidade inicial aqui
        this.durabilidade = durabilidade;
    }

    // Método Abrir com lógica de durabilidade
    public void abrir() {
        if (!this.aberto) {
            if (this.durabilidade > 0) {
                this.aberto = true;
                this.durabilidade--; // Diminui a vida útil ao abrir
                System.out.println("O guarda-chuva de " + material + " está aberto.");
                System.out.println("Durabilidade restante: " + this.durabilidade);
        
    }
        }
    }

    public void fechar() {
        if (this.aberto) {
            this.aberto = false;
            System.out.println("O guarda-chuva está sendo fechado.");
        }
    }
}