package ctg;


public class ClasseCTG {
    private String nome;
    private String data;
    private int numinteg;
    private String cidade;
    private double mensalidade;
    private double gastosmensais;
    private boolean declamando;
   private boolean dancando;
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getData() {
        return data;
    }
 
    public void setData(String data) {
        this.data = data;
    }
 
    public int getNuminteg() {
        return numinteg;
    }
 
    public void setNuminteg(int numinteg) {
        this.numinteg = numinteg;
    }
 
    public String getCidade() {
        return cidade;
    }
 
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
 
    public double getMensalidade() {
        return mensalidade;
    }
 
    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
 
    public boolean isDeclamando() {
        return declamando;
    }
 
    public void setDeclamando(boolean declamando) {
        this.declamando = declamando;
    }
 
    public boolean isDancando() { // nao seria getDancando ???
        return dancando;
    }
 
    public void setDancando(boolean dancando) {
        this.dancando = dancando;
    }
   
    public String retornarPorte () 
    {
        if (this.numinteg < 51)
        {
            return "Pequeno porte";
        }
        if (this.numinteg > 50 && this.numinteg < 81)
        {
            return "Médio porte";
        }
        if (this.numinteg > 80)
        {
            return "Grande porte";
        }
        return null;
       
       
    }
   
    public double retornarGastos () 
    {
        this.gastosmensais = numinteg * mensalidade;
        return this.gastosmensais;
    }
   
    public String atividades () 
    {
        double gastos = 700.0;
       
        if (dancando)
        {
            gastos = gastos + 1500.0 ;
        }
        if (declamando)
        {
            gastos = gastos + 1000.0;
        }
        if (gastos > this.gastosmensais)
        {
            return "O CTG não tem dinheiro para atividades";
        }
        else
        {
            return "O CTG tem dinheiro para atividades";
        }
    }
 
   
   
   
   
   
}
 