public class RegistrationConcret implements RegistrationFactory {

    @Override
    public Registration createEnrollStudent(MatriculaDAO matriculaDAO) {
        return new Matricula(matriculaDAO);
    }

}