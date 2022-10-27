/* Program: My summative Calculator
   Description: Can add, subtract, multiply, divide, square root, and
   power of two, with decimals and turn on and off.
   Name: Emma Villas
*/
//imports for the code to refer to a class
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

//all the components in the Jpanel (buttons, text fields, the panel itself)
public class JavaCalculator {
    private JPanel CalculatorSummative;
    private JButton BtnZero;
    private JButton BtnSix;
    private JButton BtnOne;
    private JButton BtnTwo;
    private JButton BtnNine;
    private JButton BtnEight;
    private JButton BtnPlus;
    private JButton BtnThree;
    private JButton BtnFour;
    private JButton BtnPosNeg;
    private JButton BtnMultiply;
    private JButton BtnDivide;
    private JButton BtnDecimal;
    private JButton BtnFive;
    private JButton BtnSeven;
    private JButton BtnOnOff;
    private JButton BtnSqRoot;
    private JButton BtnMinus;
    private JButton BtnExit;
    private JButton BtnPower;
    private JButton BtnClear;
    private JButton BtnEqual;
    private JPanel PanelTwo;
    private JTextField TxtDisplay;
    private JLabel LblImage;

    //variables for the equals and switch case
    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    //method for the calculator to function
    public JavaCalculator() {
        //Disables the calculators display
        TxtDisplay.setEnabled(false);

/*Each number button works the same, when it's pressed it is getting the text from the
display and adding the number to it
 */
        BtnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String One = TxtDisplay.getText() + BtnOne.getText();
                TxtDisplay.setText(One);
            }
        });
        BtnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Two = TxtDisplay.getText() + BtnTwo.getText();
                TxtDisplay.setText(Two);
            }
        });
        BtnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Three = TxtDisplay.getText() + BtnThree.getText();
                TxtDisplay.setText(Three);
            }
        });
        BtnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Four = TxtDisplay.getText() + BtnFour.getText();
                TxtDisplay.setText(Four);
            }
        });
        BtnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Five = TxtDisplay.getText() + BtnFive.getText();
                TxtDisplay.setText(Five);
            }
        });
        BtnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Six = TxtDisplay.getText() + BtnSix.getText();
                TxtDisplay.setText(Six);
            }
        });
        BtnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Seven = TxtDisplay.getText() + BtnSeven.getText();
                TxtDisplay.setText(Seven);
            }
        });
        BtnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Eight = TxtDisplay.getText() + BtnEight.getText();
                TxtDisplay.setText(Eight);
            }
        });
        BtnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nine = TxtDisplay.getText() + BtnNine.getText();
                TxtDisplay.setText(Nine);
            }
        });
        BtnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Zero = TxtDisplay.getText() + BtnZero.getText();
                TxtDisplay.setText(Zero);
            }
        });
        // Equal button
        BtnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //switch statement for each button (+,-,/,*) and does the calculation
               try{ switch (math_operator) {
                    case '+':
                        total2 = total1 + Double.parseDouble(TxtDisplay.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(TxtDisplay.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(TxtDisplay.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(TxtDisplay.getText());
                        break;
                }
                //resets the total
                TxtDisplay.setText(Double.toString(total2));
                total1 = 0;
               } catch (Exception exception) {
                   TxtDisplay.setText("Press clear and enter a number first");
               }
            }
        });
        BtnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //gets the text from the plus button and stores it then sends it to method get operator
                try{
                    String button_text = BtnPlus.getText();
                    getOperator(button_text);
                    } catch (Exception exception) {
                   TxtDisplay.setText("Press clear and enter a number first");
                }
            }
        });
        BtnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //gets the text from the minus button and stores it then sends it to method get operator
                try{
                String button_text = BtnMinus.getText();
                getOperator(button_text);
                } catch (Exception exception) {
                    TxtDisplay.setText("Press clear and enter a number first");
                }
            }
        });
        BtnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //gets the text from the multiply button and stores it then sends it to method get operator
                try{
                String button_text = BtnMultiply.getText();
                getOperator(button_text);
                } catch (Exception exception) {
                    TxtDisplay.setText("Press clear and enter a number first");
                }
                }
        });
        BtnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //gets the text from the divide button and stores it then sends it to method get operator
                try{
                String button_text = BtnDivide.getText();
                getOperator(button_text);
                } catch (Exception exception) {
                TxtDisplay.setText("Press clear and enter a number first");
            }
            }
        });
        //Adds a decimal to the already there text
        BtnDecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Decimal = TxtDisplay.getText() + BtnDecimal.getText();
                TxtDisplay.setText(Decimal);
            }
        });
        //using an integer and if statement, adds a negative symbol when pressed
        BtnPosNeg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int neg = 0;
                if (neg == 0) {
                    neg = 1;
                    TxtDisplay.setText("-");
                }
            }
        });
        //Power of 2 button
        BtnPower.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
