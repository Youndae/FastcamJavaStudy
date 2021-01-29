package step9.interfaceEx2.Ex2;

public class BookShelf extends Shelf implements Queue{

    @Override
    public void enQueue(String title) {
        shelf.add(title); //Shelf를 상속받았으니 shelf를 바로 사용할 수 있는것.
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
