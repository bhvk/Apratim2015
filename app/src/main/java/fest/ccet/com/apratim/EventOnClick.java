package fest.ccet.com.apratim;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class EventOnClick extends Activity {

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_onclick);

        WebView mwebview = (WebView) findViewById(R.id.webView1);
        //wv1.getSettings().setLoadWithOverviewMode(true);
        //wv1.getSettings().setUseWideViewPort(true);
        /*Bundle bundle = this.getIntent().getExtras();
        String position = bundle.getString("childPosition");
        if(position=="Street play")*/
        mwebview.getSettings().setJavaScriptEnabled(true);
        mwebview.setWebViewClient(new WebViewClient());

        Intent i = new Intent();


         if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("STREET")==0) {
            mwebview.loadUrl("file:///android_asset/street.html");
        } else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("STAGE")==0) {
            mwebview.loadUrl("file:///android_asset/stage.html");
        } else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("AD")==0) {
            mwebview.loadUrl("file:///android_asset/admad.html");
        } else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("MIME")==0) {
            mwebview.loadUrl("file:///android_asset/mime.html");
        }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("SHORTMOVIE")==0) {
            mwebview.loadUrl("file:///android_asset/shortmovie.html");
        } else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("SKIT")==0) {
            mwebview.loadUrl("file:///android_asset/skit.html");
        }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("GD")==0) {
            mwebview.loadUrl("file:///android_asset/gd.html");
        }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("SOLODANCE")==0) {
            mwebview.loadUrl("file:///android_asset/solodance.html");
        }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("DUETDANCE")==0) {
            mwebview.loadUrl("file:///android_asset/duetdance.html");
        }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("TATTOO")==0) {
             mwebview.loadUrl("file:///android_asset/tattoo.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("FACEPAINTING")==0) {
             mwebview.loadUrl("file:///android_asset/facepainting.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("RANGOLI")==0) {
             mwebview.loadUrl("file:///android_asset/rangoli.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("COLLAGE")==0) {
             mwebview.loadUrl("file:///android_asset/collage.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("GRAFFITI")==0) {
             mwebview.loadUrl("file:///android_asset/graffiti.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("FUSION")==0) {
             mwebview.loadUrl("file:///android_asset/fusion.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("SOLOINST")==0) {
             mwebview.loadUrl("file:///android_asset/soloinst.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("ANTAKSHARI")==0) {
             mwebview.loadUrl("file:///android_asset/antakshari.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("SOLOSING")==0) {
             mwebview.loadUrl("file:///android_asset/solosing.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("DEBATE")==0) {
             mwebview.loadUrl("file:///android_asset/debate.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("NPD")==0) {
             mwebview.loadUrl("file:///android_asset/npd.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("JAMING")==0) {
             mwebview.loadUrl("file:///android_asset/jam.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("FOLK")==0) {
             mwebview.loadUrl("file:///android_asset/folk.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("FASHION")==0) {
             mwebview.loadUrl("file:///android_asset/fashionshow.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("GRPDANCE")==0) {
             mwebview.loadUrl("file:///android_asset/grpdance.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("FIFA")==0) {
             mwebview.loadUrl("file:///android_asset/fifa.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("CS")==0) {
             mwebview.loadUrl("file:///android_asset/cs.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("NFS")==0) {
             mwebview.loadUrl("file:///android_asset/nfs.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("QUIZDOM")==0) {
             mwebview.loadUrl("file:///android_asset/quizdom.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("CODE")==0) {
             mwebview.loadUrl("file:///android_asset/codemania.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("WEB")==0) {
             mwebview.loadUrl("file:///android_asset/webmasters.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("PHOTOSHOP")==0) {
             mwebview.loadUrl("file:///android_asset/photoshop.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("BRAINQUIILLA")==0) {
             mwebview.loadUrl("file:///android_asset/brainquiilla.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("MAZERUNNER")==0) {
             mwebview.loadUrl("file:///android_asset/mazerunner.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("GAMEOFDRONES")==0) {
             mwebview.loadUrl("file:///android_asset/gameofdrones.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("BRIDGEMAKING")==0) {
             mwebview.loadUrl("file:///android_asset/bridgemaking.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("TOWNPLANNING")==0) {
             mwebview.loadUrl("file:///android_asset/townplanning.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("SLUMPIT")==0) {
             mwebview.loadUrl("file:///android_asset/slumpit.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("ROBORACE")==0) {
             mwebview.loadUrl("file:///android_asset/roborace.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("FREEFLIERS")==0) {
             mwebview.loadUrl("file:///android_asset/freefliers.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("AQUAJET")==0) {
             mwebview.loadUrl("file:///android_asset/aquajet.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("ROBOWARS")==0) {
             mwebview.loadUrl("file:///android_asset/robowars.html");
         }else if(getIntent().getStringExtra("ACTIVITY").compareToIgnoreCase("LINESEG")==0) {
             mwebview.loadUrl("file:///android_asset/lineseguidor.html");
         }

         }
    }
