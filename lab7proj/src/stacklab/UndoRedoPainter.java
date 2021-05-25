package stacklab;

import java.util.*;


public class UndoRedoPainter extends Painter
{
	
	public UndoRedoPainter() {
		 setUndoButtonEnabled(false);
		 setRedoButtonEnabled(false);
	}
	// Called when the user pushes the Undo button.
	void undo()
	{
		if(!getHistory().isEmpty()) {
			setRedoButtonEnabled(true);
			Circle c = getHistory().pop();
			getUndoHistory().push(c);
			repaint();
			if(getHistory().isEmpty())
				setUndoButtonEnabled(false);
		}
		
	}


	// Called when the user pushes the Redo button.
	void redo()
	{
		if(!getUndoHistory().isEmpty()) {
			setUndoButtonEnabled(true);
			Circle c =getUndoHistory().pop();
			getHistory().push(c);
			repaint();
			if(getUndoHistory().isEmpty())
				setRedoButtonEnabled(false);
		}
		
	}
	
	
	public static void main(String[] args)
	{
		new UndoRedoPainter().setVisible(true);
	}
}
