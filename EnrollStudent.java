// Aqui é a matricula em si, podemos consultar a matricula ou o código do aluno via getters.

public class EnrollStudent {
    private int codStudent;
    private int codCourse;

    public EnrollStudent(int codStudent, int codCourse) {
        this.codCourse = codCourse;
        this.codStudent = codStudent;
    }

    public int getCodStudent() {
        return codStudent;
    }

    public int getCodCourse() {
        return codCourse;
    }
}
