package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		Kato_Chapter18 KatoTaro = new KatoTaro_Chapter18();
		Kato_Chapter18 KatoIchiro = new KatoIchiro_Chapter18();
		Kato_Chapter18 KatoHanako = new KatoHanako_Chapter18();
		
		
		KatoTaro.setGivenName("太郎");
		KatoTaro.execIntroduce ();
		System.out.println("");
		
		KatoIchiro.setGivenName("一郎");
		KatoIchiro.execIntroduce();
		System.out.println("");
		
		KatoHanako.setGivenName("花子");
		KatoHanako.execIntroduce();
		
		

	}

}
