Registration Form

This is a simple registration form application built using Java and Swing. It allows users to enter their personal information and submit the form. The application displays the captured values and shows a success message using a dialog box.

To run the application locally, follow these steps:

Clone the repository to your local machine.
Ensure you have Java and Swing installed.
Compile the Java source files using the appropriate commands.
Run the Main class to launch the registration form.

Usage :

Upon running the application, a registration form window will appear. Users can enter their first name, last name, email, and password. Clicking the "Submit" button will display the captured values and show a success message using a dialog box. The "Reset" button can be used to clear the form fields.

Features : 

Simple and intuitive user interface.
Captures and displays user information.
Success message displayed using a dialog box.
Form fields can be reset.

Technologies and Concepts Used : 

Java: The project is developed using the Java programming language.

Swing: The Swing library is used for creating the graphical user interface (GUI) of the registration form.

Inheritance: The Window class extends the JFrame class, utilizing inheritance to customize the frame for the registration form.

JPanel: The Mainpanel is a JPanel that contains the form elements and is added to the main frame.

JLabel: Various JLabel components are used to display text labels for the form fields and headings.

JTextField: JTextField components are used for user input fields such as first name, last name, and email.

JPasswordField: The JPasswordField is used to securely capture the user's password.

JButton: The submitbutton and resetbutton are JButton components for submitting and resetting the form, respectively.

ActionListener: ActionListener interfaces are implemented to handle button click events and perform actions such as form submission and field clearing.

DialogUtils: The DialogUtils class is used to display a dialog box showing a success message after form submission using JOptionPane.


Contributing:

Contributions to this project are welcome. If you have any ideas, suggestions, or bug fixes, please feel free to submit a pull request or open an issue.
