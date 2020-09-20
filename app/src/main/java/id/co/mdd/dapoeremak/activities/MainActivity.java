package id.co.mdd.dapoeremak.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.co.mdd.dapoeremak.R;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.home)
    Menu btnHome;

    @BindView(R.id.history)
    Menu btnHistory;

    @BindView(R.id.profile)
    Menu btnProfile;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        initFragment(new HomeFragment());

    }

    private void initFragment(Fragment classFragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentLayout, classFragment);
        transaction.commit();

    }
}