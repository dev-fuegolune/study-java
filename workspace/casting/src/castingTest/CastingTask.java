package castingTest;

// 넷플릭스
// 애니메이션, 영화, 드라마 클래스 선언
// 사용자가 선택한 영상이
// 애니메이션이라면 "자막지원"기능 사용
// 영화라면 "4D"기능 사용
// 드라마라면 "굿즈"기능 사용
public class CastingTask {

	public void checkVideo(Video video) {
		if(video instanceof Animation) {
			Animation animation = (Animation) video;
			animation.getSubtitle();
		}else if(video instanceof Film) {
			Film film = (Film) video;
			film.moveChair();
		}else if(video instanceof Drama) {
			Drama drama = (Drama) video;
			drama.sellGoods();
		}
	}
	
	public static void main(String[] args) {
		Video[] videos = {
				new Animation(),
				new Film(),
				new Drama()
		};
		CastingTask castingTask = new CastingTask();
		
		for (int i = 0; i < videos.length; i++) {
			castingTask.checkVideo(videos[i]);
		}
		
	}
}








