// Aqui vai ser a classe abstrata pra criar os objetos da classe RegistrationConcret que nem no exemplo da aula.
public abstract class Registration {
    
    public abstract EnrollStudent createEnrollStudent(int codStudent, int codCourse);

    protected void insertEnrollStudent(int codStudent, int codCourse) {
        // Realiza o insert no banco...
    }

}