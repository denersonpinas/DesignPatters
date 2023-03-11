package serializacaosingleton;

import java.io.Serializable;

public class SerializacaoSingleton implements Serializable{
	
	private String situacao = "teste";
	private static final long serialVersionUID = -7604766932017737115L;		
	private static SerializacaoSingleton serializacaosingleton; // Instancia unica da classe

	private SerializacaoSingleton(){} // Proibe o new Logger

	// Forma correta: Aqui garantimos que sempre que o metodo seja chamado seja retornado a mesma instancia, ou seja, o método é chamado é armazenada na variável serializacaosingleton e é reutilizada nas chamadas subsequentes.	
	public static SerializacaoSingleton getSerializacaoSingleton() {
		if (serializacaosingleton == null) {
			serializacaosingleton = new SerializacaoSingleton() ;
		}
		return serializacaosingleton;
	}
	
	// Forma errada: Aqui a variável serializacaosingleton ainda é inicializada, apenas criamos uma nova instancia e a retornamos. Fazendo com que sempre que o
	// metodo é chamado, seja criada uma nova instancia e retornada.
	// public static  SerializacaoSingleton getSerializacaoSingleton() {
	// 	if (serializacaosingleton == null) {			
	// 		return new SerializacaoSingleton();
	// 	}
	// 	return serializacaosingleton;    
	// }	
	
    public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}   
    
    
    protected Object readResolve() {
        return getSerializacaoSingleton();
    }
}