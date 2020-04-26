package com.example.traningmvp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.traningmvp.R;
import com.example.traningmvp.model.Model;
import com.example.traningmvp.ui.UpdateActivity;
import com.example.traningmvp.util.Constant;
import com.example.traningmvp.util.FormatDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    List<Model> my_list;
    private Context context;

    public CustomAdapter(List<Model> my_list, Context context) {
        this.my_list = my_list;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Model model = my_list.get(position);
        holder.imageView.setImageDrawable(context.getResources().getDrawable(model.getImage()));
        holder.userIdText.setText(Integer.toString(model.getUserId()));
        holder.firstNameText.setText(model.getFirstName());
        holder.lastNameText.setText(model.getLastName());
        holder.birthDateText.setText(FormatDate.date(String.valueOf(model.getBirthDate())));
        holder.passwordText.setText(model.getPassword());
        holder.confirmPasswordText.setText(model.getConfirmPassword());
        holder.phoneText.setText(model.getPhone());
        //Button Update
        holder.buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, UpdateActivity.class);
                intent.putExtra(Constant.USER_ID, model.getUserId());
                intent.putExtra(Constant.FIRST_NAME, model.getFirstName());
                intent.putExtra(Constant.LAST_NAME, model.getLastName());
                intent.putExtra(Constant.BIRTH_DATE, model.getBirthDate());
                intent.putExtra(Constant.PASSWORD, model.getPassword());
                intent.putExtra(Constant.CONFIRM_PASSWORD, model.getConfirmPassword());
                intent.putExtra(Constant.PASSWORD, model.getPhone());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                context.startActivity(intent);
            }
        });


    }

//    private String today(long birthDate) {
//        String DATE_FORMAT= "yyyy-MM-dd";
//        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
//        dateFormat.setTimeZone(TimeZone.getTimeZone("ENG"));
//        Date today = Calendar.getInstance().getTime();
//        return dateFormat.format(today);
//    }

    @Override
    public int getItemCount() {
        return my_list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView firstNameText, lastNameText, birthDateText, phoneText;
        TextView userIdText, passwordText, confirmPasswordText;
        Button buttonUpdate, buttonDelete;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageProfile);
            firstNameText = itemView.findViewById(R.id.firstName_text);
            lastNameText = itemView.findViewById(R.id.lastName_text);
            birthDateText = itemView.findViewById(R.id.birthDate_text);
            phoneText = itemView.findViewById(R.id.phone_text);
            userIdText = itemView.findViewById(R.id.userIdText);
            passwordText = itemView.findViewById(R.id.passwordText);
            confirmPasswordText = itemView.findViewById(R.id.confirmPasswordText);

            buttonUpdate = itemView.findViewById(R.id.button_update);
            buttonDelete = itemView.findViewById(R.id.button_delete);
        }
    }
}
