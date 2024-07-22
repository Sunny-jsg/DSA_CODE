// Add two number;
class Test{
  int add(int a, int b){
    int c = a + b;
	return c;
}
}
class Addition{
  public static void main(String[] args){
   Test t = new Test();
   int i =t.add(12,21);
   System.out.println(i);
   }
  } 
  
