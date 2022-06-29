package com.vietmd.jsf_primefaces.uploadFile;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.file.UploadedFile;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class FileController {
        UploadedFile file;

        public UploadedFile getFile() {
            return file;
        }

        public void setFile(UploadedFile file) {
            this.file = file;
        }

        public void fileUploadListener(FileUploadEvent event){
            this.file = event.getFile();
            System.out.println("Uploaded File Name Is :: "+file.getFileName()+" :: Uploaded File Size :: "+file.getSize());
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("File upload successfully!"));
        }
}