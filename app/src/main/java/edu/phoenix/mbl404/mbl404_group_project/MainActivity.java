package edu.phoenix.mbl404.mbl404_group_project;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Constants.
    private static final int ERROR_DIALOG_REQUEST = 9001;
    public static final String SHARED_PREFERENCES = "SharedPreferences";
    public static final String TITLE_KEY = "title";

    //Activity Variables.
    public static List<String> savedData = new ArrayList<>();

    //Layout Variables.
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Java-XML linking.
        tabLayout = findViewById(R.id.tablayout_id);
        appBarLayout = findViewById(R.id.appbarid);
        viewPager = findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentSearch(), "Search");
        adapter.AddFragment(new FragmentSavedList(), "Saved Clinics");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        if(playServiceCheck()){
            execute();
        }
    }

    private void execute(){ }

    public boolean playServiceCheck(){
        int available = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(MainActivity.this);
        if(available == ConnectionResult.SUCCESS){
            return true;
        } else if (GoogleApiAvailability.getInstance().isUserResolvableError(available)){
            Dialog dialog = GoogleApiAvailability.getInstance().getErrorDialog(MainActivity.this, available, ERROR_DIALOG_REQUEST);
            dialog.show();
        } else {
            Toast.makeText(this, "You cannot make map requests", Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}