package ctg;
import javax.swing.JOptionPane;
public class TestaCTG {

    public static void main(String[] args) {
        ClasseCTG centro = new ClasseCTG ();
        String nome, data, cidade;
        int numinteg;
        double mensalidade;
        nome = JOptionPane.showInputDialog("Entre com o nome do CTG: ");
        data = JOptionPane.showInputDialog("Entre com a data de fundação: ");
        numinteg = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número de integrantes: "));
        cidade = JOptionPane.showInputDialog("Entre com a cidade de localização: ");
        mensalidade = Double.parseDouble(JOptionPane.showInputDialog("Entre com a mensalidade: "));
       
        
        centro.setCidade(cidade);
        centro.setData(data);
        centro.setMensalidade(mensalidade);
        centro.setNome(nome);
        centro.setNuminteg(numinteg);
       
        String danca, declama;
        danca = JOptionPane.showInputDialog("Participa de competições de dança?\n(SIM/NÃO) ");
        if ("SIM".equals(danca))
        {
            centro.setDancando(true);
        }
        else
        {
            centro.setDancando(false);
        }
        declama = JOptionPane.showInputDialog("Participa de competições de declamação?\n(SIM/NÃO) ");
        
        if ("SIM".equals(declama))
        {
            centro.setDeclamando(true);
        }
        else
        {
            centro.setDeclamando(false);
        }
       
        JOptionPane.showMessageDialog(null,"Nome: " + centro.getNome() + "\nData de fundação: " + centro.getData() + "\nNúmero de integrantes: "
                + centro.getNuminteg() + "\nCidade: " + centro.getCidade() + "\nMensalidade: " + centro.getMensalidade() + "\nParticipacão em danças: "
                + centro.isDancando() + "\nParticipacão em declamações: " + centro.isDeclamando() + "");
       
        JOptionPane.showMessageDialog(null,"Gastos mensais: " + centro.retornarGastos() +  "\nPorte: " + centro.retornarPorte() +  "atividades extras:" 
                + centro.atividades());
                
        
        
               
//       
//        if ("SIM".equals(declama) && "SIM".equals(danca)) // A //string “SIM” é desnecessária, pois bastaria testar pelo nome //das variáveis booleanas, afinal elas contém 1 para SIM e 0 //para não.
//        {
//            JOptionPane.showMessageDialog(null, "Atividades e rendimento:" + centro.atividades()
//                    centro.atividades(true, true));
//        }
//        if ("NÃO".equals(declama) && "SIM".equals(danca)) // idem
//
// {
//            JOptionPane.showMessageDialog(null, "Atividades e rendimento:" + centro.atividades(false, true));
//        }
//        if ("SIM".equals(declama) && "NÃO".equals(danca))
//        {
//            JOptionPane.showMessageDialog(null, "Atividades e rendimento:" + centro.atividades(true, false));
//        }
//         if ("NÃO".equals(declama) && "NÃO".equals(danca))
//        {
//            JOptionPane.showMessageDialog(null, "Ativiaddes e rendimentos:\nO CTG não participa de nenhuma atividade.");
//        }
   
    }
   
}
 