public abstract class Registration {
    
    public abstract Matricula createEnrollStudent(Integer codStudent, Integer codCourse);

    protected void insertEnrollStudent(Integer codStudent, Integer codCourse) {
        // Realiza o insert no banco...
    }
}