package project.everland;

public class Adventure {
	//필드
		String advName;
		String time;
		int minHeight;
		int maxHeight;
		
		//생성자
		Adventure(){
			condition();
		}
		
		Adventure(String advName, String time){
			this.advName = advName;
			this.time = time;
			condition();
		}
		
		//메소드
		public void condition() {
			minHeight = 130;
			maxHeight = 195;
		}
		
		public String calc() {
			Membership membership = new Membership();
			if(membership.getHeight() < minHeight || membership.getHeight() > maxHeight) {
				return "적정 신장에 해당하지 않습니다. 다른 놀이기구를 이용해 주세요.";
			} else {
				return "대기 등록되었습니다.";
			}
		}
		
		public String notice() {
			return "";
		}

}
