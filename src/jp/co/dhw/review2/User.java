package jp.co.dhw.review2;

public class User {
	public Integer id;
	public String firstName;
	public String lastName;

	public User(Integer id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void showName() {
		System.out.println("id➡" + this.id);
		System.out.println("氏名➡" + this.lastName + ":" + this.firstName);
		System.out.println();
	}

//	課題4の実行
	// public static void main(String[] args) {
	// 	String[] names = {
	// 		    "山之内 洋平"
	// 		  , "山野 兼治"
	// 		  , "松隈 恭子"
	// 		  , "皆川 洋介"
	// 		  , "柴田 伊織"
	// 		  , "徳永 祐介"

	// 	};
	// 	for(int i = 1; i <= names.length; i++) {
	// 		User user = User.getUserInstance(i, names[i - 1]);
	// 		user.showName();
	// 	}
	// }

	public static User getUserInstance(Integer id, String fullName) {
		fullName = fullName.replaceAll("　", " ");
		String tmp = null;
		while(true) {
			if (tmp == fullName) break;
			tmp = fullName;
			fullName = fullName.replaceAll("  ", " ");
		}
		
		String[] userDetail = fullName.split(" ");
		if (userDetail.length > 0) {
			return new User(id, userDetail[1], userDetail[0]);
		} else {
			return new User(id, "", fullName);
		}
	}


}