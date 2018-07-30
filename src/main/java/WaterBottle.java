public class WaterBottle {
    private int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public int volume(){
        return this.volume;
    }

    public int drink(){
    return this.volume = this.volume - 10;
    }

    public int emptyBottle(){
        return this.volume = this.volume - this.volume;
    }
}


