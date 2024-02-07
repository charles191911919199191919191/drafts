import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sheeeshhh extends JFrame {
    private DefaultListModel<String> toDoListModel;
    private JList<String> toDoList;
    private JTextField inputField;

    public sheeeshhh() {
        // Set up the frame
        setTitle("Simple To-Do App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);

        // Initialize the components
        toDoListModel = new DefaultListModel<>();
        toDoList = new JList<>(toDoListModel);
        inputField = new JTextField();
        JButton addButton = new JButton("Add");

        // Set the layout
        setLayout(new BorderLayout());

        // Add components to the frame
        add(new JScrollPane(toDoList), BorderLayout.CENTER);
        add(inputField, BorderLayout.PAGE_START);
        add(addButton, BorderLayout.PAGE_END);

        // Add ActionListener to the Add button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newItem = inputField.getText().trim();
                if (!newItem.isEmpty()) {
                    toDoListModel.addElement("[ ] " + newItem);
                    inputField.setText("");
                }
            }
        });

        // Add ActionListener to the JList to toggle checkbox status
        toDoList.addListSelectionListener(e -> {
            int selectedIndex = toDoList.getSelectedIndex();
            if (selectedIndex != -1) {
                String selectedItem = toDoListModel.getElementAt(selectedIndex);
                if (selectedItem.startsWith("[ ]")) {
                    toDoListModel.setElementAt("[X]" + selectedItem.substring(3), selectedIndex);
                } else {
                    toDoListModel.setElementAt("[ ]" + selectedItem.substring(3), selectedIndex);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new sheeeshhh().setVisible(true);
            }
        });
    }
}
