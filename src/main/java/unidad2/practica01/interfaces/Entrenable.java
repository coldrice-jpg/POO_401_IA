package unidad2.practica01.interfaces;

interface Serializable {

    public void a();

}

interface Tokenizable {

    public void b();

}

public interface Entrenable {

    public void c();

}


class modelo implements Serializable, Tokenizable, Entrenable {

    @Override
    public void a() {

    }

    @Override
    public void c() {

    }

    @Override
    public void b() {

    }
}

class modeloA implements Tokenizable {

    @Override
    public void b() {

    }
}
