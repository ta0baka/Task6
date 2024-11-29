package com.example.lab6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ReminderAdapter extends ArrayAdapter<Reminder> {
    public ReminderAdapter(@NonNull Context context, @NonNull List<Reminder> reminders) {
        super(context, 0, reminders);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Reminder reminder = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_2, parent, false);
        }

        TextView titleTextView = convertView.findViewById(android.R.id.text1);
        TextView messageTextView = convertView.findViewById(android.R.id.text2);

        if (reminder != null) {
            titleTextView.setText(reminder.getTitle() != null ? reminder.getTitle() : "");
            messageTextView.setText(reminder.getMessage() != null ? reminder.getMessage() : "");
        } else {
            titleTextView.setText("");
            messageTextView.setText("");
        }

        return convertView;
    }
}
