package com.galleria.artiste.service;

import com.galleria.artiste.exception.FileStorageException;
import com.galleria.artiste.exception.MyFileNotFoundException;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {

  /**
   * @param file The MultiPartFile object containing the file related data
   * @param suggestedFileName The suggested file name to use in disk
   * @return The file location
   * @throws FileStorageException
   */
  String storeFile(MultipartFile file, String suggestedFileName) throws FileStorageException;

  /**
   * @param fileName The name of file we're trying access
   * @return The Resource object of filename we provided
   * @throws MyFileNotFoundException
   */
  Resource loadFileAsResource(String fileName) throws MyFileNotFoundException;
}
