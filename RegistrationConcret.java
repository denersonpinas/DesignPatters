// Essa classe estende da Registration e sobrescreve o metodo createEnrollStudent(
// Será responsavel por inserir o estudante no banco e depois retornar a instancia da classe EnrollStudent, criando a matricula do studante.

public class RegistrationConcret extends Registration{

    @Override
    public EnrollStudent createEnrollStudent(int codStudent, int codCourse) {
        insertEnrollStudent(codStudent, codCourse);
        return new EnrollStudent(codStudent, codCourse);
    }    
}