// Creates a string and gets the text from the display, then displays the answer using java math.pow method
                try {
                    String Power = TxtDisplay.getText();
                    TxtDisplay.setText(String.valueOf(Math.pow(Double.parseDouble(Power), 2)));
                } catch (Exception exception) {
                    TxtDisplay.setText("Press clear and enter a number first");
                }
            }

        });
// Creates a string and gets the text from the display, then displays the answer using java math. sqrt method
        BtnSqRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Creates
                try {
                    String sqrt = TxtDisplay.getText();
                    TxtDisplay.setText(String.valueOf(Math.sqrt(Double.parseDouble((sqrt)))));
                } catch (Exception exception) {
                    TxtDisplay.setText("Press clear and enter a number first");
                }
            }
        });
        // Resets the calculator by resetting the total to 2 and the display empty
        BtnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                TxtDisplay.setText("");
            }
        });
        // On and off button using an integer and if statement
        BtnOnOff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int status = 0;
                if (status == 0) {
                    // If clicked then set the text as off and disable all buttons and textfield is set to clear
                    status = 1;
                    BtnOnOff.setText("Off");
                    BtnOne.setEnabled(false);
                    BtnTwo.setEnabled(false);
                    BtnThree.setEnabled(false);
                    BtnFour.setEnabled(false);
                    BtnFive.setEnabled(false);
                    BtnSix.setEnabled(false);
                    BtnSeven.setEnabled(false);
                    BtnEight.setEnabled(false);
                    BtnNine.setEnabled(false);
                    BtnZero.setEnabled(false);
                    BtnClear.setEnabled(false);
                    BtnDecimal.setEnabled(false);
                    BtnPlus.setEnabled(false);
                    BtnEqual.setEnabled(false);
                    TxtDisplay.setEnabled(false);
                    TxtDisplay.setText("");
                    BtnOnOff.setEnabled(false);
                    BtnPosNeg.setEnabled(false);
                    BtnSqRoot.setEnabled(false);
                    BtnPower.setEnabled(false);
                    BtnMinus.setEnabled(false);
                    BtnMultiply.setEnabled(false);
                    BtnDivide.setEnabled(false);
                } else if (status == 1) {
                    status = 0;
// When pressed again set the text on the button and enables all the buttons
                    BtnOnOff.setText("On");
                    BtnOne.setEnabled(true);
                    BtnTwo.setEnabled(true);
                    BtnThree.setEnabled(true);
                    BtnFour.setEnabled(true);
                    BtnFive.setEnabled(true);
                    BtnSix.setEnabled(true);
                    BtnSeven.setEnabled(true);
                    BtnEight.setEnabled(true);
                    BtnNine.setEnabled(true);
                    BtnZero.setEnabled(true);
                    BtnClear.setEnabled(true);
                    BtnDecimal.setEnabled(true);
                    BtnEqual.setEnabled(true);
                    BtnPlus.setEnabled(true);
                    TxtDisplay.setEnabled(true);
                    BtnOnOff.setEnabled(true);
                    BtnPosNeg.setEnabled(true);
                    BtnSqRoot.setEnabled(true);
                    BtnPower.setEnabled(true);
                    BtnMinus.setEnabled(true);
                    BtnMultiply.setEnabled(true);
                    BtnDivide.setEnabled(true);
                }
            }
        });
        //Exit buttons
        BtnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    //sets the Jframe up and makes it visible
    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().CalculatorSummative);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    // Method getoperator is a void method but executes code (string BtnText is from the button that was clicked)
    private void getOperator(String BtnText) {
        // Converts the string to a character
        math_operator = BtnText.charAt(0);
        total1 = total1 + Double.parseDouble(TxtDisplay.getText());
        TxtDisplay.setText("");
    }

    //Sets the image up and displays it
    private void createUIComponents() {
        // TODO: place custom component creation code here
        LblImage = new JLabel(new ImageIcon("/Users/emma/IdeaProjects/SummativeCalculator/src/plant1.gif"));
    }
}
