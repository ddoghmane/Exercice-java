
public class ArgumentMain {

	public static void main(String[] args) {
		if(args!=null) {
			System.out.println("La taille du tableau args est : "+args.length);
			
			for(String str : args) {
				System.out.println(str);
			}
		}
		// TODO Auto-generated method stub

	}

}
