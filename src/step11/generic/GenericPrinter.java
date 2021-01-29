package step11.generic;

public class GenericPrinter<T extends material> {
    //T타입이 extends하지 않아서 아무런 제약이 없다면
    //호출할 수 있는것은 Object밖에 없다.

    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString(){
        return material.toString();
    }

    public void printing(){
       material.doPrinting();
    }
}
