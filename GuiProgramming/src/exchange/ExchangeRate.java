package exchange;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ExchangeRate {

	public static void main(String[] args) {
		try {
			// 환율정보를 가져올 웹 페이지 url 
			// 네이버 -> 증권 -> 시장지표
			String url = "https://finance.naver.com/marketindex/";
			
			// Connection 객체 생성
			Connection conn = Jsoup.connect(url);
			
			// 접속 페이지의 데이터 가져오기
			Document doc = conn.get();
			//System.out.println(doc);
			//System.out.println(doc.html());  // html 보기
			
			// 태그와 태그 선택자를 이용해서 데이터를 가져옴
			Elements contents = doc.select(".data_lst li");
			//System.out.println(contents);
			
			for(Element element : contents) {
				// 통화(currency), 환율(rate)
				//String currency = element.select("span.blind").text();
				// selectFirst() = class blind중 처음 값만 가져옴
				// 나라이름을 제외한 통화 이름만 출력 - split()함수 사용
				String currency = element.selectFirst("span.blind").text();
				String rate = element.selectFirst("span.value").text();
				// currency.split(" "); -> 공백을 이용해서 문자를 나눔
				// String[] currencyArr -> 나눈 문자를 새 배열에 저장
				// currencyArr[1] -> 1번 인덱스만 출력
				String[] currencyArr = currency.split(" ");
				//System.out.print(currencyArr[0] + " " + currencyArr[1] + "\n");
				System.out.println(currencyArr[1] + ": " + rate);
				if(currency.equals("중국 CNY")) {
					break;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
