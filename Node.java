package filmebom;

public class Node {

    private Dvd elemento;
    private Node proximo;

    public Node(Dvd elemento, Node proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Node(Dvd elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setElemento(Dvd elemento) {
        this.elemento = elemento;
    }

    public Dvd getElemento() {
        return elemento;
    }
}
