package day9_0901.test.work;

/**
 * Created by ���� on 2016/9/1.
 */

public class Dog {          //pet: ����
    private String name;      //����
    private int health;     //����ֵ
    private int cohesion;   //���ܶ�
    private String breed;  //Ʒ��


    //ѡƷ��
    public void breed(int x) {
        switch (x) {
            case 1:
                setBreed("��������������");
                break;
            case 2:
                setBreed("�����Ĺ�ʿ��");
                break;
            default:
                System.out.println("������������");
        }
    }

    //ѡ����ֵ
    public void health(int x) {
        if (x > 1 && x <= 100) {
            this.health = x;
        } else {
            this.health = 60;
        }

    }

    //�����԰�
    public void speak(String name) {
        System.out.println("�ҽ�" + name + ", �ҵĽ���ֵΪ: " +
                this.health + "�ҵ�������: " + this.breed);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getCohesion() {

        return cohesion;
    }

    public void setCohesion(int cohesion) {
        this.cohesion = cohesion;
    }

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
