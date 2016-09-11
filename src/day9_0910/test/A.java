package day9_0910.test;

/**
 * Created by º«²© on 2016/9/10.
 */
public abstract interface A {
    public abstract void a();

}
 abstract interface B {
    public abstract void b();

}
  interface C extends A,B{
      public abstract void c();
  }
class D implements C{

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }
}