import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private JLabel Heading;
    Font font = new Font("", Font.BOLD, 12);

    private JPanel Mainpanel;
    private JLabel FirstnameLabel, LastnameLabel, EmailLabel, PasswordLabel;

    private JTextField Firstnametextfield;
    private JTextField Lastnametextfield;
    private JTextField EmailLabeltextfield;
    private JPasswordField Passwordlabeltextfield;
    private JButton submitbutton;

    private JButton resetbutton;

    //constructor
    public Window() {
        super.setTitle("Form");
        super.setSize(500, 400);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.createGui();
        this.AddSubmitActionlistener();
        super.setVisible(true);
        this.AddresetActionListener();
    }

    public void createGui() {
        this.setLayout(new BorderLayout());
        Heading = new JLabel("Registration Form");
        Heading.setFont(font);
        Heading.setHorizontalAlignment(JLabel.CENTER);
        this.add(Heading, BorderLayout.NORTH);

        //working with JPanel

        Mainpanel = new JPanel();

        //setting layout of main panel
        Mainpanel.setLayout(new GridLayout(4, 2));
        Mainpanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        FirstnameLabel = new JLabel("Firstname");
        FirstnameLabel.setFont(font);
        Firstnametextfield = new JTextField();
        Firstnametextfield.setFont(font);

        LastnameLabel = new JLabel("Lastname");
        LastnameLabel.setFont(font);
        Lastnametextfield = new JTextField();
        Lastnametextfield.setFont(font);

        EmailLabel = new JLabel("Email");
        EmailLabel.setFont(font);
        EmailLabeltextfield = new JTextField();
        EmailLabeltextfield.setFont(font);

        PasswordLabel = new JLabel("Password");
        PasswordLabel.setFont(font);
        Passwordlabeltextfield = new JPasswordField();
        Passwordlabeltextfield.setFont(font);

        submitbutton = new JButton("Submit");
        submitbutton.setFont(font);

        resetbutton = new JButton("Reset");
        resetbutton.setFont(font);

        Mainpanel.add(FirstnameLabel);
        Mainpanel.add(Firstnametextfield);

        Mainpanel.add(LastnameLabel);
        Mainpanel.add(Lastnametextfield);

        Mainpanel.add(EmailLabel);
        Mainpanel.add(EmailLabeltextfield);

        Mainpanel.add(PasswordLabel);
        Mainpanel.add(Passwordlabeltextfield);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitbutton);
        buttonPanel.add(resetbutton);

        this.add(Mainpanel, BorderLayout.CENTER);

        this.add(buttonPanel, BorderLayout.SOUTH);
    }
    private void AddSubmitActionlistener(){
        submitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String FirstName = Firstnametextfield.getText();
                String Lastname = Lastnametextfield.getText();
                String Email = EmailLabeltextfield.getText();
                char[] passwordChars =  Passwordlabeltextfield.getPassword();
                String Password = new String(passwordChars);

                // display the captured value
                System.out.println("Firstname: " + FirstName);
                System.out.println("Lastname: " + Lastname);
                System.out.println("Email: " + Email);
                System.out.println("Password: " + Password);

                //showMessageDialog
                DialogUtils dialogUtils = new DialogUtils();
                dialogUtils.showCaseDialog();

                //Exit Program
                System.exit(0);
            }
        });
    }
    private void AddresetActionListener(){
        resetbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFormFields();
            }
        });
    }
    private void clearFormFields(){
        Firstnametextfield.setText("");
        Lastnametextfield.setText("");
        EmailLabeltextfield.setText("");
        Passwordlabeltextfield.setText("");
    }
}


