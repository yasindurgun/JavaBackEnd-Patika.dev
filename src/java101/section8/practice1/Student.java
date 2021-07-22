package java101.section8.practice1;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if(note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
        }
        if(note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }
        if(note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }
    }

    void isPass(){
        double exm1 = this.c1.note*0.8 + this.c1.verbalNote*0.2;
        double exm2 = this.c2.note*0.8 + this.c2.verbalNote*0.2;
        double exm3 = this.c3.note*0.8 + this.c3.verbalNote*0.2;
        this.average = (exm1 + exm2 + exm3) / 3.0;
        if(this.average > 55){
            System.out.println("Sınıfı başarılı şekilde geçtiniz.");
            this.isPass = true;
        }else {
            this.isPass = false;
            System.out.println("Sınıfta kaldınız.");
        }
    }

    void printNote(){
        System.out.println(this.c1.name+ " Notu:" +c1.note);
        System.out.println(this.c2.name+ " Notu:" +c2.note);
        System.out.println(this.c3.name+ " Notu:" +c3.note);
        System.out.println("Ortalamanız: " + this.average);
    }
}
