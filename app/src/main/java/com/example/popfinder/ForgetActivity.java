package com.example.popfinder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.popfinder.R;
import com.example.popfinder.databinding.ActivityForgetBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgetActivity extends AppCompatActivity {

    private ActivityForgetBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityForgetBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnBack.setOnClickListener(view -> {
            onBackPressed();
        });
        binding.btnForgetPassword.setOnClickListener(view -> {
            if (binding.newEmail.getText().toString() != "") {
                FirebaseAuth.getInstance()
                        .sendPasswordResetEmail(binding.newEmail.getText().toString().trim())
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    onBackPressed();
                                    Toast.makeText(ForgetActivity.this, "The mail has been send!", Toast.LENGTH_LONG).show();
                                } else {
                                    Exception e = task.getException();
                                    Toast.makeText(ForgetActivity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                                    Log.w("updateEmail", "Unable to update password", e);
                                }

                            }
                        });
            }
        });


    }
}