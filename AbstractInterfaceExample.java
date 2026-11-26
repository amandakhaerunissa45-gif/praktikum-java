// Contoh struktur interface dan abstract class dari konsep latihan 7-5.
interface A {
    void methodA();
}

class B implements A {
    @Override
    public void methodA() {
        System.out.println("Method A");
    }
}

abstract class C {
    abstract void methodC();
}

class D extends C {
    @Override
    void methodC() {
        System.out.println("Method C");
    }
}

class E extends B {
    // Mewarisi implementasi methodA() dari B.
}

public class AbstractInterfaceExample {
    public static void main(String[] args) {
        A a = new B();
        a.methodA();

        C c = new D();
        c.methodC();

        B b = new B();
        b.methodA();

        E e = new E();
        e.methodA();
    }
}
