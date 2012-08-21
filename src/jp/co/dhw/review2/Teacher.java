package jp.co.dhw.review2;

public class Teacher extends User {
	public String subject;

	public Teacher(Integer id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}

	public Teacher(Integer id, String firstName, String lastName, String subject) {
		super(id, firstName, lastName);
		this.subject = subject;
	}

	public String getSubject() {
		return this.subject;
	}

	// main method
	public static void main(String[] args) {
		String[] names = {
			  "長澤　大輔　｜デザイン"
			, "ラディ　ジェイソン　｜デザイン"
			, "薄井 隆  ｜Web/アプリ"
			, "山本 浩司　｜3DCG"
			, "ハナブサ　ノブユキ　｜デザイン"
			, "コヌマ　ヨシツグ　｜Web/アプリ"
			, "渡部 昇治　｜Web/アプリ"
		};
		for(int i = 1; i <= names.length; i++) {
			User user = Teacher.getUserInstance(i, names[i - 1]);
	 		user.showName();
	 	}
	}

	public static User getUserInstance(Integer id, String fullName) {
		fullName = fullName.replaceAll("　", " ");
		fullName = fullName.replaceAll("｜", " ");
		String tmp = null;
		while(true) {
			if (tmp == fullName) break;
			tmp = fullName;
			fullName = fullName.replaceAll("  ", " ");
		}
		
		String[] userDetail = fullName.split(" ");
		if (userDetail.length > 0) {
			if (userDetail.length >= 3) {
				return new Teacher(id, userDetail[1], userDetail[0], userDetail[2]);
			} else {
				return new Teacher(id, userDetail[1], userDetail[0], "");
			}
		}

		return new Teacher(id, "", fullName);
	}

	@Override
	public void showName(){
		System.out.println("教科➡" + this.subject);
		System.out.println("氏名➡" + this.lastName + ":" + this.firstName);
		System.out.println();

	}

}