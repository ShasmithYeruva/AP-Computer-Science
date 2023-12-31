import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class S08AnimalDisplay extends JComponent implements ActionListener
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void test()
    {
        new S08AnimalDisplay();
    }
    
    public static void main(String[] args)
    {
        test();
    }

    private JFrame frame;
    private ArrayList<S08Animal> animals;

    public S08AnimalDisplay()
    {
        animals = randomList();

        frame = new JFrame("Animals");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 200));
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        frame.getContentPane().add(this);

        JButton button = new JButton("randomize");
        button.setActionCommand("randomize");
        button.addActionListener(this);
        frame.getContentPane().add(button);

        button = new JButton("count your chickens");
        button.setActionCommand("count your chickens");
        button.addActionListener(this);
        frame.getContentPane().add(button);

        button = new JButton("inventory");
        button.setActionCommand("inventory");
        button.addActionListener(this);
        frame.getContentPane().add(button);

        button = new JButton("pest control");
        button.setActionCommand("pest control");
        button.addActionListener(this);
        frame.getContentPane().add(button);

        button = new JButton("horsing around");
        button.setActionCommand("horsing around");
        button.addActionListener(this);
        frame.getContentPane().add(button);

        button = new JButton("feeling sheepish");
        button.setActionCommand("feeling sheepish");
        button.addActionListener(this);
        frame.getContentPane().add(button);

        frame.pack();
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        int totalWidth = S08HorsingAround.totalWidth(animals);
        int maxHeight = S08HorsingAround.tallestAnimal(animals).getHeight();
        double factor = Math.min((double)getWidth() / totalWidth,
                (double)getHeight() / maxHeight);
        int x = 0;
        for (int i = 0; i < animals.size(); i++)
        {
            S08Animal a = animals.get(i);
            int width = (int)(a.getWidth() * factor);
            int height = (int)(a.getHeight() * factor);
            int y = getHeight() - height;
            g.drawImage(a.getImage(), x, y, width, height, null);
            x += width;
        }
    }

    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        if (command.equals("randomize"))
            animals = randomList();
        else if (command.equals("count your chickens"))
            JOptionPane.showMessageDialog(this, S08HorsingAround.countYourChickens(animals) + " chickens");
        else if (command.equals("inventory"))
        {
            ArrayList<String> names = S08HorsingAround.inventory(animals);
            JOptionPane.showMessageDialog(this, names.toString());
        }
        else if (command.equals("pest control"))
            S08HorsingAround.pestControl(animals);
        else if (command.equals("horsing around"))
            S08HorsingAround.horsingAround(animals);
        else if (command.equals("feeling sheepish"))
            S08HorsingAround.feelingSheepish(animals);
        else
            throw new RuntimeException("invalid command:  " + command);
        repaint();
    }

    public static String randomImage()
    {
        int n = (int)(Math.random() * 1000);
        if (n < 386)
            return "mouse";
        else if (n < 579)
            return "chicken";
        else if (n < 707)
            return "pig";
        else if (n < 803)
            return "sheep";
        else if (n < 881)
            return "duck";
        else if (n < 945)
            return "horse";
        else if (n < 999)
            return "cow";
        else
            return "other";
    }

    public static ArrayList<S08Animal> randomList()
    {
        ArrayList<S08Animal> list = new ArrayList<S08Animal>();
        int n = (int)(Math.random() * 20) + 1;
        while (n > 0)
        {
            list.add(new S08Animal(randomImage()));
            n--;
        }
        return list;
    }
}