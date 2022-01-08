package api.test.mashharuki;

/**
 * Greeting用のモデルファイル
 * @author harukikondo
 */
public class Greeting {

	/** ID */
	private final long id;
	/** 内容 */
	private final String content;

	/**
	 * IDと内容をセットするための関数
	 * @param id
	 * @param content
	 */
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	/**
	 * ID用のgetter関数
	 * @return
	 */
	public long getId() {
		return id;
	}

	/**
	 * 内容用のgetter関数
	 * @return
	 */
	public String getContent() {
		return content;
	}
}
