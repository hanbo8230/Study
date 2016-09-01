package day9_0901.test;

/**
 * Created by 韩博 on 2016/9/1.
 */
public class Tv {
    String channel;
    int volume=0;
    boolean on = false;

    Tv() {
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getVolume() {

        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getChannel() {

        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void on(String x) {
        if (x == "开机") {
            this.on = true;
        }

        if (x == "关机") {
            this.on = false;
        }
//        if (x == true) {
//            System.out.print("开机");
//        } else {
//            System.out.print("关机");
//        }
    }

    public void volume_Up(int volume) {
        if (this.on == true) {
            if (this.volume + volume >= 100) {
                this.volume =100;
                System.out.println("音量已达到最大");
            } if(this.volume + volume < 100){
                this.volume += volume;
                System.out.println("音量为: " + this.volume);
            }
        } else {
            System.out.print("没有开机");
        }
    }

    public void volume_Down(int volume) {
        if (this.volume > volume) {
            this.volume -= volume;
            System.out.println("音量为: " + this.volume);
        } else if (this.volume < volume) {
            this.volume = 0;
            System.out.println("音量为: " + this.volume);
        }
    }

}
