package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		KatoTaro_Chapter18 KatoTaro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 KatoIchiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 KatoHanako = new KatoHanako_Chapter18();
		
		
		KatoTaro.setGivenName();
		KatoTaro.execIntroduce ();
		System.out.println("");
		
		KatoIchiro.setGivenName();
		KatoIchiro.execIntroduce();
		System.out.println("");
		
		KatoHanako.setGivenName();
		KatoHanako.execIntroduce();
		
		

	}

}
