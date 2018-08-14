package my.xpert.myform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView nameTextView, emailTextView, phoneTextView, cellTextView, messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nameTextView = findViewById(R.id.second_nameTextView);
        emailTextView = findViewById(R.id.second_emailTextView);
        phoneTextView = findViewById(R.id.second_phoneTextView);
        cellTextView = findViewById(R.id.second_cellTextView);
        messageTextView = findViewById(R.id.second_messageTextView);

        Intent intent = getIntent();
        String nameValue = intent.getStringExtra("name");
        nameTextView.setText(nameValue);

        String emailValue = intent.getStringExtra("email");
        emailTextView.setText(emailValue);

        String phoneValue = intent.getStringExtra("phone");
        phoneTextView.setText(phoneValue);

        String cellValue = intent.getStringExtra("cell");
        cellTextView.setText(cellValue);

        String messageValue = intent.getStringExtra("message");
        messageTextView.setText(messageValue);

    }
}
