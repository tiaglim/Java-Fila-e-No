public class Fila {
    private No primeiro;
    private No ultimo;
    private int tamanho;
    public boolean enfileira;
    //por clareza
    public Fila () {
        setPrimeiro(null);
        setUltimo(null);
        setTamanho(0);
    }
    //modificadores
    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }
    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    //acesso
    public No getPrimeiro() {
        return this.primeiro;
    }
    public No getUltimo() {
        return this.ultimo;
    }
    public int getTamanho() {
        return this.tamanho;
    }
    public boolean esta_vazia() {
        return this.primeiro == null;
    }
    public int desenfileira () {
        int temp = primeiro.getInfo();
        setPrimeiro(primeiro.getProximo());
        if (primeiro == null) {
            setUltimo(null);
        }
        tamanho--;
        return temp;
    }

    public void enfileira (int b) {
        No novo = new No (b); 
        if (this.esta_vazia()) {
            setPrimeiro(novo);
        }
         else {
                ultimo.setProximo(novo);
         ultimo.setProximo(novo);
        }
        
        setUltimo(novo);
        tamanho++;
    }
    @Override
    public String toString () {
        String s = "fila: ";
        if (esta_vazia())
            s+= "vazia";
        else {
            No aux = primeiro;
            do {
                s+= aux;
                aux = aux.getProximo();
            } while (aux != null);
        }
        return s + "//\n";
}
}
