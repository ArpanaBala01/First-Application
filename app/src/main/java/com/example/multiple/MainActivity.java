package com.example.multiple;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void process(View view){
        Intent intent=null,chooser=null;

        if(view.getId()==R.id.button){

            intent=new Intent(android.content.Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:19.076, 72.877"));
            chooser=Intent.createChooser(intent, "Launch Maps");
            startActivity(chooser);
        }
        if(view.getId()==R.id.button2){

            intent=new Intent(android.content.Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://play.google.com/store/apps/details?id=com.nianticlabs.pokemongo&hl=en_IN&gl=US"));
            chooser=Intent.createChooser(intent, "Launch Market");
            startActivity(chooser);
        }
        if(view.getId()==R.id.button3){

            intent =new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to={"balaarpana5@gmail.com", "ujjwalgautam134@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL, to);
            intent.putExtra(Intent.EXTRA_SUBJECT, "Hey! this was sent from my app");
            intent.putExtra(Intent.EXTRA_TEXT, "Hi Whatsup! How are you doing? This is my first email message");
            intent.setType("message/rfc822");
            chooser=Intent.createChooser(intent, "Send Email");
            startActivity(chooser);
        }
    }
}