package training;

import java.util.Random;

public class Cleric {

    String name;
    int hp = 50;
    final int maxHp = 50;
    int mp = 10;
    final int maxMp = 10;

    public void selfAid() {
        this.mp -= 5;
        this.hp = this.maxHp;
    }

    public int pray(int sec) {
        int recover = sec + new Random().nextInt(2);
        int recoverActual = Math.min(this.maxMp - this.mp, recover);
        this.mp += recoverActual;
        return recoverActual;
    }


}
