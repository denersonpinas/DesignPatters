package app;

import elementos.Livraria;
import elementos.LivroDigital;

public interface LivrariaFactoryAbstract {
    Livraria criarLivraria();
    LivroDigital criarLivroDigital();
}
