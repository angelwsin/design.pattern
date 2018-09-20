package org.Behavioral.model.State;

public abstract class State {
	
	protected Context  context;
	
	
	
    public State(Context context) {
		super();
		this.context = context;
	}



	abstract public void  active();

}
