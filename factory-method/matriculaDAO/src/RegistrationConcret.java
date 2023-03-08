// Essa classe estende da Registration e sobrescreve o metodo createEnrollStudent(
// Será responsavel por inserir o estudante no banco e depois retornar a instancia da classe EnrollStudent, criando a matricula do studante.

public class RegistrationConcret extends Registration{

    @Override
    public Matricula createEnrollStudent(Integer codStudent, Integer codCourse) {
        insertEnrollStudent(codStudent, codCourse);
        return new Matricula(codStudent, codCourse);
    }    
}