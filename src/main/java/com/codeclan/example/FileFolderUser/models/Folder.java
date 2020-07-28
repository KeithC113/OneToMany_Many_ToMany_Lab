package com.codeclan.example.FileFolderUser.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    @Column(name="title")
    private String title;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonIgnoreProperties({"folders"})
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    @JsonIgnoreProperties({"folders"})
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name="folders_files",
            joinColumns = {@JoinColumn(name = "folders_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name="file_id", nullable = false)}
    )

    private List<File> files;

    public Folder(String title, User user){
        this.title = title;
        this.user = user;
        this.files = new ArrayList<File>();
    }

    public Folder(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }

    public void addFile(File file) {this.files.add(file);}
}
