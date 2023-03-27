public class App {
    public static void main(String[] args) throws Exception {
        MatriculaDAO matricula = new MatriculaConcret();
        matricula.setCodCourse(15);
        matricula.setCodStudent(7);

        RegistrationFactory registrationFactory = new RegistrationConcret();
        Registration registration = registrationFactory.createEnrollStudent(matricula);
        System.out.println(registration.geraMatricula());
    }
}
