
package visao;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class BairroVisao extends FormPadrao {
    JLabel jlBairro;
    JComboBox jcbBairro;
    
    public BairroVisao(){
        setTitle("Cadastro de Bairro");
        
    }

    @Override
    public void inicializarComponentes() {
        jlBairro = new JLabel("Cidade");
        jlBairro.setBounds(9, 60, 50,25);
        jpnFormulario.add(jlBairro);
        
        jcbBairro = new JComboBox();
        jcbBairro.setBounds(9, 80, 250, 25);
        jpnFormulario.add(jcbBairro);
    }
    
    
    
}
