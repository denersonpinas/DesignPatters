public class Matricula {
    private Integer codStudent;
    private Integer codCourse;

    public Matricula(Integer codStudent, Integer codCourse) {
        this.codCourse = codCourse;
        this.codStudent = codStudent;
    }

    public Integer getCodCourse() {
        return codCourse;
    }
    public Integer getCodStudent() {
        return codStudent;
    }
}
