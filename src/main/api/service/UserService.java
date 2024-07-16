package api.service;

import api.storage.userStorage.UserStorageInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    private UserStorageInterface userStorage;

    @Autowired
    public UserService (UserStorageInterface userStorage) {
        this.userStorage = userStorage;
    }
}
