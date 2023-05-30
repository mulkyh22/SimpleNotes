package com.app.simplenotes.ui.info;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.app.simplenotes.ui.info.InfoViewModel;
import com.app.simplenotes.R;
import com.app.simplenotes.databinding.FragmentInfoBinding;


public class InfoFragment extends Fragment {
    private FragmentInfoBinding binding;
    private InfoViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentInfoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(this).get(InfoViewModel.class);

        binding.setViewModel(viewModel);
        binding.setTitle(getString(R.string.info_title));
        binding.setDescription(getString(R.string.info_description));
        binding.executePendingBindings();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

//Signature :
//10120146 - Irshal Mulky H - IF4
