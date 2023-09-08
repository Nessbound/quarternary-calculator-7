import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
    private int firstNumber;
    private int secondNumber;
    private boolean showingOutput;
    private String toggleMode;
    private Quaternary quaternary;

    private char operator;

    private JButton btnAdd, btnSubtract, btnDivide, btnMultiply, btnClear,
            btnEquals, btnSquare, btnSquareRoot, btnToggle;
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
        JPanel row4 = new JPanel();

        // Initialization of Components
        toggleMode = "Quaternary";
        showingOutput = false;
        output = new JTextField(16);
        btnSubtract = new JButton("-");
        btnAdd = new JButton("+");
        btnDivide = new JButton("\u00F7");
        btnMultiply = new JButton("*");
        btnSquare = new JButton("\u00B2");
        btnSquareRoot = new JButton("R");
        btnEquals = new JButton("=");
        btnClear = new JButton("C");
        btnToggle = new JButton(toggleMode);

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
        btnToggle.setFont(new Font("Monospaced", Font.BOLD, 15));

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
        row4.setLayout(new BoxLayout(row4, BoxLayout.LINE_AXIS));

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
        row4.add(btnToggle);

        // Adding rows to the Main panel
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        mainPanel.add(output);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        mainPanel.add(row1);
        mainPanel.add(row2);
        mainPanel.add(row3);
        mainPanel.add(row4);

        // Functionality
        // For numbers
        for (int i = 0; i < numBtn.length; i++) {
            int finalI = i;
            numBtn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    showingOutput = false;
                    if (firstNumber == 0){
                        output.setText(null);
                    }
                    if(operator == '\0') {
                        String newFirstNumber = output.getText() + finalI;
                        output.setText(newFirstNumber);
                        firstNumber = Integer.parseInt(newFirstNumber);
                        System.out.println("First Num: " + firstNumber);
                    }
                    else {
                        if (secondNumber == 0){
                            output.setText(null);
                        }
                        String newSecondNumber = output.getText() + finalI;
                        output.setText(newSecondNumber);
                        secondNumber = Integer.parseInt(newSecondNumber);
                        System.out.println("Second Num: " + secondNumber);
                    }
                }
            });
        }

        // For Addition Subtraction
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
                handleOperatorClick('+');
            }
        });
        btnSubtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
                handleOperatorClick('-');

            }
        });

        // For Multiplication Division
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
                handleOperatorClick('*');
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
                // if (secondNumber == 0){
                //      output.setText("Err: /0");
                // }
                handleOperatorClick('/');
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

        // For Clear
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                output.setText("0");
                firstNumber = 0;
                secondNumber = 0;
            }
        });

        // For Equals
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                secondNumber = Integer.parseInt(output.getText());
                String firstNum = String.valueOf(firstNumber);
                String secondNum = String.valueOf(secondNumber);
                System.out.println(firstNum);
                System.out.println(secondNum);
                if (!firstNum.matches("[0123]+") || !secondNum.matches("[0123]+")){
                    output.setText("use btns");
                }
                else{
                    performOperation();
                }
                showingOutput = true;
            }
        });

        // For Toggle
        btnToggle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(toggleMode == "Quaternary") {
                    toggleMode = "Decimal";
                    btnToggle.setText(toggleMode);
                    if(showingOutput) {
                        int outputNum = Integer.parseInt(output.getText());
                        output.setText(Integer.toString(quaternary.quaternaryToDecimal(outputNum)));
                    }
                }
                else {
                    toggleMode = "Quaternary";
                    btnToggle.setText(toggleMode);
                    if(showingOutput) {
                        int outputNum = Integer.parseInt(output.getText());
                        output.setText(Integer.toString(quaternary.decimalToQuaternary(outputNum)));
                    }
                }
            }
        });

        // Making the Main panel visible
        this.add(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setSize(275,250);

    }
    private void handleOperatorClick(char op) {
        if (operator == '\0') {
            operator = op;
            String currentText = output.getText();
            firstNumber = Integer.parseInt(currentText);
            output.setText("0");
        } else {
            performOperation();
            operator = op;
        }
    }

    // Method to perform addition or subtraction
    private void performOperation() {
        quaternary = new Quaternary();
        if (operator == '+') {
            int result = quaternary.quaternaryAddition(firstNumber, secondNumber);
            if(toggleMode == "Quaternary") {
                output.setText(Integer.toString(result));
            }
            else {
                output.setText(Integer.toString(quaternary.quaternaryToDecimal(result)));
            }
        }
        else if (operator == '-') {
            int result = quaternary.quaternarySubtraction(firstNumber, secondNumber);
            if(toggleMode == "Quaternary") {
                output.setText(Integer.toString(result));
            }
            else {
                output.setText(Integer.toString(quaternary.quaternaryToDecimal(result)));
            }
        }
        else if (operator == '*') {
            int result = quaternary.quaternaryMultiplication(firstNumber, secondNumber);
            if(toggleMode == "Quaternary") {
                output.setText(Integer.toString(result));
            }
            else {
                output.setText(Integer.toString(quaternary.quaternaryToDecimal(result)));
            }
        }
        else if (operator == '/') {
            int result = quaternary.quaternaryDivision(firstNumber, secondNumber);
            if(toggleMode == "Quaternary") {
                output.setText(Integer.toString(result));
            }
            else {
                output.setText(Integer.toString(quaternary.quaternaryToDecimal(result)));
            }
        }
        operator = '\0';
    }


    public static void main(String[] args){
        new GUI();
    }
}

