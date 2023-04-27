import model.Aluno;
import model.IteratorAlunoVetor;

public class Cliente {
    public static void main(String[] args) throws Exception {
        IteratorAlunoVetor turmaA = new IteratorAlunoVetor();

        turmaA.add(new Aluno("Denner", "Pinas", 23));
        turmaA.add(new Aluno("Santos", "Pinas", 23));
        turmaA.add(new Aluno("Amelia", "Pinas", 23));
        turmaA.add(new Aluno("Disney", "Pinas", 23));
        turmaA.add(new Aluno("Neymar", "Pinas", 23));
        turmaA.add(new Aluno("Messi", "Pinas", 23));

        System.out.println("\n Todos os Alunos: ");
        while (turmaA.hasNext()) {
            Aluno aluno = turmaA.next();
            System.out.println(aluno);
        }
    }
}
