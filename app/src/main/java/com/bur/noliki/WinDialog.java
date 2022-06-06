package com.bur.noliki;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;

public class WinDialog extends Dialog {
    private final String message;
    private final MainActivity mainActivity;

    public WinDialog(@NonNull Context context, String message) {
        super(context);
        this.message = message;
        this.mainActivity = ((MainActivity) context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.win_dialog_layout);

        final TextView messageTextView = findViewById(R.id.messageTextView);
        final Button startNewGameBtn = findViewById(R.id.starGameBtn);
        messageTextView.setText(message);
        startNewGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
                getContext().startActivity(new Intent(getContext(), PlayerName.class));
                mainActivity.finish();
            }
        });
    }
}
