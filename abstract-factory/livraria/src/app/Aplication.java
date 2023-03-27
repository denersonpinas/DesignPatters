package app;

import elementos.Livraria;
import elementos.LivroDigital;

public class Aplication {
    Livraria livraria;
    LivroDigital livroDigital;

    public Aplication(LivrariaFactoryAbstract livrariaFactoryAbstract) {
        this.livraria = livrariaFactoryAbstract.criarLivraria();
        this.livroDigital = livrariaFactoryAbstract.criarLivroDigital();
    }

    public void paint() {
        livraria.paint();
        livroDigital.paint();
    }
    
}
