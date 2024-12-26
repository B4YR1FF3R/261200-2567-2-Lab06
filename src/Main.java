public class Main {
    public static void main(String[] args) {

        // สร้างสัตว์ในฟาร์ม
        Cow wagyu = new Cow();
        Duck donald = new Duck("Donald");
        Pig burin = new Pig();
        Owl hedwig = new Owl();

        // ตั้งชื่อเป้ดปักกิ่ง
        PekingDuck JiaTongHeng = new PekingDuck("JTH");
        // เป็ดปักกิ่งทำความสะอาดหมู
        JiaTongHeng.clean(burin);
        // เป็ดปักกิ่งบิน
        JiaTongHeng.fly();

        // เป็ดทำความสะอาดวัว
        donald.clean(wagyu);

        // สัตว์ส่งเสียง
        wagyu.sound();
        donald.sound();
        burin.sound();
        hedwig.sound();

    }

}

