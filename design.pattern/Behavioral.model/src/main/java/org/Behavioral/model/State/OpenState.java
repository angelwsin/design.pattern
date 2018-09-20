package org.Behavioral.model.State;

public class OpenState extends State{

	public OpenState(Context context) {
		super(context);
	}

	public void active() {
		System.out.println("open");
		context.setState(new CloseState(context));
	}

}
