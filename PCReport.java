package a3_1901040025;
/**
 * @overview display report to console 
 * @author Duy Anh
 *
 */
public class PCReport {
	/**
	 * @effect display attributes of PC
	 */
	public String displayReport(PC[] objs) {
		String[] progReport = new String [objs.length];
		String Progreport="";
		String line= "--------------------------------------------------------------------------------------------------";
		
		for(int i = 0; i< objs.length; i++) {
		 progReport[i] =String.format("%3d %20s %6d %20s %50s",i+1,objs[i].getModel(),objs[i].getYear(),objs[i].getManufacturer(),objs[i].getComps().getElements()+ "\n");
		 Progreport += progReport[i];
		}
		
		
		String report =line + "\n" +
		String.format("%49s","PCPROG REPORT")+"\n"+	
				line+ "\n"+
		Progreport+
				line;
		
	return report;	
	}

}
