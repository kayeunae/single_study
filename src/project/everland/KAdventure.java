package project.everland;

public class KAdventure extends Adventure {
	//생성자
		KAdventure(String advName, String time)	{
			super(advName, time);
			super.minHeight = 100;
			super.maxHeight = 140;
			
		}

		@Override
		public String calc() {
			return super.calc();
		}

		@Override
		public String notice() {
			return "*아동용 놀이기구입니다.*";
		}
}
