package ifba.app;

import java.util.Date;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Rodape;

public class CriadorDocumento implements ConcreteCreateDocument{

	@Override
	public String geraDocumentacao(Product product) {
		Cabecalho cabecalho = product.criaCabecalho();
		Corpo corpo = product.criaCorpo();
		Rodape rodape = product.criaRodape();

		cabecalho.setTitulo("Padroes de projeto");
		cabecalho.setEmpresa("Insituto Federal da Bahia");
		corpo.setTexto("Aula de padroes de projeto.");

		rodape.setData(new Date());
		
		return cabecalho.getOutput() + corpo.getOutput() + rodape.getOutput();
	}



	// private TipoDocumento tipoDocumento;
	
	// public CriadorDocumento() {
	// }
	
	// public String geraDocumentacao( Product product ) {
	// 	Cabecalho cabecalho = product.criaCabecalho();
	// 	Corpo corpo = product.criaCorpo();
	// 	Rodape rodape = product.criaRodape();
		
	// 	// if (tipoDocumento == TipoDocumento.HTML) {
	// 	// 	cabecalho = new CabecalhoHTML();
	// 	// } else {
	// 	// 	cabecalho = new CabecalhoMarkdown();
	// 	// }
		
	// 	cabecalho.setTitulo("Padroes de projeto");
	// 	cabecalho.setEmpresa("Insituto Federal da Bahia");
		
	// 	// if (tipoDocumento == TipoDocumento.HTML) {
	// 	// 	corpo = new CorpoHTML();
	// 	// } else {
	// 	// 	corpo = new CorpoMarkdown();
	// 	// }
		
	// 	corpo.setTexto("Aula de padroes de projeto.");
		
	// 	// if (tipoDocumento == TipoDocumento.HTML) {
	// 	// 	rodape = new RodapeHTML();
	// 	// } else {
	// 	// 	rodape = new RodapeMarkdown();
	// 	// }
		
	// 	rodape.setData(new Date());
		
	// 	return cabecalho.getOutput() + corpo.getOutput() + rodape.getOutput();
	// }
}
