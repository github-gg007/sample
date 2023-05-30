package test;


public class Sample001 extends Object {


	public Sample001() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
		System.out.print(this.toString());
	}
	
	public void talking() {
		System.out.print("this is only a test.");
	}

	public static void main(String[] args){
		Sample001 sam = new Sample001();
		sam.talking();
		
	}
}