package kadai_018;

	abstract public class Kato_Chapter18 {

	public String familiyName = "加藤";
	public String givenName;
	public String address =  "東京都中野区○×";
	
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	public void commonIntoroduce() {
		
		System.out.println("名前は" + this.familiyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
		
	}
	
	abstract public void eachIntroduce();
	
	public void execIntroduce () {
		commonIntoroduce();
		eachIntroduce();
		
		}
	
}