package org.Behavioral.model.State;

public class CloseState extends State{

	public CloseState(Context context) {
		super(context);
	}

	public void active() {
		System.out.println("close");
	}

}
