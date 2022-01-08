package api.test.mashharuki;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Greeting関数のAPIを実装したJavaクラス
 * @author harukikondo
 */
@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	/**
	 * greeting API
	 * @param name ユーザー名
	 * @return Greeting型のインスタンス
	 */
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		// Greetingインスタンスを生成する。
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/test")
	public String test() {
		// 文字列を返却します。
		return "API接続テスト成功！";
	}
}
