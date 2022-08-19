package classes;

public class ProdutoImportado extends Produto {
    private Double taxaAlfandegaria;

    //Construtores
    public ProdutoImportado(){
        super();
    }

    public ProdutoImportado(Double taxaAlfandegaria) {
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    public ProdutoImportado(String nomeProduto, Double precoProduto, Double taxaAlfandegaria) {
        super(nomeProduto, precoProduto);
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    //Metodos
    public Double precoTotal(){
        return getPrecoProduto()+(getPrecoProduto()*this.taxaAlfandegaria);
    }
    @Override
    public String etiquetaDePreco(){
        StringBuilder sb = new StringBuilder();
        sb.append("Preço da etiqueta:\n");
        sb.append(getNomeProduto()+" R$ "+getPrecoProduto()+" ( "+
                "Taxa de alfandega: R$ "+this.taxaAlfandegaria+" )");
        return sb.toString();
    }

    //Geters e Setters
    public Double getTaxaAlfandegaria() {
        return taxaAlfandegaria;
    }

    public void setTaxaAlfandegaria(Double taxaAlfandegaria) {
        this.taxaAlfandegaria = taxaAlfandegaria;
    }
}
