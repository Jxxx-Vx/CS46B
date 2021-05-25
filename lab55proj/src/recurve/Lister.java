package recurve;
import java.io.*;

public class Lister {
	private File file;
	private boolean showsHidden;
	
	public Lister(File f, boolean b) {
		file = f;
		showsHidden = b;
	}
	
	public void list() {
		listRecurse(file,"");
	}
	
	private void listRecurse(File f,String indent) {

		if(showsHidden == true) {	
			
			if(f.isDirectory()) {
				System.out.println(indent + f.getName()+":");
				
				File [] list = f.listFiles();
				
				for(File temp: list) {
					listRecurse(temp, indent+" ");
				}
			}
			if(f.isFile()) {
				System.out.println(indent + f.getName());
			}
		}
		
		if(showsHidden = false) {
			
			String s = f.getName();
			
			if(f.isDirectory() && s.charAt(0) != '.') {
				System.out.println(indent + f.getName()+":");
				File [] list = f.listFiles();
				for(File temp: list) {
					listRecurse(temp, indent + " ");
				}
			}
			if(f.isFile()  && s.charAt(0) != '.') {
				System.out.println(indent + f.getName());
			}
		}
	}
	
	public static void main(String [] arg) {
		File f = new File("/users/johnc/Practice/lab55proj");
		Lister l = new Lister(f, false);
		l.list();
	}
}
	


