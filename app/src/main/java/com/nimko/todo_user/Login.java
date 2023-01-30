package com.nimko.todo_user;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.google.android.material.textfield.TextInputEditText;
import com.nimko.todo_user.databinding.FragmentLoginBinding;
import com.nimko.todo_user.model.Role;
import com.nimko.todo_user.model.User;
import com.nimko.todo_user.util.Storage;

public class Login extends Fragment {
    private FragmentLoginBinding binding;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate(inflater,container,false);

        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = binding.editTextTextPersonName.getText().toString();
                String password = binding.editTextTextPassword.getText().toString();
                Storage.user = new User("",userName,password, Role.USER);

                NavHostFragment.findNavController(Login.this).
                        navigate(R.id.action_login4_to_FirstFragment);
            }
        });
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}