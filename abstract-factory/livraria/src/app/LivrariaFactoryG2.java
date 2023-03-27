package app;

import elementos.Livraria;
import elementos.LivroDigital;
import elementos.livraria.Cultura;
import elementos.livrodigital.Kobo;

public class LivrariaFactoryG2 implements LivrariaFactoryAbstract{

    @Override
    public Livraria criarLivraria() {
        return new Cultura();
    }

    @Override
    public LivroDigital criarLivroDigital() {
        return new Kobo();
    }
    
}
