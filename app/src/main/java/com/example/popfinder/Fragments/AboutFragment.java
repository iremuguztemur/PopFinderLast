package com.example.popfinder.Fragments;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.example.popfinder.Adapter.AboutAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.popfinder.Adapter.HelpAdapter;
import com.example.popfinder.R;
import com.example.popfinder.databinding.FragmentHelpBinding;
import com.google.firebase.firestore.Query;


public class AboutFragment extends Fragment {

    private FragmentHelpBinding binding;
    private RecyclerView recyclerView;
    private AboutAdapter adapter;
    private Query query;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHelpBinding.inflate(inflater,container,false);
       // ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Hakkımızda");


     //   recyclerView.setAdapter(adapter);

        return binding.getRoot();
    }
}

