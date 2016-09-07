package day9_0907.test.dayinji;

/**
 * Created by º«²© on 2016/9/7.
 */
public abstract class DaYinJi {
    private String pinPai;
    private String yanSe;
    DaYinJi(){

    }

    public void start(){
        System.out.println("Æô¶¯À²");
    }
    public abstract void  print();

    public String getYanSe() {
        return yanSe;
    }

    public void setYanSe(String yanSe) {
        this.yanSe = yanSe;
    }

    public String getPinPai() {
        return pinPai;
    }

    public void setPinPai(String pinPai) {
        this.pinPai = pinPai;
    }
}
