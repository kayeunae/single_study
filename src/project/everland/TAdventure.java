package project.everland;

public class TAdventure extends Adventure {
	//생성자
		TAdventure(String advName, String time)	{
			super(advName, time);
			super.minHeight = 140;
			super.maxHeight = 185;
		}

		@Override
		public String calc() {
			return super.calc();
		}

		@Override
		public String notice() {
			return "*심약자는 탑승에 주의하시기 바랍니다.*";
		}
}
