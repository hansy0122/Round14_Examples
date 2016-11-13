interface AAA{
	public static final int x=100;
	public final int y=200;
	public static int w=0;
	public int z=255;        //모두다 형태는 달라도 public static final 임              
	public abstract void aaa();
	public void bbb();
	void ccc();            //형태는 달라도 전부다 public abstract void
	public static class Inner{}
}
public class Round14_Ex03 {
		public static void main(String ar[]){
	System.out.println(AAA.w); //클래스 명으로 접근가능 --> static 이라는 증거
	 //AAA.x=300;  final 필드는 값을 바꿀수 없으므로 error 
	
	
	
		}
	
	
	
}
