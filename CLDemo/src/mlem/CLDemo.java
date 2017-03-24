package mlem;


public class CLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CLDemo.class.getClassLoader().getParent());
		
		try{
			Class.forName("java.lang.String");
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
