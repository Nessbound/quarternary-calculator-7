import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
    private int firstNumber;
    private int secondNumber;

    private JButton btnAdd, btnSubtract, btnDivide, btnMultiply, btnClear,
            btnEquals, btnSquare, btnSquareRoot;
    private JButton[] numBtn;
    private JTextField output;
    //String previous, current, operator;

    public GUI() {
        super("Quaternary GUI");

        // Creation of main panel
        JPanel mainPanel = new JPanel();

        // Sub panels inside the main panel
        JPanel row1 = new JPanel();
        JPanel row2 = new JPanel();
        JPanel row3 = new JPanel();

        // Initialization of Components
        output = new JTextField(16);
        btnSubtract = new JButton("-");
        btnAdd = new JButton("+");
        btnDivide = new JButton("\u00F7");
        btnMultiply = new JButton("*");
        btnSquare = new JButton("\u00B2");
        btnSquareRoot = new JButton("R");
        btnEquals = new JButton("=");
        btnClear = new JButton("C");

        // Initialize, style, and add action listeners to number buttons
        numBtn = new JButton[4];
        for (int count = 0; count < numBtn.length; count++) {
            numBtn[count] = new JButton(String.valueOf(count));
            numBtn[count].setFont(new Font("Monospaced", Font.BOLD, 22));
        }

        // Styling of other buttons
        btnEquals.setFont(new Font("Monospaced", Font.BOLD, 22));
        btnAdd.setFont(new Font("Monospaced", Font.BOLD, 22));
        btnSubtract.setFont(new Font("Monospaced", Font.BOLD, 22));
        btnDivide.setFont(new Font("Monospaced", Font.BOLD, 22));
        btnMultiply.setFont(new Font("Monospaced", Font.BOLD, 22));
        btnSquare.setFont(new Font("Monospaced", Font.BOLD, 22));
        btnSquareRoot.setFont(new Font("Monospaced", Font.BOLD, 22));
        btnClear.setFont(new Font("Monospaced", Font.BOLD, 22));

        // Setting Clear and "_" button color
        btnClear.setBackground(Color.RED);
        btnEquals.setBackground(Color.GREEN);
        btnClear.setOpaque(true);
        btnEquals.setOpaque(true);

        // Styling of the OUTPUT display
        output.setMaximumSize(new Dimension(185, 40));
        output.setFont(new Font("Monospaced", Font.BOLD, 27));
        output.setDisabledTextColor(new Color(0, 0, 0));
        output.setMargin(new Insets(0, 5, 0, 0));
        output.setText("0");

        // Setting Layout of each row in the pane
        row1.setLayout(new BoxLayout(row1, BoxLayout.LINE_AXIS));
        row2.setLayout(new BoxLayout(row2, BoxLayout.LINE_AXIS));
        row3.setLayout(new BoxLayout(row3, BoxLayout.LINE_AXIS));

        // Add buttons to rows
        row1.add(btnAdd);
        row1.add(btnSubtract);
        row1.add(btnMultiply);
        row1.add(btnDivide);
        row2.add(numBtn[0]);
        row2.add(numBtn[1]);
        row2.add(btnSquareRoot);
        row2.add(btnSquare);
        row3.add(numBtn[2]);
        row3.add(numBtn[3]);
        row3.add(btnClear);
        row3.add(btnEquals);

        // Adding rows to the Main panel
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        mainPanel.add(output);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        mainPanel.add(row1);
        mainPanel.add(row2);
        mainPanel.add(row3);

        // Functionality
        // For numbers
        for (int i = 0; i < numBtn.length; i++) {
            int finalI = i;
            numBtn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (firstNumber == 0)
                        output.setText(null);
                    output.setText(output.getText() + finalI);
                    firstNumber += finalI;
                }
            });
        }

        // For Addition Subtraction
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
            }
        });
        btnSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
            }
        });

        // For Multiplication Division
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
            }
        });

        // For Square Square Root
        btnSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
            }
        });
        btnSquareRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
            }
        });

        // For Clear Equals
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                output.setText("0");
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        // Making the Main panel visible
        this.add(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setSize(275,225);

    }

    public static void main(String[] args){
        new GUI();
    }
}
