package techmail.apptecnologia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Portal_HelpDesk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal__help_desk);

        WebView mywebview = (WebView) findViewById(R.id.webview
        );
        mywebview.getSettings().setJavaScriptEnabled(true);
        mywebview.loadUrl("https://tecnologia.techmail.com.br/portal");
        mywebview.setWebViewClient(new WebViewClient());

    }
}
