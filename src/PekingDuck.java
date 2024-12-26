// Extend : PekingDuck เป็น Sub-Class ของ Duck
// Duck ประกาศอะไรไว้ PekingDuck ก็มีตามนั้น
public class PekingDuck extends Duck{

    // เอา Constructure ของ Duck มาใช้ใน PekingDuck
    PekingDuck(String name){
        super(name);// ดึง function name ของ Duck มาใช้
    }

    // เอา function clean มาเขียนซ้ำ
    @Override

    // ทำความสะอาด
    void clean(Animal animal) {
        System.out.println( this + " clean, ready to eat");
    }

}
