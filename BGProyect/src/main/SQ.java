package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SQ implements ActionListener{
	private Brain brain;
	
	public SQ(Brain brain)
	{
		this.brain = brain;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		brain.codeset(1);
		brain.submit("show bgp ipv4 unicast");
	}

}
