interface AAA{
	public static final int x=100;
	public final int y=200;
	public static int w=0;
	public int z=255;        //��δ� ���´� �޶� public static final ��              
	public abstract void aaa();
	public void bbb();
	void ccc();            //���´� �޶� ���δ� public abstract void
	public static class Inner{}
}
public class Round14_Ex03 {
		public static void main(String ar[]){
	System.out.println(AAA.w); //Ŭ���� ������ ���ٰ��� --> static �̶�� ����
	 //AAA.x=300;  final �ʵ�� ���� �ٲܼ� �����Ƿ� error 
	
	
	
		}
	
	
	
}
