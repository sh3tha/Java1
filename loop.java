public class loop {
    public static void main(String[] args) {
        String[] names = {"Nasser", "Haitham", "Manal", "Hanin"};
       
		
		
		System.out.print("{");
        for (int i = 0; i < names.length; i++) {
            System.out.print("\"" + names[i] + "\"");
            if (i < names.length - 1) System.out.print(", ");
        }
        System.out.println("}");
		
		
		System.out.println();


        for (int i = 0; i < names.length; i++) {
            String reversed = new StringBuilder(names[i]).reverse().toString();
            System.out.print("\"" + reversed + "\"");
			
            if (i < names.length - 1) System.out.print(",");
        }
        System.out.println("}");
    }
}
