package xyz.richardplus.acceleration;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    //button 开始/暂停、保存、读取、记录频率
    private Button btnToggle, btnSave, btnRead;
    private TextView readBuffer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        readBuffer = (TextView) findViewById(R.id.readBuffer);
        btnRead = (Button) findViewById(R.id.btnRead);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnToggle = (Button) findViewById(R.id.btnToggle);
        btnRead.setOnClickListener(this);
        btnToggle.setOnClickListener(this);
        btnSave.setOnClickListener(this);
        Intent it = getIntent();
        String data = it.getStringExtra("file_saved");
        readBuffer.setMovementMethod(new ScrollingMovementMethod());
        readBuffer.setText(data);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnRead:
                finish();
                break;
            case R.id.btnSave:
                Toast.makeText(this, "不可用", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnToggle:
                Toast.makeText(this, "不可用", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void finish() {
        super.finish();
    }
}
