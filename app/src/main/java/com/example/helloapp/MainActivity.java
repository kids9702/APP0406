package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // 사용하고 싶은 UI 요소 저장 변수
    TextView mTitleTXT;
    Button mCheckBTN;
    EditText mMsgETXT;
    ImageView mFlowerIMG;


    // App 화면을 생성하는 시스템 호출하는 콜백 메서드
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 스마트 화면 설정 ==> res/logout 폴더 아래 있는 xml 중 하나
        setContentView(R.layout.activity_main);

        // UI 요소 변수 값 설정 => XML에서 UI 요소를 찾아서 저장
        mTitleTXT = (TextView) findViewById(R.id.titleTXT);
        mCheckBTN = (Button) findViewById(R.id.checkBTN);
        mMsgETXT = (EditText) findViewById(R.id.msgETXT);
        mFlowerIMG = (ImageView) findViewById(R.id.flowerIMG);

        //UI 요소 속성 재설정
        mTitleTXT.setText("**Good Luck!**");
        mTitleTXT.setTextColor(Color.MAGENTA);
        mTitleTXT.setTextSize(40.0f);
        mTitleTXT.setBackgroundColor(Color.YELLOW);
        mTitleTXT.setPadding(30, 10, 30, 10);

        // 입력 UI 요소 EditText와 Button 값 불러오기
        String msg = mMsgETXT.getText().toString();
        int width = mMsgETXT.getWidth();
        mMsgETXT.setBackgroundColor(Color.CYAN);

        // EditText에서 읽어온 Text를 TextView에 넣어서 보여주기
        mTitleTXT.setText(msg+width);

        // Toast창 띄우기 => 현재 프로세스 정보, 출력 메시지, 출력 시간 / .show()를 해야 보임
        Toast.makeText(this,"TEST", Toast.LENGTH_LONG).show();

        //image source 변경
        mFlowerIMG.setImageResource(R.drawable.prr);
    }

    public void click(View view) {
        Toast.makeText(this, "이야 뽀로로다", Toast.LENGTH_LONG).show();
    }
}