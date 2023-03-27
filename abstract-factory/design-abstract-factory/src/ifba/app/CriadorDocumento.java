package ifba.app;

import java.util.Date;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Rodape;

public class CriadorDocumento {
	private FactoryAbstract factoryAbstract;

    public CriadorDocumento(FactoryAbstract factoryAbstract) {
        this.factoryAbstract = factoryAbstract;
    }

    public String geraDocumentacao() {
        Cabecalho cabecalho = factoryAbstract.criCabecalho();
        cabecalho.setTitulo("Padroes de projeto");
        cabecalho.setEmpresa("Insituto Federal da Bahia");

        Corpo corpo = factoryAbstract.criaCorpo();
        corpo.setTexto("Aula de padroes de projeto.");

        Rodape rodape = factoryAbstract.criaRodape();
        rodape.setData(new Date());

        return cabecalho.getOutput() + corpo.getOutput() + rodape.getOutput();
    }
}
