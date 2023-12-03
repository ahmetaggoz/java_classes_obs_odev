package Classes.OBS_ODEV;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;

    Course(String name, String code, String prefix, Teacher teacher){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        this.note = 0;
    }

    void addTeacher(Teacher t1){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = t1;
        }
    }

    void printTeacher(){
        System.out.println("Adı :" + this.teacher.name);
        System.out.println("Adı :" + this.teacher.branch);
        System.out.println("Adı :" + this.teacher.mpno);
    }
}
