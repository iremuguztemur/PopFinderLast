package com.example.popfinder.Fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.popfinder.R;
import com.example.popfinder.databinding.FragmentHelpBinding;

/**
 * A fragment representing a list of Items.
 */
public class HelpFragment extends Fragment {

    private FragmentHelpBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentHelpBinding.inflate(inflater,container,false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Yardım");

        return binding.getRoot();
    }
}