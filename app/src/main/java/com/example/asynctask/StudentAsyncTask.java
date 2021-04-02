package com.example.asynctask;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

import java.util.ArrayList;

public class StudentAsyncTask extends AsyncTask<Void,Void, ArrayList<Student>> {

    private ListView listView;
    private Context context;

    public StudentAsyncTask(ListView listview, Context context){
        this.listView = listview;
        this.context = context;
    }


    @Override
    protected ArrayList<Student> doInBackground(Void... voids) {
        StudentDao studentDao = new StudentDao();

        return studentDao.getAllStudents();
    }

    @Override
    protected void onPostExecute(ArrayList<Student> students) {
        super.onPostExecute(students);

        StudentAdapter adapter = new StudentAdapter(context, students);
        listView.setAdapter(adapter);
    }
}
