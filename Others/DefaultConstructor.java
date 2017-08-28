class DefaultConstructor{
	// DefaultConstructor(){}
	DefaultConstructor(String s){
		System.out.println(s);
	}
	void print(){
		System.out.println("print called");
	}
	public static void main(String args[]){
		DefaultConstructor object = new DefaultConstructor();
		object.print();
	}
}