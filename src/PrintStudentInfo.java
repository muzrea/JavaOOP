import model.Student;

/**
 * Created by 苏晓风 on 2019/2/26.
 */
public class PrintStudentInfo {
    public static void main(String[] args){
        Student student = new Student("John","00002","man",20);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
        System.out.println(student.studentNumber);
    }
}
