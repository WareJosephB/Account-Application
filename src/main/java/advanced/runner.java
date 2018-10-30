package advanced;

import java.util.Scanner;

public class runner {

	public static void main(String[] args) {
System.out.println("Please enter either 'Delete {account number}', 'Add {firstname}, {secondname}' or 'Retrieve {account number}'");
		while (true) {
			
			Scanner sc = new Scanner(System.in);
		     String intput = sc.nextLine();
		     if  (intput.substring(0, 6).toLowerCase().equals("delete")) {
		    	 service.deleteAccount(Integer.parseInt(intput.substring(7)));
		     } else if (intput.substring(0, 3).toLowerCase().equals("add")) {
		    	 String[] name = intput.substring(4).split(", ");
		    	 service.addAccount(name[0], name[1]);
		    	 
		     } else if (intput.substring(0, 8).toLowerCase().equals("retrieve")) {
		    	 System.out.println(service.getAccountByAccountNumber(Integer.parseInt(intput.substring(9))));
		     } else {
		    	 System.out.println("Input not understood.");
		     }
			
		}
		
		
	}

}
