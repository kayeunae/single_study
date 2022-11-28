package project.everland;

public class KAdventure extends Adventure{
	//생성자
	
	
		KAdventure(String advName, String time)	{
			super(advName, time);
			super.minHeight = 100;
			super.maxHeight = 140;
			
		}

		@Override
		public String calc(int h) {
			return super.calc(h);
		}

		@Override
		public String notice() {
			return super.notice() +  "*아동용 놀이기구입니다.*";
		}


}
