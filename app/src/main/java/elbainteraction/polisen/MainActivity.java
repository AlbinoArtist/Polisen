package elbainteraction.polisen;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

import com.xiaochen.progressroundbutton.AnimDownloadProgressButton;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Hora(View view){
        AnimDownloadProgressButton b = (AnimDownloadProgressButton) view;
        b.setText("hora");
        b.setState(1);
    }
}
