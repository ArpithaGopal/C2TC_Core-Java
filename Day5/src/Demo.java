
 class Demo {
	 Demo()
	 {
		 System.out.println("hello a");
	 }
	 Demo(int x)
	 {
		 this();
		 System.out.println(x);
	 }
 }
 class testThis5
 {

	public static void main(String[] args) {
		Demo a=new Demo(10);

	}

}