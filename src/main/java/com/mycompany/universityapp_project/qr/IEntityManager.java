package com.mycompany.universityapp_project.qr;

public interface IEntityManager {
    public String getFilePath();
    public String getFolderPath();
    public void generateQrCode(Object object, Runnable afterGeneration);    
    public void deleteQrCode(String fileName);
}
