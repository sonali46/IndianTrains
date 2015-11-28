package com.example.manoj.indiantrains;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MapsActivity extends Activity {
    GridView grid;
    String[] web = {
            "Home",

            "Enquiry",
            "PNR_Cheacking",
            "Map",
            "Registration",
            "About",


    } ;
    int[] imageId = {
            R.drawable.home,
            R.drawable.enquiry,

            R.drawable.news,
            R.drawable.ma,
            R.drawable.direct,
            R.drawable.about,




    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mymap);

        CustomGrid adapter = new CustomGrid(MapsActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
               Toast.makeText(MapsActivity.this, "You Clicked at "+ web[position], Toast.LENGTH_SHORT).show();



                if(position==0)
                {

                    Intent ab=new Intent(MapsActivity.this,Home.class);
                    startActivity(ab);

                }
                if(position==1)
                {

                    Intent an=new Intent(MapsActivity.this,Enquiry.class);
                    startActivity(an);

                }
                if(position==2)
                {

                    Intent ac=new Intent(MapsActivity.this,News.class);
                    startActivity(ac);

                }

                if(position==3)
                {

                    Intent ad=new Intent(MapsActivity.this,Registration.class);
                    startActivity(ad);

                }
                if(position==4)
                {

                    Intent ae=new Intent(MapsActivity.this,MapsActivity2.class);
                    startActivity(ae);

                }
                if(position==5)
                {

                    Intent af=new Intent(MapsActivity.this,Abouts.class);
                    startActivity(af);

                }


            }
        });

    }

}