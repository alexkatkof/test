import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener // Создаем класс с расширением JFrame для формы
{
    public JPanel panel; // Создаем панель
    public double fromtext, fromtext2;
    public int oper;
    public int checker = 0;
    JTextArea text = new JTextArea();

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // Выясняем размеры дисплея
    int scrH = screenSize.height; // Высота дисплея
    int scrW = screenSize.width; // Ширина дисплея
    int W = 300; // Ширина панели
    int H = 400; // Высота панели

    public void initpanel ()
    {
        panel = new JPanel(); // Создаем панель
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setLayout(null);

        text.setEditable(false);
        panel.add(text);
        text.setBounds(0, 20, 300, 130);
        text.setLineWrap(true);

        JButton b1 = new JButton("="); // Создаем кнопку
        JButton b2 = new JButton("C");

        JButton numdot = new JButton(".");
        JButton num0 = new JButton("0");
        JButton num1 = new JButton();
        num1.setActionCommand("1");
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/one.png"));
            Image newimg1 = img1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
            num1.setIcon(new ImageIcon(newimg1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        JButton num2 = new JButton();
        num2.setActionCommand("2");
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/two.png"));
            Image newimg1 = img1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
            num2.setIcon(new ImageIcon(newimg1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        JButton num3 = new JButton();
        num3.setActionCommand("3");
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/three.png"));
            Image newimg1 = img1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
            num3.setIcon(new ImageIcon(newimg1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        JButton num4 = new JButton();
        num4.setActionCommand("4");
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/four.png"));
            Image newimg1 = img1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
            num4.setIcon(new ImageIcon(newimg1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        JButton num5 = new JButton();
        num5.setActionCommand("5");
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/five.png"));
            Image newimg1 = img1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
            num5.setIcon(new ImageIcon(newimg1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        JButton num6 = new JButton();
        num6.setActionCommand("6");
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/six.png"));
            Image newimg1 = img1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
            num6.setIcon(new ImageIcon(newimg1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        JButton num7 = new JButton();
        num7.setActionCommand("7");
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/seven.png"));
            Image newimg1 = img1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
            num7.setIcon(new ImageIcon(newimg1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        JButton num8 = new JButton();
        num8.setActionCommand("8");
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/eight.png"));
            Image newimg1 = img1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
            num8.setIcon(new ImageIcon(newimg1));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        JButton num9 = new JButton();
        num9.setActionCommand("9");
        try {
            Image img1 = ImageIO.read(getClass().getResource("resources/nine.png"));
            Image newimg1 = img1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
            num9.setIcon(new ImageIcon(newimg1));
        } catch (Exception ex) {
            System.out.println(ex);
        }

        JButton numplus = new JButton("+");
        JButton numminus = new JButton("-");
        JButton nummult = new JButton("*");
        JButton numdivide = new JButton("/");
        JButton numstepen = new JButton("^");
        JButton numprocent = new JButton("%");

        panel.setPreferredSize(new Dimension(W, H)); // Задаем ширину и высоту
        panel.setBackground(Color.cyan); // Задаем цвет background

        panel.add(b1); // Добавляем кнопку на панель
        b1.setBounds(200, 350, 100, 50);
        b1.setBackground(Color.white);
        b1.addActionListener(this);
        panel.add(b2);
        b2.setBounds(200, 150, 50, 50);
        b2.addActionListener(this);

        panel.add(numdot);
        numdot.setBounds(150, 350, 50, 50);
        numdot.addActionListener(this);
        panel.add(num0);
        num0.setBounds(50, 350, 100, 50);
        num0.addActionListener(this);
        panel.add(num1);
        num1.setBounds(50, 300, 50, 50);
        num1.addActionListener(this);
        panel.add(num2);
        num2.setBounds(100, 300, 50, 50);
        num2.addActionListener(this);
        panel.add(num3);
        num3.setBounds(150, 300, 50, 50);
        num3.addActionListener(this);
        panel.add(num4);
        num4.setBounds(50, 250, 50, 50);
        num4.addActionListener(this);
        panel.add(num5);
        num5.setBounds(100, 250, 50, 50);
        num5.addActionListener(this);
        panel.add(num6);
        num6.setBounds(150, 250, 50, 50);
        num6.addActionListener(this);
        panel.add(num7);
        num7.setBounds(50, 200, 50, 50);
        num7.addActionListener(this);
        panel.add(num8);
        num8.setBounds(100, 200, 50, 50);
        num8.addActionListener(this);
        panel.add(num9);
        num9.setBounds(150, 200, 50, 50);
        num9.addActionListener(this);

        panel.add(numplus);
        numplus.setBounds(200, 300, 50, 50);
        numplus.addActionListener(this);
        panel.add(numminus);
        numminus.setBounds(250, 300, 50, 50);
        numminus.addActionListener(this);
        panel.add(nummult);
        nummult.setBounds(200, 250, 50, 50);
        nummult.addActionListener(this);
        panel.add(numdivide);
        numdivide.setBounds(250, 250, 50, 50);
        numdivide.addActionListener(this);
        panel.add(numstepen);
        numstepen.setBounds(200, 200, 50, 50);
        numstepen.addActionListener(this);
        panel.add(numprocent);
        numprocent.setBounds(250, 200, 50, 50);
        numprocent.addActionListener(this);

        add (panel); // Отображаем
    }
    public void actionPerformed(ActionEvent event)
    {
        String source = event.getActionCommand();
        switch (source)
        {
            default: System.out.println("clicked but no command");
                break;
            case "0":
                switch(checker)
                {
                    case 0:
                        text.setText(text.getText()+"0");
                        fromtext2 = Double.valueOf(text.getText());
                        break;
                    case 1:
                        text.setText("");
                        text.setText(text.getText()+"0");
                        fromtext2 = Double.valueOf(text.getText());
                        checker = 0;
                        break;
                }
                break;
            case "1":
                switch(checker)
                {
                    case 0:
                        text.setText(text.getText()+"1");
                        fromtext2 = Double.valueOf(text.getText());
                        break;
                    case 1:
                        text.setText("");
                        text.setText(text.getText()+"1");
                        fromtext2 = Double.valueOf(text.getText());
                        checker = 0;
                        break;
                }
                break;
            case "2":
                switch(checker)
                {
                    case 0:
                        text.setText(text.getText()+"2");
                        fromtext2 = Double.valueOf(text.getText());
                        break;
                    case 1:
                        text.setText("");
                        text.setText(text.getText()+"2");
                        fromtext2 = Double.valueOf(text.getText());
                        checker = 0;
                        break;
                }
                break;
            case "3":
                switch(checker)
                {
                    case 0:
                        text.setText(text.getText()+"3");
                        fromtext2 = Double.valueOf(text.getText());
                        break;
                    case 1:
                        text.setText("");
                        text.setText(text.getText()+"3");
                        fromtext2 = Double.valueOf(text.getText());
                        checker = 0;
                        break;
                }
                break;
            case "4":
                switch(checker)
                {
                    case 0:
                        text.setText(text.getText()+"4");
                        fromtext2 = Double.valueOf(text.getText());
                        break;
                    case 1:
                        text.setText("");
                        text.setText(text.getText()+"4");
                        fromtext2 = Double.valueOf(text.getText());
                        checker = 0;
                        break;
                }
                break;
            case "5":
                switch(checker)
                {
                    case 0:
                        text.setText(text.getText()+"5");
                        fromtext2 = Double.valueOf(text.getText());
                        break;
                    case 1:
                        text.setText("");
                        text.setText(text.getText()+"5");
                        fromtext2 = Double.valueOf(text.getText());
                        checker = 0;
                        break;
                }
                break;
            case "6":
                switch(checker)
                {
                    case 0:
                        text.setText(text.getText()+"6");
                        fromtext2 = Double.valueOf(text.getText());
                        break;
                    case 1:
                        text.setText("");
                        text.setText(text.getText()+"6");
                        fromtext2 = Double.valueOf(text.getText());
                        checker = 0;
                        break;
                }
                break;
            case "7":
                switch(checker)
                {
                    case 0:
                        text.setText(text.getText()+"7");
                        fromtext2 = Double.valueOf(text.getText());
                        break;
                    case 1:
                        text.setText("");
                        text.setText(text.getText()+"7");
                        fromtext2 = Double.valueOf(text.getText());
                        checker = 0;
                        break;
                }
                break;
            case "8":
                switch(checker)
                {
                    case 0:
                        text.setText(text.getText()+"8");
                        fromtext2 = Double.valueOf(text.getText());
                        break;
                    case 1:
                        text.setText("");
                        text.setText(text.getText()+"8");
                        fromtext2 = Double.valueOf(text.getText());
                        checker = 0;
                        break;
                }
                break;
            case "9":
                switch(checker)
                {
                    case 0:
                        text.setText(text.getText()+"9");
                        fromtext2 = Double.valueOf(text.getText());
                        break;
                    case 1:
                        text.setText("");
                        text.setText(text.getText()+"9");
                        fromtext2 = Double.valueOf(text.getText());
                        checker = 0;
                        break;
                }
                break;
            case "=": System.out.println("=");
                switch (oper)
                {
                    case 1: fromtext=fromtext+fromtext2;
                        break;
                    case 2: fromtext=fromtext-fromtext2;
                        break;
                    case 3: fromtext=fromtext*fromtext2;
                        break;
                    case 4: fromtext=fromtext/fromtext2;
                        break;
                    case 5:

                        break;
                    case 6: fromtext=Math.pow(fromtext, fromtext2);
                        break;
                }
                text.setText(String.valueOf(fromtext));
                break;
            case "+":
                System.out.println("+");
                if (!text.getText().trim().isEmpty())
                {
                    fromtext = Double.valueOf(text.getText());
                    checker = 1;
                    oper = 1;
                    break;
                }
                break;
            case "-":
                System.out.println("-");
                if (!text.getText().trim().isEmpty())
                {
                    fromtext = Double.valueOf(text.getText());
                    checker = 1;
                    oper = 2;
                    break;
                }
                break;
            case "*":
                System.out.println("*");
                if (!text.getText().trim().isEmpty())
                {
                    fromtext = Double.valueOf(text.getText());
                    checker = 1;
                    oper = 3;
                    break;
                }
                break;
            case "/":
                System.out.println("/");
                if (!text.getText().trim().isEmpty())
                {
                    fromtext = Double.valueOf(text.getText());
                    checker = 1;
                    oper = 4;
                    break;
                }
                break;
            case "%":
                System.out.println("%");
                if (!text.getText().trim().isEmpty())
                {
                    switch (oper)
                    {
                        case 1:fromtext=fromtext+(fromtext/100*fromtext2);

                            break;
                        case 2:fromtext=fromtext-(fromtext/100*fromtext2);

                            break;
                        case 3:fromtext=fromtext*(fromtext/100*fromtext2);

                            break;
                        case 4:fromtext=fromtext/(fromtext/100*fromtext2);

                            break;
                        case 6:
                            fromtext=0;
                            System.out.println("Case 6 for %");
                            break;
                    }
                    text.setText(String.valueOf(fromtext));
                    checker = 1;
                    break;
                }
                break;
            case "^":
                System.out.println("^");
                if (!text.getText().trim().isEmpty())
                {
                    fromtext = Double.valueOf(text.getText());
                    checker = 1;
                    oper = 6;
                    break;
                }
                break;
            case ".":
                text.setText(text.getText()+".");
                break;
            case "C":
                System.out.println("C");
                text.setText("");
                fromtext = 0;
                fromtext2 = 0;
                checker = 0;
                break;

        }
    }
    public static void main(String[] args)
    {
        new Main();
    }
    public Main() // Инициируем панель и фрейм
    {
        initpanel();
        initFrame();
    }

    public void initFrame()
    {
        Font font = new Font("Verdana", Font.PLAIN, 11);
        JMenuItem openItem = new JMenuItem("Открыть");
        openItem.setFont(font);
        JMenu fileMenu = new JMenu("Меню");
        fileMenu.setFont(font);
        JMenu NMenu = new JMenu("New");
        fileMenu.add(NMenu);
        fileMenu.add(openItem);
        JMenuItem txtFileItem = new JMenuItem("Text file");
        NMenu.add(txtFileItem);
        JMenuItem txtFileItem1 = new JMenuItem("Text file1");
        NMenu.add(txtFileItem1);
        txtFileItem.setFont(font);
        NMenu.setFont(font);
        NMenu.add(txtFileItem);
        JMenuBar menuBar = new JMenuBar();
        JMenuItem closeItem = new JMenuItem("Закрыть");
        closeItem.setFont(font);
        fileMenu.add(closeItem);

        JMenuItem closeAllItem = new JMenuItem("Закрыть все");
        closeAllItem.setFont(font);
        fileMenu.add(closeAllItem);

        fileMenu.addSeparator(); // разделитель

        JMenuItem exitItem = new JMenuItem("Выход");
        exitItem.setFont(font);
        fileMenu.add(exitItem);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Калькулятор");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setLocation((scrW / 2)-(W/2), (scrH / 2)-(H/2));
        pack();
    }
}




