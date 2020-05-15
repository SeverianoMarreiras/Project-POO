package classes;
import javax.swing.*;
import java.util.*;
public class MidiasMy {
	String Titulo;
	int Cod_midia;
	String genero;
	MidiasMy type;
	double Rating;
	ArrayList<String> atores;
	
	void inserir() {
		Object[] options = { "OK", "CANCEL","Excluir" };
//		JOptionPane.showOptionDialog(null, "tests", title, optionType, messageType, icon, options, initialValue)
		JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
				JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
				null, options, options[0]);
//		JOptionPane.showMessageDialog(null,
//		        "Houve um problema ao procurar o batman:\n\n", //mensagem
//		        "Erro 404", // titulo da janela 
//		        JOptionPane.INFORMATION_MESSAGE);
	}
}
