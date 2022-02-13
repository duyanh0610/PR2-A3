package a3_1901040025;

/** 
 * @overview  use to create PC object 
 * @author Duy Anh
 *
 */
public class PCFactory {
	/** a single object of this class */
private static PCFactory instance; 
	/** 
	 * @effect 
	 * 	initialise this to be an empty object 
	 */
private PCFactory  (){}
	/**
	 * @effects
	 * create and return new PC:<model, year, manufacturer, comps>
	 */
 		public static PC createPC (String model, int year, String manufacturer, Set<String> comps) {
 			PC pc = new PC(model,year,manufacturer,comps);
 			return pc; 
 }  
 		/**
 		* @effects
 		* if instance = null
 		* initialise it
 		* return instance
 		*/
 		public  static PCFactory getFactory () {
 			if (instance == null) {
			   instance = new PCFactory();
			   }
			   return instance;
	  }
 }

