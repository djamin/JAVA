

    class students {
	
	public int roll;
	public String name;
	public void getdata()
	{
		roll=101;
		name="ruhul";
		
	
	}
	void display()
	{
		
		
		System.out.println("print roll: "+roll);
		System.out.println("print roll: "+name);

	}
	
	
}


 class Public {
	

	public static void main(String[] args) {
		students s = new students ();
		
		s.getdata();
	
		s.display();

	}

}
