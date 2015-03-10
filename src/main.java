import java.util.HashMap;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> items = new HashMap<String, Integer>(); 
		items.put("a", 1);
		items.put("b", 1);
		items.put("c", 4);
		items.put("s", 3);

		
		if(items.containsKey("d")){
			System.out.print("##############");
			
		}
	}

}
