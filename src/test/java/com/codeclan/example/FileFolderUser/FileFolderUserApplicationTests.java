package com.codeclan.example.FileFolderUser;

import com.codeclan.example.FileFolderUser.models.File;
import com.codeclan.example.FileFolderUser.models.Folder;
import com.codeclan.example.FileFolderUser.models.User;
import com.codeclan.example.FileFolderUser.repository.FileRepository;
import com.codeclan.example.FileFolderUser.repository.FolderRepository;
import com.codeclan.example.FileFolderUser.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FileFolderUserApplicationTests {

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void createUserAndFolderThenSave(){
//		User keithcampbell = new User("Keith Campbell");
//		userRepository.save(keithcampbell);
//		Folder temp = new Folder("House Finances", keithcampbell);
//		folderRepository.save(temp);
//	}
//
//	@Test
//	public void createFolderAndFileThenSave(){
//		User keithcampbell = new User("Keith Campbell");
//		userRepository.save(keithcampbell);
//
//		Folder tempfiles = new Folder("TempFiles", keithcampbell);
//		folderRepository.save(tempfiles);
//
//		File testfile = new File("Temp", ".txt", 125);
//		fileRepository.save(testfile);
//
//		tempfiles.addFile(testfile);
//		testfile.addFolder(tempfiles);
////		fileRepository.save(testfile);
//	}
}
