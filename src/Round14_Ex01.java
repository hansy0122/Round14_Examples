 abstract class A{
	void aaa(){
		System.out.print("aa");
	}
}

class B extends A{

	
}
public class Round14_Ex01 {
public static void main(String ar[]){
	//A ap=new A(); abstract class �� ��ü�߻� �Ұ�
	A ap1=new B();
	ap1.aaa();
	B bp=new B();
	bp.aaa();
}
}
