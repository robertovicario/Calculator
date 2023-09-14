package app.layout;

import javax.swing.*;
import java.awt.*;

/**
 * The App class represents the calculator application GUI.
 *
 * @author Roberto Vicario
 * @version 1.0
 */
public class App extends JFrame {
    private final JLabel jLabel1 = new JLabel("0");
    private final JLabel jLabel2 = new JLabel("ON");
    private final JRadioButton jRadioButton1 = new JRadioButton("ON/OFF");
    private final JPanel jPanel2 = new JPanel();
    private final JButton jButton1 = new JButton("AC");
    private final JButton jButton2 = new JButton("7");
    private final JButton jButton3 = new JButton("4");
    private final JButton jButton4 = new JButton("1");
    private final JButton jButton5 = new JButton("0");
    private final JButton jButton6 = new JButton("±");
    private final JButton jButton7 = new JButton("8");
    private final JButton jButton8 = new JButton("5");
    private final JButton jButton9 = new JButton("2");
    private final JButton jButton10 = new JButton("%");
    private final JButton jButton11 = new JButton("9");
    private final JButton jButton12 = new JButton("6");
    private final JButton jButton13 = new JButton("3");
    private final JButton jButton14 = new JButton(",");
    private final JButton jButton15 = new JButton("÷");
    private final JButton jButton16 = new JButton("×");
    private final JButton jButton17 = new JButton("-");
    private final JButton jButton18 = new JButton("+");
    private final JButton jButton19 = new JButton("=");

    /**
     * Constructs a new instance of the App class.
     */
    public App() {
        initComponents();
        initEvents();
    }

    /**
     * Initializes the components of the calculator GUI.
     */
    public void initComponents() {
        JPanel jPanel1 = new JPanel();
        JSeparator jSeparator1 = new JSeparator();

        jPanel2.setBorder(BorderFactory.createTitledBorder("Display"));

        jLabel1.setFont(new Font("", Font.PLAIN, 24));
        jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);

        jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);

        jRadioButton1.setSelected(true);

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addContainerGap())
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1)
                                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jRadioButton1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton15, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                                        .addComponent(jButton16, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton17, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton18, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton19, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton15, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton16, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton17, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton18, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton19, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 400));
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Initializes the event handlers for the calculator buttons.
     */
    public void initEvents() {
        // status
        jRadioButton1.addActionListener(e -> handleStatus(jRadioButton1.isSelected()));

        // AC
        jButton1.addActionListener(e -> {
            jLabel1.setText("0");
            if (!jLabel2.getText().equals("ON")) {
                jLabel2.setText("ON");
            }
        });

        // 7
        jButton2.addActionListener(e -> handleDigits("7"));

        // 4
        jButton3.addActionListener(e -> handleDigits("4"));

        // 1
        jButton4.addActionListener(e -> handleDigits("1"));

        // 0
        jButton5.addActionListener(e -> handleDigits("0"));

        // PM
        jButton6.addActionListener(e -> {
            String labelText = jLabel1.getText();
            if (!labelText.equals("0")) {
                if (labelText.contains("-")) {
                    jLabel1.setText(labelText.substring(1));
                } else {
                    jLabel1.setText("-" + labelText);
                }
            }
        });

        // 8
        jButton7.addActionListener(e -> handleDigits("8"));

        // 5
        jButton8.addActionListener(e -> handleDigits("5"));

        // 2
        jButton9.addActionListener(e -> handleDigits("2"));

        // percentage
        jButton10.addActionListener(e -> {
            double currentValue = Double.parseDouble(jLabel1.getText());
            double percentage = currentValue / 100.0;
            jLabel1.setText(String.valueOf(percentage));
        });

        // 9
        jButton11.addActionListener(e -> handleDigits("9"));

        // 6
        jButton12.addActionListener(e -> handleDigits("6"));

        // 3
        jButton13.addActionListener(e -> handleDigits("3"));

        // decimal
        jButton14.addActionListener(e -> {
            if (!jLabel1.getText().contains(".")) {
                handleDigits(".");
            }
        });

        // division
        jButton15.addActionListener(e -> {
            handleOperations("/");
            handleOperations("=");

            jLabel2.setText(jLabel1.getText() + "/");
            jLabel1.setText("0");
        });

        // multiplication
        jButton16.addActionListener(e -> {
            handleOperations("*");
            handleOperations("=");

            jLabel2.setText(jLabel1.getText() + "*");
            jLabel1.setText("0");
        });

        //subtraction
        jButton17.addActionListener(e -> {
            handleOperations("-");
            handleOperations("=");

            jLabel2.setText(jLabel1.getText() + "-");
            jLabel1.setText("0");
        });

        // sum
        jButton18.addActionListener(e -> {
            handleOperations("+");
            handleOperations("=");

            jLabel2.setText(jLabel1.getText() + "+");
            jLabel1.setText("0");
        });

        // equals
        jButton19.addActionListener(e -> {
            handleOperations("=");

            String sign = String.valueOf(jLabel2.getText().charAt(jLabel2.getText().length() - 1));
            double firstNum = Double.parseDouble(jLabel2.getText().substring(0, jLabel2.getText().length() - 1));
            double secondNum = Double.parseDouble(jLabel1.getText());
            double result = 0;

            switch (sign) {
                case "+" -> result = firstNum + secondNum;
                case "-" -> result = firstNum - secondNum;
                case "*" -> result = firstNum * secondNum;
                case "/" -> {
                    if (secondNum == 0) {
                        jLabel2.setText("DIVISION BY ZERO");
                        jLabel1.setText("ERROR");
                        throw new ArithmeticException();
                    } else {
                        result = firstNum / secondNum;
                    }
                }
            }

            jLabel2.setText(jLabel2.getText() + jLabel1.getText() + "=" + (result));
            jLabel1.setText(String.valueOf(result));
        });
    }

    /**
     * Handles the status change of the calculator.
     *
     * @param status the new status of the calculator
     */
    public void handleStatus(boolean status) {
        if (status) {
            jLabel1.setText("0");
            jLabel2.setText("ON");
        } else {
            jLabel1.setText("");
            jLabel2.setText("OFF");
        }

        jButton1.setEnabled(status);
        jButton2.setEnabled(status);
        jButton3.setEnabled(status);
        jButton4.setEnabled(status);
        jButton5.setEnabled(status);
        jButton6.setEnabled(status);
        jButton7.setEnabled(status);
        jButton8.setEnabled(status);
        jButton9.setEnabled(status);
        jButton10.setEnabled(status);
        jButton11.setEnabled(status);
        jButton12.setEnabled(status);
        jButton13.setEnabled(status);
        jButton14.setEnabled(status);
        jButton15.setEnabled(status);
        jButton16.setEnabled(status);
        jButton17.setEnabled(status);
        jButton18.setEnabled(status);
        jButton19.setEnabled(status);
    }

    /**
     * Handles the input of digit buttons.
     *
     * @param digit the digit value to be added to the display
     */
    public void handleDigits(String digit) {
        handlePostOperation();
        if (jLabel1.getText().length() < 7) {
            String currentText = jLabel1.getText();
            StringBuilder newText = new StringBuilder(currentText.length() + 1);

            if (!currentText.equals("0")) {
                newText.append(currentText);
            }

            newText.append(digit);
            jLabel1.setText(newText.toString());
        }
    }

    /**
     * Handles the validation of calculator operations.
     *
     * @param operation the operation to be validated
     */
    public void handleOperations(String operation) {
        if (jLabel2.getText().contains(operation)) {
            throw new RuntimeException();
        }
    }

    /**
     * Handles the reset of the calculator display after an operation.
     */
    public void handlePostOperation() {
        if (isPostOperation() || hasError()) {
            resetDisplay();
        }
    }

    /**
     * Checks if the calculator is in the post-operation state.
     *
     * @return true if the calculator is in the post-operation state, false otherwise
     */
    private boolean isPostOperation() {
        return jLabel2.getText().contains("=");
    }

    /**
     * Checks if the calculator has encountered an error.
     *
     * @return true if the calculator has encountered an error, false otherwise
     */
    private boolean hasError() {
        return jLabel1.getText().contains("ERROR");
    }

    /**
     * Resets the calculator display to its default state.
     */
    private void resetDisplay() {
        jLabel1.setText("0");
        jLabel2.setText("ON");
    }
}
