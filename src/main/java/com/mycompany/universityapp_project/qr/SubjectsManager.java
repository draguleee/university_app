/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universityapp_project.qr;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.mycompany.universityapp_project.model.Subject;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

/**
 *
 * @author aandr
 */
public class SubjectsManager implements IEntityManager {
    
    // Instance variables
    private String filePath;
    private String folderPath = "C:\\Users\\aandr\\source\\repos\\ssatr_lab\\laboratoare-ssatr-ia-2023-draguleee\\universityapp_project\\qr\\subjects\\";
    
    // Implementation for getFilePath() method (from IEntityManager interface)
    @Override
    public String getFilePath() { return filePath; }
    
    // Implementation for getFolderPath() method (from IEntityManager interface)
    @Override
    public String getFolderPath() { return folderPath; }
    
    // Implementation for generateQrCode() method (from IEntityManager interface)
    @Override
    public void generateQrCode(Object object, Runnable afterGeneration) {
        new Thread(() ->{
            if (object instanceof Subject) {
            QRCodeWriter barcodeWriter = new QRCodeWriter();
            try {
                BitMatrix bitMatrix = barcodeWriter.encode(object.toString(), BarcodeFormat.QR_CODE, 300, 300);
                BufferedImage bi = MatrixToImageWriter.toBufferedImage(bitMatrix);
                filePath = folderPath + "subject_" + ((Subject)object).getSubjectId() + ".png";
                ImageIO.write(bi, "png", new File(filePath));
                if (afterGeneration != null) {
                    SwingUtilities.invokeLater(afterGeneration);
                }
            } catch (WriterException | IOException e) {
                throw new RuntimeException(e);
            }  
        }
        }).start();
    }
    
    // Implementation for deleteQrCode() method (from IEntityManager interface)
    @Override
    public void deleteQrCode(String fileName) {
        filePath = folderPath + "subject_" + fileName + ".png";
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("File deleted successfully: " + filePath);
        } else {
            System.out.println("Failed to delete the file: " + filePath);
        }
    }
}
