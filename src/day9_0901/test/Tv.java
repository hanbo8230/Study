package day9_0901.test;

/**
 * Created by ���� on 2016/9/1.
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
        if (x == "����") {
            this.on = true;
        }

        if (x == "�ػ�") {
            this.on = false;
        }
//        if (x == true) {
//            System.out.print("����");
//        } else {
//            System.out.print("�ػ�");
//        }
    }

    public void volume_Up(int volume) {
        if (this.on == true) {
            if (this.volume + volume >= 100) {
                this.volume =100;
                System.out.println("�����Ѵﵽ���");
            } if(this.volume + volume < 100){
                this.volume += volume;
                System.out.println("����Ϊ: " + this.volume);
            }
        } else {
            System.out.print("û�п���");
        }
    }

    public void volume_Down(int volume) {
        if (this.volume > volume) {
            this.volume -= volume;
            System.out.println("����Ϊ: " + this.volume);
        } else if (this.volume < volume) {
            this.volume = 0;
            System.out.println("����Ϊ: " + this.volume);
        }
    }

}
