package model;

public class IteratorAlunoVetor implements MeuIterator {

    private Aluno colect[];
    private int count;
    private int qtd;

    public IteratorAlunoVetor() {
        this.colect = new Aluno[10];
        this.count = 0;
        this.qtd = 0;
    }

    public void add(Aluno novoAluno) {
        colect[qtd] = novoAluno;
        qtd++;
    }

    @Override
    public boolean hasNext() {
        if(count >= colect.length || colect[count] == null){
            count = 0;
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Aluno next() {
        Aluno aluno = colect[count];
        ++count;
        return aluno;
    }
    
}
