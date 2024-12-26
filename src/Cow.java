// Extend : Cow เป็น Sub-Class ของ Animal
// Animal ประกาศอะไรไว้ Cow ก็มีตามนั้น
public class Cow extends Animal {

    // เอา function sound มาเขียนซ้ำ
    @Override

    // วัวร้อง
    void sound(){
        System.out.println("Moo Moo");
    }

    // รีดนมวัว
    void milk(){
        System.out.println("... now loading ...");
    }

}
