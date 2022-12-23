package com.example.applestore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.applestore.Fragments.AppleWatchFragment;
import com.example.applestore.Fragments.HomeFragment;
import com.example.applestore.Fragments.MoreFragment;
import com.example.applestore.FragmentsForActivity.MacbookFragment_Activity;
import com.example.applestore.FragmentsForActivity.PhonesFragment_Activity;
import com.example.applestore.FragmentsForActivity.TesteFragment;
import com.example.applestore.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new TesteFragment());


        binding.bottomNavigation.setOnItemSelectedListener(item ->{
            switch (item.getItemId()){
                case R.id.Home:
                    replaceFragment(new TesteFragment());
                    break;
                case R.id.Phones:
                    replaceFragment(new PhonesFragment_Activity());
                    break;
                case R.id.Macbook:
                    replaceFragment(new MacbookFragment_Activity());
                    break;
                case R.id.AppleWatch:
                    replaceFragment(new AppleWatchFragment());
                    break;
                case R.id.More:
                    replaceFragment(new MoreFragment());
                    break;
            }

            return true;
        });

        Fragment fragment = HomeFragment.newInstance();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, fragment,"HomeFragment");
        fragmentTransaction.commit();



    }
    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();


    }
}