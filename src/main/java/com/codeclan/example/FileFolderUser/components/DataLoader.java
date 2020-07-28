package com.codeclan.example.FileFolderUser.components;

import com.codeclan.example.FileFolderUser.models.File;
import com.codeclan.example.FileFolderUser.models.Folder;
import com.codeclan.example.FileFolderUser.models.User;
import com.codeclan.example.FileFolderUser.repository.FileRepository;
import com.codeclan.example.FileFolderUser.repository.FolderRepository;
import com.codeclan.example.FileFolderUser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        User elliecampbell = new User("Ellie Campbell");
        userRepository.save(elliecampbell);

        User gregorcampbell = new User("Gregor Campbell");
        userRepository.save(gregorcampbell);

        User douglassmart = new User("Douglas Smart");
        userRepository.save(douglassmart);

        Folder finances = new Folder("Finances", elliecampbell);
        folderRepository.save(finances);

        Folder pocketmoney = new Folder("PocketMoney", gregorcampbell);
        folderRepository.save(pocketmoney);

        File housefinances = new File("House Finances", ".doc", 150, pocketmoney);
        fileRepository.save(housefinances);

        File budget = new File("Budget", ".xls", 25, finances);
        fileRepository.save(budget);

        finances.addFile(budget);
        finances.addFile(housefinances);
        folderRepository.save(finances);

        pocketmoney.addFile(budget);
        folderRepository.save(pocketmoney);

        elliecampbell.addFolders(pocketmoney);
        elliecampbell.addFolders(finances);
        userRepository.save(elliecampbell);


    }

}

