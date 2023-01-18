package interfaceTest;

public class Puppy implements Pet {

	@Override
	public void giveYourHand() {
		System.out.println("여기요!");
	}

	@Override
	public void bang() {
		System.out.println("눕는다.");
	}

	@Override
	public void sitDown() {
		System.out.println("앉는다.");
	}

	@Override
	public void waitNow() {
		System.out.println("기다린다.");
	}

	@Override
	public void getNose() {
		System.out.println("손가락에 코를 넣는다.");
	}

}
