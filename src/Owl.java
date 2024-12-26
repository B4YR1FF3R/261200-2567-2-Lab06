// Extend : Owl เป็น Sub-Class ของ Animal
// Animal ประกาศอะไรไว้ Owl ก็มีตามนั้น
public class Owl extends Animal{

    // เอา function sound มาเขียนซ้ำ
    @Override

    // นกฮูกร้อง
    void sound() {
        System.out.println("hoot hoot");
    }

}