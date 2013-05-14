package filmebom;

public class ListaEncadeada {

    private Node inicio;
    private Node fim;
    private int quantidade;

    public ListaEncadeada() {
        inicio = null;
        fim = null;
        quantidade = 0;
    }

    public int size() {
        return quantidade;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void display() {
        Node aux = inicio;
        for (int i = 0; i < quantidade; i++) {
            System.out.print(aux.getElemento() + " ");
            aux = aux.getProximo();
        }
        System.out.println();
    }

    public void addEnd(Node novo) {
        if (isEmpty()) {
            inicio = novo;
        } else {
            fim.setProximo(novo);
        }
        fim = novo;
        quantidade++;
    }

    public void addBegin(Node novo) {
        if (quantidade == 0) {
            fim = novo;
        } else {
            novo.setProximo(inicio);
        }
        inicio = novo;
        quantidade++;
    }

    public Node removeBegin() {
        Node retorno = inicio;
        if (quantidade != 0) {
            if (quantidade == 1) {
                inicio = null;
                fim = null;
            } else {
                inicio = inicio.getProximo();
            }
            quantidade--;
        }
        return retorno;
    }

    public Node removeEnd() {
        Node retorno = fim;
        if (quantidade != 0) {
            if (quantidade == 1) {
                inicio = null;
                fim = null;
            } else {
                Node penultimo = inicio;
                while (penultimo.getProximo() != fim) {
                    penultimo = penultimo.getProximo();
                }
                fim = penultimo;
                fim.setProximo(null);
            }
            quantidade--;
        }
        return retorno;
    }

    public Node getBegin() {
        return inicio;
    }

    public Node getEnd() {
        return fim;
    }

    public void add(Node novo, int index) {
        if ((index > quantidade) || (index < 0)) {
            System.out.println("Não é possível inserir o elemento");
        } else {
            if (index == 0) {
                novo.setProximo(inicio);
                inicio = novo;
                if (quantidade == 0) {
                    fim = novo;
                }
            } else {
                Node aux = inicio;
                for (int i = 1; i < index; i++) {
                    aux = aux.getProximo();
                }
                novo.setProximo(aux.getProximo());
                aux.setProximo(novo);
                if (novo.getProximo() == null) {
                    fim = novo;
                }
            }
            quantidade++;
        }
    }

    public Node remove(int index) {
        if ((index >= quantidade) || (index < 0)) {
            return null;
        } else {
            Node retorno;
            if (index == 0) {
                retorno = inicio;
                inicio = inicio.getProximo();
                if (quantidade == 1) {
                    fim = null;
                }
            } else {
                Node aux = inicio;
                for (int i = 1; i < index; i++) {
                    aux = aux.getProximo();
                }
                retorno = aux.getProximo();
                aux.setProximo(aux.getProximo().getProximo());
                if (aux.getProximo() == null) {
                    fim = aux;
                }
            }
            quantidade--;
            return retorno;
        }
    }

    public Node get(int index) {
        if ((index < 0) || (index >= quantidade)) {
            return null;
        } else {
            Node aux = inicio;
            for (int i = 0; i < index; i++) {
                aux = aux.getProximo();
            }
            return aux;
        }
    }
}
