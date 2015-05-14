package ctg;
import javax.swing.JOptionPane;
public class TestaOrganizacao {

    public static void main(String[] args) {
        Desfiles desfile = new Desfiles ();
 
 
       
        String data, rua, cidade, estado, horcomeco, horfinal;
        JOptionPane.showMessageDialog(null,"Sobre o desfile:");
        data = JOptionPane.showInputDialog("Entre com a data: ");
        rua = JOptionPane.showInputDialog("Entre com a rua: ");
        cidade = JOptionPane.showInputDialog("Entre com a cidade: ");
        estado = JOptionPane.showInputDialog("Entre com o estado: ");
        horcomeco = JOptionPane.showInputDialog("Entre com o horário de começo: ");
        horfinal = JOptionPane.showInputDialog("Entre com o horário de término: ");
       
        desfile.setCidade(cidade);
        desfile.setData(data);
        desfile.setEstado(estado);
        desfile.setHorcomeco(horcomeco);
        desfile.setHorfinal(horfinal);
        desfile.setRua(rua);
       
        JOptionPane.showMessageDialog(null, "Data: " + desfile.getData() + "\nComeço: " + desfile.getHorcomeco() + " horas\n" + "Término: "
                + desfile.getHorfinal() + " horas" );
              
        desfile.Informacoes();
       
   
       
    }
   
}
