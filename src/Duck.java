// Extend : Duck เป็น Sub-Class ของ Animal
// Animal ประกาศอะไรไว้ Duck ก็มีตามนั้น
// Implements : Extend ที่แยกได้มากกว่า
public class Duck extends Animal implements Flyable{

    // รับชื่อเป็ด
    String name;
    public Duck(String name){
        this.name = name;
    }

    // เอา function sound มาเขียนซ้ำ
    @Override

    // เป็ดร้อง
    void sound() {
        System.out.println("quack quack");
    }

    // เอา function fly มาเขียนซ้ำ
    @Override

    // เป็ดบิน
    public void fly() {
        System.out.println("prbbb prbbb ");
    }

    // เอา function glide มาเขียนซ้ำ
    @Override

    // เป็ดร่อน
    public void glide() {
        System.out.println("hi-yahhh!");
    }

    // สร้าง function toString เพื่อ
    // Terminal : Duck@1d81eb93 is cleaning Cow@4e50df2e <--- จะสังเกตว่ามันเอาตำแหน่งออกมาด้วย
    // เราอยากให้มันออกมาแค่ชื่อมันเฉยๆ งั้นก็ต้องใส่ function นี้เข้าไป
    public String toString(){
        return "DUCK: " + this.name;
    }

    // ทำความสะอาดสัตว์
    void clean(Animal animal){

        // เรียกใช้ฟังก์ชั่น toString เพื่อ
        // Terminal : Donald is cleaning Cow@4e50df2e <--- จะสังเกตว่ามันเอาตำแหน่งออกมาด้วย
        // เราอยากให้มันออกมาแค่ Cow เฉยๆ งั้นก็ต้องใส่ function นี้เข้าไป
        System.out.println(this.toString() + " is cleaning " + animal);
    }

}
