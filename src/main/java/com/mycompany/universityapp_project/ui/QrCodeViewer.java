package com.mycompany.universityapp_project.ui;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class QrCodeViewer extends JFrame {
    
    // Frame components
    private JPanel panel;
    private JList<String> fileList;
    private DefaultListModel<String> listModel;
    private JLabel imageLabel;
    
    // Constructor for QrCodeViewer class
    public QrCodeViewer(String name, String folderPath) {
        super(name + " QR Code Viewer");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panel = new JPanel(new BorderLayout());
        listModel = new DefaultListModel<String>();
        fileList = new JList<String>(listModel);
        fileList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        fileList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedFileName = fileList.getSelectedValue();
                    if (selectedFileName != null) {
                        File selectedFile = new File(folderPath + File.separator + selectedFileName);
                        ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());
                        imageLabel.setIcon(icon);
                    }
                }
            }
        });
        JScrollPane listScrollPane = new JScrollPane(fileList);
        panel.add(listScrollPane, BorderLayout.WEST);
        imageLabel = new JLabel();
        panel.add(imageLabel, BorderLayout.CENTER);

        getContentPane().add(panel);
        setSize(440, 300);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public JLabel getImageLabel() {
        return imageLabel;
    }

    public DefaultListModel<String> getListModel() {
        return listModel;
    }
    
    public void updateList(String folderPath) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        SwingUtilities.invokeLater(() -> {
            listModel.clear(); 
            for (File file : files) {
                if (file.isFile()) {
                    listModel.addElement(file.getName());
                }
            }
        });
    }
}
