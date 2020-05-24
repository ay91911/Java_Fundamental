package java_20200519;

public class Admin1 {
	private String id;
	private String pwd;
	private String email;
	private int level;

	public Admin1() {
		super();
	}

	public Admin1(String id, String pwd, String email, int level) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}

	public Admin1(String id, String pwd, String email) {
		this(id, pwd, email, 0);
	}

	// id에 대한 setter 메서드
	public void setId(String id) {
		this.id = id;
	}

	// id에 대한 getter 메서드
	public String getId() {
		return id;
	}

	// pwd에 대한 setter 메서드
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	// pwd에 대한 getter 메서드
	public String getPwd() {
		return pwd;
	}

	// email에 대한 setter 메서드
	public void setEmail(String email) {
		this.email = email;
	}

	// email에 대한 getter 메서드
	public String getEmail() {
		return email;
	}

	// level에 대한 setter 메서드
	public void setLevel(int level) {
		this.level = level;
	}

	// level에 대한 getter 메서드
	public int getLevel() {
		return level;
	}

}
