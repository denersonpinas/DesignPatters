public class Matricula implements Registration {
    MatriculaDAO matriculaDAO;

    public Matricula(MatriculaDAO matriculaDAO) {
        this.matriculaDAO = matriculaDAO;
    }

    public String geraMatricula() {
        return "Matricula criada com sucesso: \n" +
        "Código do Curso: " + matriculaDAO.getCodCourse() + "\n" +
        "Código do Aluno: " + matriculaDAO.getCodStudent();
    }    
}