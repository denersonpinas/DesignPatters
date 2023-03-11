package serializacaosingleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class App {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		SerializacaoSingleton serializacaosingleton = SerializacaoSingleton.getSerializacaoSingleton();
		
		serializacaosingleton.setSituacao("teste 1");
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("teste.txt"));
		
		out.writeObject(serializacaosingleton);
		
		out.close();
		
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("teste.txt"));
		
		SerializacaoSingleton serializacaosingletonrecovery = (SerializacaoSingleton) in.readObject();
	
	    in.close();
	
	    
	    
	    System.out.println(serializacaosingleton.getSituacao());
	    
	    System.out.println(serializacaosingletonrecovery.getSituacao());	
	}

}
