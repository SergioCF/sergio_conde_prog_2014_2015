import javax.swing.table.AbstractTableModel;


public class modeloTablaCorredores extends AbstractTableModel{
	ConexionDB corredoresDB;
	
	public modeloTablaCorredores(){
		//Generado el objeto
		corredoresDB=new ConexionDB("localhost","corredores","root","");
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
