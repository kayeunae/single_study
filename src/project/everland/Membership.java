package project.everland;

public class Membership {
	//필드
		protected String name;
		protected int height;
		protected int userID;
		protected int birth;
		
		//생성자
		Membership(){}
		
		Membership(String name, int birth, int height, int userID){
			this.name = name;
			this.birth = birth;
			this.height = height;
			this.userID = userID;
		}

		//get, set
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public int getUserID() {
			return userID;
		}

		public void setUserID(int userID) {
			this.userID = userID;
		}

		public int getBirth() {
			return birth;
		}

		public void setBirth(int birth) {
			this.birth = birth;
		}
}
