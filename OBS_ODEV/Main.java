package Classes.OBS_ODEV;

public class Main {
    public static void main(String[] args) {
        Teacher tarih = new Teacher("İlber Ortaylı", "1200", "TRH");
        Teacher fizik = new Teacher("Can Koçak", "9022", "FZK");
        Teacher biyo = new Teacher("Sinan Canan", "8909", "BIO");

        Course c1 = new Course("Tarih", "101", "TRH", tarih);
        c1.addTeacher(tarih);


        Course c2 = new Course("Fizik", "102", "FZK", fizik);
        c2.addTeacher(fizik);



        Course c3 = new Course("Biyoloji", "103", "BIO", biyo);
        c3.addTeacher(biyo);



        Student kamil = new Student("Kamil", "1212", "4", c1, c2, c3);
        kamil.addBulkExamNote(24, 45, 23, 70, 56, 76);
        kamil.printNote();

    }
}
