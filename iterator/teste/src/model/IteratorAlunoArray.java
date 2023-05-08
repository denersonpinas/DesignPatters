package model;
import java.util.ArrayList;

public class IteratorAlunoArray implements MeuIterator {

    private ArrayList<Aluno> colect;
    private int count;
    private int qtd;

    public IteratorAlunoArray() {
        colect = new <Aluno>ArrayList();
        count = 0;
        qtd = 0;
    }

    public void add(Aluno novoAluno) {
        colect.add(novoAluno);
        qtd++;
    }

    @Override
    public boolean hasNext() {
        if(count >= colect.size() || colect.get(count) == null) {
            count = 0;
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Aluno next() {
        Aluno aluno = colect.get(count);
        count++;
        return aluno;
    }
    
}
