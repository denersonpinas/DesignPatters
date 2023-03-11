package serializacaosingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Teste {
    public static void main(String[] args) {
        SerializacaoSingleton instancia = SerializacaoSingleton.getSerializacaoSingleton();
        instancia.setSituacao("Teste 1");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("arquivo.txt"))) {
            oos.writeObject(instancia);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SerializacaoSingleton instanciaRecuperada = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("arquivo.txt"))) {
            instanciaRecuperada = (SerializacaoSingleton) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (instancia == instanciaRecuperada) {
            System.out.println("As instâncias são iguais");
            System.out.println("Valor de situacao: " + instancia.getSituacao());
        } else {
            System.out.println(instancia.getSituacao());
            System.out.println(instanciaRecuperada.getSituacao());
            System.out.println("As instâncias são diferentes");
        }

    }
}
