package com.example.toolbaraplication;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import androidx.appcompat.widget.Toolbar;

public class ToolBarDeprecated extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Toolbar tb = findViewById(R.id.toolbar);
        setSupportActionBar(tb);

        TextView tv = findViewById(R.id.textView);
        registerForContextMenu(tv);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menudef, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.op1){
            Toast.makeText(this, "Opción 1 deprecated", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.op2){
            Toast.makeText(this, "Opción 2 deprecated", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.op3){
            Toast.makeText(this, "Opción 3 deprecated", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menudef, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.op1){
            Toast.makeText(this, "Opción 1 deprecated context", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.op2){
            Toast.makeText(this, "Opción 2 deprecated context", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.op3){
            Toast.makeText(this, "Opción 3 deprecated context", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onContextItemSelected(item);
    }
}
