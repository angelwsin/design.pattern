package org.Behavioral.model.State;

public class Context{
	
	
	private State state;
	
	
	
	public Context() {
		state = new OpenState(this);
	}



	public void active() {
		state.active();
	}



	public void setState(State state) {
		this.state = state;
	}



	public static void main(String[] args) {
		Context context = new Context();
		context.active();
		context.active();
	}
	
	
	

}
