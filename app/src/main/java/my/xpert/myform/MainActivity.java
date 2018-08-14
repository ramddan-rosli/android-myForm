package my.xpert.myform;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText, emailEditText, phoneEditText, cellEditText, messageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.main_nameEditText);
        emailEditText = findViewById(R.id.main_emailEditText);
        phoneEditText = findViewById(R.id.main_phoneEditText);
        cellEditText = findViewById(R.id.main_cellEditText);
        messageEditText = findViewById(R.id.main_messageEditText);
    }

    public void button_press(View view) {

        Intent intent = new Intent(MainActivity.this, SecondActivity.class); // <- send data to other page
        intent.putExtra("name", nameEditText.getText().toString()   );
        intent.putExtra("email", emailEditText.getText().toString() );
        intent.putExtra("phone", phoneEditText.getText().toString()    );
        intent.putExtra("cell", cellEditText.getText().toString()   );
        intent.putExtra("message", messageEditText.getText().toString() );
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_about_us:
                Intent intent = new Intent(MainActivity.this, AboutUs.class);
                startActivity(intent);
                break;

            case R.id.menu_contact_us:
                Toast.makeText(MainActivity.this,"Please contact us", Toast.LENGTH_LONG).show();
                break;

            case R.id.menu_share:
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                alertDialogBuilder.setTitle("Are you sure?");
                alertDialogBuilder.setMessage("Are you sure you want to share this app?");
                alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                alertDialogBuilder.show();
                break;

            case R.id.menu_exit:
                System.exit(0);
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu); //<-- make menu
        return super.onCreateOptionsMenu(menu);
    }
}
