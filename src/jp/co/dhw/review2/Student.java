package jp.co.dhw.review2;

public class Student extends User {

	public Student(Integer id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}

	public static void main(String[] args) {
		String[] names = {
			  "武田　憲隆"
			, "高木　香"
			, "柴田　伊織"
			, "長尾 有希子"
			, "酒見　真悟"
			, "竹末　憲和"
			, "國崎　宏治"
			, "割鞘　洋介"
			, "榎枝　大悟"
			, "今田　尭"
			, "松隈　恭子"
			, "花田　恒一"
			, "内藤　初美"
			, "原田　清司"
			, "永野　修平"
			, "奈木野　純一"
			, "山之内　洋平"
			, "鐘ヶ江　耕治"
			, "野口　龍真"
			, "山野　兼治"
			, "皆川　洋介"
		};
		for(int i = 1; i <= names.length; i++) {
			User user = User.getUserInstance(i, names[i - 1]);
	 		user.showName();
	 	}
	}
}