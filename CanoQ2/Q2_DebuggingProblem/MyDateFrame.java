//CIS2235 Java Debugging Problem


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.*;
import java.awt.GridLayout;


public class MyDateFrame extends JFrame
{
	DateGenerator dateMaker; 
	JSlider slMonth = new JSlider(1,12, 1);
	JLabel lblNewDate = new JLabel("The date is...", JLabel.CENTER);
	int monthNum = 1;
	
	public MyDateFrame(DateGenerator gen )
	{
		dateMaker = gen;
		
		//make the container
		GridLayout wcgrid = new GridLayout(5, 1);
		setLayout(wcgrid);

		//create the components 
		JLabel lblPick = new JLabel("Pick a month, see a random day and date", JLabel.CENTER);

		
		slMonth.setPaintTicks(true);
		slMonth.setPaintLabels(true);
		slMonth.setMajorTickSpacing(1);
		slMonth.setMinorTickSpacing(1);
		JLabel lblDate = new JLabel("Here is your Day and Date: ", JLabel.CENTER)

	
		//adding the components to the frame.
		add(lblPick);
		add(slMonth);
		add(lblDate);
		add(lblNewDate);
		
		
		//listener
		slMonth.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent e)
			{
				updateTheDate();
				
			}
		});
		
		
	}

	public void updateTheDate()
	{
		monthNum = slMonth.getValue();
		dateMaker.setMonth(monthNum);
		String randDate = dateMaker.getRandomDate();
		lblNewDate.setText(randDate);
	}
		
}