/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject.hotelpulse;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.FirebaseDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author thanapon
 */
public class FireBaseService {
    private final FirebaseDatabase db;
    
    public FireBaseService() throws IOException {
        File file = new File(getClass().getClassLoader().getResource("serviceAccountKey.json").getFile());
        FileInputStream serviceAccount = new FileInputStream(file);

        FirebaseOptions options = new FirebaseOptions.Builder()
          .setCredentials(GoogleCredentials.fromStream(serviceAccount))
          .setDatabaseUrl("https://hotelpulse-ba3bd-default-rtdb.asia-southeast1.firebasedatabase.app")
          .build();

        if (FirebaseApp.getApps().isEmpty()) {
            FirebaseApp.initializeApp(options);
        }
        
        db = FirebaseDatabase.getInstance();
    }

    /**
     * @return the db
     */
    public FirebaseDatabase getDb() {
        return db;
    }
}
