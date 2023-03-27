package app;

import elementos.Livraria;
import elementos.LivroDigital;
import elementos.livraria.Amazon;
import elementos.livrodigital.Kindle;

public class LivrariaFactoryG1 implements LivrariaFactoryAbstract{

    @Override
    public Livraria criarLivraria() {
       return new Amazon();
    }

    @Override
    public LivroDigital criarLivroDigital() {
        return new Kindle();
    }
    
}
