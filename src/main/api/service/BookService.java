package api.service;

import api.storage.bookStorage.BookStorageInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class BookService {
    private BookStorageInterface bookStorage;

    @Autowired
    public BookService(BookStorageInterface bookStorage) {
        this.bookStorage = bookStorage;
    }



}
