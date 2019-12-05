import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class Mainclass extends JFrame {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JTable jt;
DefaultTableModel dtm;

	public Mainclass()
	{
		jt = new JTable();
		String[] rows = {"Fruta (100 g)","Calorias","Proteína","Carbs","Fibra","Gordura"};
		String[][] cols = {
				{"Abacaxi","48","0,54 g","12,63 g","1,4 g","0,12 g"},
				{"Amora","43","1,39 g","9,61 g","5,3 g","0,49 g"},
				{"Abacate","160","2 g","8,53 g","6,7 g","14,66 g"},
				{"Banana-prata","89","1,09 g","22,84 g","2,6 g","0,33 g"},
				{"Caqui","70","0,58 g","18,59 g","3,6 g","0,19 g"},
				{"Caju","43","0,21 g","11,41 g","2 g","0,14 g"},
				{"Ameixa","46","0,7 g","11,42 g","1,4 g","0,28 g"},
				{"Figo","74","0,75 g","19,18 g","2,9 g","0,3 g"},
				{"Framboesa","52","1,2 g","11,94 g","6,5 g","0,65 g"}	
		};
		dtm = new DefaultTableModel(cols,rows);
		jt.setModel(dtm);
		JScrollPane sp = new JScrollPane();
		sp.setViewportView(jt);
		add(sp);
		setSize(500,300);
		setVisible(true);
		setTitle("Tabela Nutricional Frutas - (EAD Aula 18) - Adilson Crist");
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
	}

	public static void main(String[] args) {
		new Mainclass();
	}

}
