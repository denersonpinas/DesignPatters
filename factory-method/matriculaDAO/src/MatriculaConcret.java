public class MatriculaConcret implements MatriculaDAO {
    private Integer codStudent;
    private Integer codCourse;
    
    public Integer getCodStudent() {
        return codStudent;
    }
    public void setCodStudent(Integer codStudent) {
        this.codStudent = codStudent;
    }
    public Integer getCodCourse() {
        return codCourse;
    }
    public void setCodCourse(Integer codCourse) {
        this.codCourse = codCourse;
    }
}