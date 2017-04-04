package com.akshay.facebookapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.login_button)
    LoginButton loginButton;

    @BindView(R.id.text_result)
    TextView textResult;


    private CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        FacebookSdk.sdkInitialize(getApplicationContext());

        callbackManager = CallbackManager.Factory.create();
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {

                //goToNext();
            }

            @Override
            public void onCancel() {

                textResult.setText("Login attempt cancelled.");

            }

            @Override
            public void onError(FacebookException error) {

                textResult.setText(error.getLocalizedMessage());

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
       if(AccessToken.getCurrentAccessToken() != null){

           goToNext();

       }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    private void goToNext(){

        Intent goNext = new Intent(MainActivity.this, FriendsListActivity.class);
        startActivity(goNext);

    }
}
