package classes;

public class Produto {
    private String nomeProduto;
    private Double precoProduto;

    // Contrutores
    public Produto(){
    }

    public Produto(String nomeProduto, Double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    //Metodos
    public String etiquetaDePreco(){
        StringBuilder sb = new StringBuilder();
        sb.append("Preço da etiqueta:\n");
        sb.append(this.nomeProduto+" R$ "+this.precoProduto);
        return sb.toString();
    }


    //geters e setters


    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }
}
