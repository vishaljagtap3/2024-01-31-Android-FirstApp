package in.bitcode.firstapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView txtInfo;
    private EditText edtInfo;
    private Button btnSetInfo;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT
                )
        );
        //linearLayout.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        linearLayout.setGravity(Gravity.CENTER);

        txtInfo = new TextView(this);
        txtInfo.setText("Welcome to BitCode!");
        txtInfo.setTextSize(50);
        txtInfo.setLayoutParams(
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                )
        );
        linearLayout.addView(txtInfo);


        edtInfo = new EditText(this);
        edtInfo.setText("Some text here...");
        edtInfo.setLayoutParams(
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                )
        );
        linearLayout.addView(edtInfo);

        btnSetInfo = new Button(this);
        btnSetInfo.setText("Set Info");
        btnSetInfo.setLayoutParams(
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                )
        );
        linearLayout.addView(btnSetInfo);

        setContentView(linearLayout);

        btnSetInfo.setOnClickListener(new BtnClickListener());
        /*btnSetInfo.setOnTouchListener( new BtnTouchListener());
        btnSetInfo.setOnKeyListener(new BtnKeyListener());*/


        /*txtInfo = new TextView(this);
        txtInfo.setText("Welcome to BitCode!");
        txtInfo.setTextSize(50);

        setContentView(txtInfo);

        edtInfo = new EditText(this);
        edtInfo.setText("Some text here...");
        setContentView(edtInfo);*/
    }

    class BtnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            txtInfo.setText(edtInfo.getText().toString());
        }
    }

    class BtnTouchListener implements View.OnTouchListener {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            txtInfo.setText(edtInfo.getText().toString());
            return false;
        }
    }

    class BtnKeyListener implements View.OnKeyListener {
        @Override
        public boolean onKey(View v, int keyCode, KeyEvent event) {
            txtInfo.setText(edtInfo.getText().toString());
            return false;
        }
    }
}








