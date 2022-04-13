package com.example.popfinder;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class deneme123 extends AppCompatActivity {

    Button btn_veri_gonder;

    FirebaseFirestore firebaseFirestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deneme123);

        btn_veri_gonder = findViewById(R.id.btn_veri_gonder);
        firebaseFirestore = FirebaseFirestore.getInstance();

        Map<String, Object> bilgilerNesnesi = new HashMap<>();
        bilgilerNesnesi.put("Isim", "irem");
        bilgilerNesnesi.put("Adres", "darica");
        bilgilerNesnesi.put("Yas", 24);
        bilgilerNesnesi.put("isActive", false);

        btn_veri_gonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseFirestore.collection("guide")
                        .add(bilgilerNesnesi)
                        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                            @Override
                            public void onSuccess(DocumentReference documentReference) {
                                Toast.makeText(deneme123.this, "Verimiz VT'a yazdırıldı", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(deneme123.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });
    }
}