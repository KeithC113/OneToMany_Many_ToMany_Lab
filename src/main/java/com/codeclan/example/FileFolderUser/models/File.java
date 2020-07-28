package com.codeclan.example.FileFolderUser.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="files")

public class File{

    @Column(name = "name")
    private String name;

    @Column(name="extension")
    private String extension;

    @Column(name="size")
    private int size;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnoreProperties({"files"})
    @ManyToOne
    @JoinColumn(name="folder_id", nullable = false)
    private Folder folder;

    public File(String name, String extension, int size, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }

    public File(){

    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Folder getFolder() { return folder; }

    public void setFolder(Folder folder) { this.folder = folder; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
