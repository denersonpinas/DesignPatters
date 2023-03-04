package ifba.app;

import java.util.Date;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Rodape;

public class CriadorDocumento {
	private Cabecalho cabecalho;
	private Corpo corpo;
	private Rodape rodape;


	public CriadorDocumento(FactoryDocument factoryDocument) {
		this.cabecalho = factoryDocument.criaCabecalho();
		this.corpo = factoryDocument.criaCorpo();
		this.rodape = factoryDocument.criaRodape();
	}

	public String geraDocumentacao() {
		cabecalho.setTitulo("Padroes de projeto");
		cabecalho.setEmpresa("Insituto Federal da Bahia");
		corpo.setTexto("Aula de padroes de projeto.");

		rodape.setData(new Date());
		
		return cabecalho.getOutput() + corpo.getOutput() + rodape.getOutput();
	}
}
