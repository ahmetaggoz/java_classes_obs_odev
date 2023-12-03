package Classes.OBS_ODEV;

public class Student {
    Course tarih;
    Course fizik;
    Course biyoloji;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;




    Student(String name, String stuNo, String classes, Course tarih, Course fizik, Course biyoloji){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.tarih = tarih;
        this.fizik = fizik;
        this.biyoloji = biyoloji;
        calcAvarage();
        this.isPass = false;
    }



    void addBulkExamNote(int tarih, int fizik, int biyoloji, int tarihSozlu, int fizikSozlu, int biyolojiSozlu) {
        if((tarih <= 100 && tarih >= 0) && (tarihSozlu <= 100 && tarihSozlu >= 0)){
            this.tarih.note = tarih;
            this.tarih.sozlu = tarihSozlu;
        }

        if ((fizik <= 100 && fizik >= 0) && (fizikSozlu <= 100 && fizikSozlu >= 0)){
            this.fizik.note = fizik;
            this.fizik.sozlu = fizikSozlu;
        }

        if ((biyoloji <= 100 && biyoloji >= 0) && (biyolojiSozlu <= 100 && biyolojiSozlu >= 0)){
            this.biyoloji.note = biyoloji;
            this.biyoloji.sozlu = biyolojiSozlu;
        }
    }

    void calcAvarage() {

        this.avarage = ((this.tarih.note * 0.80 + this.tarih.sozlu * 0.20) +
                (this.fizik.note * 0.80 + this.fizik.sozlu * 0.20) +
                (this.biyoloji.note * 0.80 + this.biyoloji.sozlu * 0.20)) / 3.0;
    }

    void isPass(){
        if (this.avarage > 55) {
            System.out.println("Geçti");
            this.isPass = true;
        }else {
            System.out.println("Kaldı.");
            this.isPass = false;
        }
    }

    void printNote(){
        System.out.println("=========================");
        System.out.println("İsim :" + this.name);
        System.out.println("Fizik :" + this.fizik.note);
        System.out.println("Tarih :" + this.tarih.note);
        System.out.println("Biyoloji :" + this.biyoloji.note);
        System.out.println("Fizik Sözlü :" + this.fizik.sozlu);
        System.out.println("Tarih Sözlü :" + this.tarih.sozlu);
        System.out.println("Biyoloji :" + this.biyoloji.sozlu);
        isPass();
    }
}
