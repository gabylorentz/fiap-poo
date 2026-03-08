package br.com.fiappride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiappride.model.GuardaChuva;

public class SistemaPrincipal {

    public static void main(String[] args) {
    	System.out.println(" Teste de resistênica do Guarda Chuva");    
        GuardaChuva guarda1 = new GuardaChuva("Azul", "Fibra de Carbono", 50);
        
 
        System.out.println("Cor:"+ guarda1.cor +  "/Material:" + guarda1.material+  " a sua durabilidade é:" + guarda1.durabilidade);
       
        
        System.out.println("**Está chovendo**");
        guarda1.abrir(); 
        
    	System.out.println("**A chuva Parou**");
    	guarda1.fechar();}

    
}

   