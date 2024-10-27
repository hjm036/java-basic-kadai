package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public HashMap<String,String> fruit = new HashMap<String,String>();{
	
	fruit.put("apple","りんご");
	fruit.put("peach","桃");
	fruit.put("banana","バナナ");
	fruit.put("lemon","レモン");
	fruit.put("pear","梨");
	fruit.put("kiwi","キウイ");
	fruit.put("strawberry","いちご");
	fruit.put("grape","ぶどう");
	fruit.put("muscut","マスカット");
	fruit.put("cherry","さくらんぼ");
	
	}
	
	public void check(String[]words) {
		for (String word : words) {
			if(fruit.containsKey(word)) {
				System.out.println(word + "の意味は" + fruit.get(word));
			}else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}
}