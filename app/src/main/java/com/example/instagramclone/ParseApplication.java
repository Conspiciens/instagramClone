package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        // Register your parse Models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("dXrKbx90VPBTWlz3MHh7cJaVKZtLAha5fJS0R897")
                .clientKey("IAUiZAxYUwsTWaYPC1tTj6PXV0QCYRdcJc8LpbP2")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
