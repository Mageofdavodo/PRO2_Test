package door;

public class DoorStayOpenState extends DoorState {
	private Door door;

	public DoorStayOpenState(Door door) {
		this.door = door;
	}

	@Override
	public String toString() {
		return "STAY OPEN";
	}

	@Override
	public void click() {
		door.setState(door.getClosingState());
		door.startTimer(3000, event -> {
			door.getState().complete();
		});
	}
}
