package edu.phoenix.mbl404.mbl404_group_project;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Debugging Tag.
    public final static String TAG = "[<<<------=== DEBUG ===------>>>]:  ";

    //Constants.

    //Activity Variables.

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
    }
}

/*


    List<RolodexLoader> rolodex = Contacts.rolodexList;
    Button button;



Button button = findViewById(R.id.button);

        final ClinicRolodexListAdapter adapter = new ClinicRolodexListAdapter(this, rolodex);

        final ListView listView = findViewById(R.id.list);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddContactActivity.class));
                Toast.makeText(MainActivity.this, "Input Data and Click Add", Toast.LENGTH_SHORT).show();
            }
        });

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final RolodexLoader contact = rolodex.get(position);

                PopupMenu popupMenu = new PopupMenu(MainActivity.this, listView);
                popupMenu.getMenuInflater().inflate(R.menu.menu_main, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.map: // View Clinic on Map and get Directions

//                                Intent intent = new Intent(this, YourActivity.class);
//                                startActivity(intent);

                                Toast.makeText(MainActivity.this,
                                        "Activity Not Set-Up Yet!", Toast.LENGTH_LONG).show();
                                return true;
                            case R.id.call: // Call Clinic
                                Intent phoneIntent = new Intent(Intent.ACTION_CALL);
                                phoneIntent.setData(Uri.parse("tel:"+contact.getPhone()));
                                if (ActivityCompat.checkSelfPermission(MainActivity.this,
                                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                                startActivity(phoneIntent);
                                return true;
                            case R.id.website: //Visit Clinic's Website
                                Intent intent = new Intent();
                                intent.setAction(Intent.ACTION_VIEW);
                                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                intent.setData(Uri.parse(contact.getWebsite()));
                                startActivity(intent);
                                return true;
                            default:
                                return false;
                        }
                    }
                });

                popupMenu.show();
            }
        });

    }
 */