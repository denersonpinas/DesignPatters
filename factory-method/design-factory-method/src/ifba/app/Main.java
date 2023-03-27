package ifba.app;

import java.util.Date;

import ifba.app.fabricas.FactoryDocuments;
import ifba.app.fabricas.HTMLFactory;
import ifba.elementos.ICabecalho;
import ifba.elementos.ICorpo;
import ifba.elementos.IDocuments;
import ifba.elementos.IRodape;
import ifba.elementos.concretos.CabecalhoConcreto;
import ifba.elementos.concretos.CorpoConcreto;
import ifba.elementos.concretos.RodapeConcreto;

public class Main {
	public static void main(String[] args) {
        ICabecalho iCabecalho = new CabecalhoConcreto();
		ICorpo iCorpo = new CorpoConcreto();
		IRodape iRodape = new RodapeConcreto();

		iCabecalho.setTitulo("A Saga do IFBA");
		iCabecalho.setEmpresa("IFBA");
		iCorpo.setTexto("Testando!!!");
		iRodape.setData(new Date());

		FactoryDocuments factoryDocuments = new HTMLFactory();
		IDocuments html = factoryDocuments.geraDocumentacao(iCabecalho, iCorpo, iRodape);
		System.out.println(html.getDocumento());
	}
}