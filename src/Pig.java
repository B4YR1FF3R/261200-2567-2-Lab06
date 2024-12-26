// Extend : Pig เป็น Sub-Class ของ Animal
// Animal ประกาศอะไรไว้ Pig ก็มีตามนั้น
public class Pig extends Animal{

    // เอา function sound มาเขียนซ้ำ
    @Override

    // หมูร้อง
    void sound() {
        System.out.println("oink oink");
    }

}