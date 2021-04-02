package com.example.asynctask;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;
import java.util.ArrayList;

public class StudentAsyncTask extends AsyncTask<Void,Void, ArrayList<Student>> {

    private ListView listView;
    private Context context;

    public StudentAsyncTask(ListView listView, Context context){
        this.listView = listView;
        this.context = context;
    }


    @Override
    protected ArrayList doInBackground(Void... voids) {
        StudentDao students = new StudentDao();
        return students.getAllStudents();
    }

    @Override
    protected void onPostExecute(ArrayList arrayList) {
        super.onPostExecute(arrayList);
        StudentAdapter studentA = new StudentAdapter(context,arrayList);
        listView.setAdapter(studentA);
    }
}
