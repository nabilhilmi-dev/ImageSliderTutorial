package com.nabil.imageslidertutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private String[] imageUrls = new String[]{
            "https://cdn.pixabay.com/photo/2019/11/05/20/36/abu-dhabi-4604499_1280.jpg",
            "https://cdn.pixabay.com/photo/2020/07/15/13/56/birds-5407779_1280.jpg",
            "https://cdn.pixabay.com/photo/2017/04/10/09/06/house-of-allah-2217859_1280.jpg",
            "https://cdn.pixabay.com/photo/2013/09/26/09/31/kaaba-186622_1280.jpg",
            "https://cdn.pixabay.com/photo/2016/11/22/22/50/blue-mosque-1851032_1280.jpg"

};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(this, imageUrls);
        viewPager.setAdapter(adapter);

    }
}