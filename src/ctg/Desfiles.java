package ctg;
import javax.swing.JOptionPane;
public class Desfiles {
    private String data;
    private String rua;
    private String cidade;
    private String estado;
    private String horcomeco;
    private String horfinal;
   
    Desfiles ()
    {
        this.data = "20/09/2014"; 
        this.horcomeco = "08:00"; 
        this.horfinal = "16:30"; 
this.cidade = null;
        this.estado = null;
        this.rua = null;
             
    }
 
    public String getData() {
        return data;
    }
 
    public void setData(String data) {
        this.data = data;
    }
 
    public String getRua() {
        return rua;
    }
 
    public void setRua(String rua) {
        this.rua = rua;
    }
 
    public String getCidade() {
        return cidade;
    }
 
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
 
    public String getEstado() {
        return estado;
    }
 
    public void setEstado(String estado) {
        this.estado = estado;
    }
 
    public String getHorcomeco() {
        return horcomeco;
    }
 
    public void setHorcomeco(String horcomeco) {
        this.horcomeco = horcomeco;
    }
 
    public String getHorfinal() {
        return horfinal;
    }
 
    public void setHorfinal(String horfinal) {
        this.horfinal = horfinal;
    }
   
    public void Informacoes () 
    {
        JOptionPane.showMessageDialog(null, "Rua " + this.rua + ", " + this.cidade + "-" + this.estado);
    }
   
   
}
