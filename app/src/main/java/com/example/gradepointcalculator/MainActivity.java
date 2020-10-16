package com.example.gradepointcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button check;
    EditText stuName, faculty, department, regNum,courseName1,courseName2,courseName3,courseName4,courseName5,courseName6,courseName7,
            courseName8,courseName9,courseName10,courseName11,courseName12,courseName13,courseName14,courseName15;
    TextView courseProPerties1,courseProPerties2,courseProPerties3,courseProPerties4,courseProPerties5,courseProPerties6,courseProPerties7,
            courseProPerties8,courseProPerties9,courseProPerties10,courseProPerties11,courseProPerties12,courseProPerties13,courseProPerties14,
            courseProPerties15,personalDetails,stuname,depart,facult,reg,totalCourses,totalScore,totalCreditloads,gp,gradeDivision;

    Spinner score1,score2,score3,score4,score5,score6,score7,score8,score9,score10,score11,score12,score13,score14,score15,
            load1,load2,load3,load4,load5,load6,load7,load8,load9,load10,load11,load12,load13,load14,load15;
    String selectedGrade1,selectedGrade2,selectedGrade3,selectedGrade4,selectedGrade5,selectedGrade6,selectedGrade7,selectedGrade8,selectedGrade9,
            selectedGrade10,selectedGrade11,selectedGrade12,selectedGrade13,selectedGrade14,selectedGrade15;
    String pro1,pro2,pro3,pro4,pro5,pro6,pro7,pro8,pro9,pro10,pro11,pro12,pro13,pro14,pro15;

    int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    int counter,count1,count2,count3,count4,count5,count6,count7,count8,count9,count10,count11,count12,count13,count14,count15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check=findViewById(R.id.add_and_check);
        stuName=findViewById(R.id.edit_text_name);
        faculty=findViewById(R.id.edit_text_faculty);
        department=findViewById(R.id.edit_text_department);
        regNum=findViewById(R.id.edit_text_registration_number);
        courseName1=findViewById(R.id.edit_text_course_name1);
        courseName2=findViewById(R.id.edit_text_course_name2);
        courseName3=findViewById(R.id.edit_text_course_name3);
        courseName4=findViewById(R.id.edit_text_course_name4);
        courseName5=findViewById(R.id.edit_text_course_name5);
        courseName6=findViewById(R.id.edit_text_course_name6);
        courseName7=findViewById(R.id.edit_text_course_name7);
        courseName8=findViewById(R.id.edit_text_course_name8);
        courseName9=findViewById(R.id.edit_text_course_name9);
        courseName10=findViewById(R.id.edit_text_course_name10);
        courseName11=findViewById(R.id.edit_text_course_name11);
        courseName12=findViewById(R.id.edit_text_course_name12);
        courseName13=findViewById(R.id.edit_text_course_name13);
        courseName14=findViewById(R.id.edit_text_course_name14);
        courseName15=findViewById(R.id.edit_text_course_name15);

        courseProPerties1=findViewById(R.id.course_properties1);
        courseProPerties2=findViewById(R.id.course_properties2);
        courseProPerties3=findViewById(R.id.course_properties3);
        courseProPerties4=findViewById(R.id.course_properties4);
        courseProPerties5=findViewById(R.id.course_properties5);
        courseProPerties6=findViewById(R.id.course_properties6);
        courseProPerties7=findViewById(R.id.course_properties7);
        courseProPerties8=findViewById(R.id.course_properties8);
        courseProPerties9=findViewById(R.id.course_properties9);
        courseProPerties10=findViewById(R.id.course_properties10);
        courseProPerties11=findViewById(R.id.course_properties11);
        courseProPerties12=findViewById(R.id.course_properties12);
        courseProPerties13=findViewById(R.id.course_properties13);
        courseProPerties14=findViewById(R.id.course_properties14);
        courseProPerties15=findViewById(R.id.course_properties15);

        personalDetails=findViewById(R.id.text_view_personal_details);
        stuname=findViewById(R.id.text_view_name);
        depart=findViewById(R.id.text_view_department);
        facult=findViewById(R.id.text_view_faculty);
        reg=findViewById(R.id.text_view_reg_num);
        totalCourses=findViewById(R.id.text_view_number_of_courses);
        totalScore=findViewById(R.id.text_view_score);
        totalCreditloads=findViewById(R.id.text_view_credit_loads);
        gp=findViewById(R.id.text_view_grade_point);
        gradeDivision=findViewById(R.id.text_grade_division);

        score1=findViewById(R.id.spinner_grade1);
        score2=findViewById(R.id.spinner_grade2);
        score3=findViewById(R.id.spinner_grade3);
        score4=findViewById(R.id.spinner_grade4);
        score5=findViewById(R.id.spinner_grade5);
        score6=findViewById(R.id.spinner_grade6);
        score7=findViewById(R.id.spinner_grade7);
        score8=findViewById(R.id.spinner_grade8);
        score9=findViewById(R.id.spinner_grade9);
        score10=findViewById(R.id.spinner_grade10);
        score11=findViewById(R.id.spinner_grade11);
        score12=findViewById(R.id.spinner_grade12);
        score13=findViewById(R.id.spinner_grade13);
        score14=findViewById(R.id.spinner_grade14);
        score15=findViewById(R.id.spinner_grade15);

        load1=findViewById(R.id.spinner_credit1);
        load2=findViewById(R.id.spinner_credit2);
        load3=findViewById(R.id.spinner_credit3);
        load4=findViewById(R.id.spinner_credit4);
        load5=findViewById(R.id.spinner_credit5);
        load6 = findViewById(R.id.spinner_credit6);
        load7=findViewById(R.id.spinner_credit7);
        load8=findViewById(R.id.spinner_credit8);
        load9=findViewById(R.id.spinner_credit9);
        load10=findViewById(R.id.spinner_credit10);
        load11=findViewById(R.id.spinner_credit11);
        load12=findViewById(R.id.spinner_credit12);
        load13=findViewById(R.id.spinner_credit13);
        load14=findViewById(R.id.spinner_credit14);
        load15=findViewById(R.id.spinner_credit15);

        String [] credt={"Select your credit load here","1","2","3","4","5","6"};
        String [] grade={"Select your grade here","A","B","C","D","E","F"};
        ArrayAdapter<String>adapter1=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,grade);
        score1.setAdapter(adapter1);
        score2.setAdapter(adapter1);
        score3.setAdapter(adapter1);
        score4.setAdapter(adapter1);
        score5.setAdapter(adapter1);
        score6.setAdapter(adapter1);
        score7.setAdapter(adapter1);
        score8.setAdapter(adapter1);
        score9.setAdapter(adapter1);
        score10.setAdapter(adapter1);
        score11.setAdapter(adapter1);
        score12.setAdapter(adapter1);
        score13.setAdapter(adapter1);
        score14.setAdapter(adapter1);
        score15.setAdapter(adapter1);

        ArrayAdapter<String>adapter2=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,credt);
        load1.setAdapter(adapter2);
        load2.setAdapter(adapter2);
        load3.setAdapter(adapter2);
        load4.setAdapter(adapter2);
        load5.setAdapter(adapter2);
        load6.setAdapter(adapter2);
        load7.setAdapter(adapter2);
        load8.setAdapter(adapter2);
        load9.setAdapter(adapter2);
        load10.setAdapter(adapter2);
        load11.setAdapter(adapter2);
        load12.setAdapter(adapter2);
        load13.setAdapter(adapter2);
        load14.setAdapter(adapter2);
        load15.setAdapter(adapter2);

        score1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                selectedGrade1= (String) parent.getItemAtPosition(i);
                if(selectedGrade1.equalsIgnoreCase("A")){
                    a1=5;
                }else if(selectedGrade1.equalsIgnoreCase("B")){
                    a1=4;
                }else if(selectedGrade1.equalsIgnoreCase("C")){
                    a1=3;
                }else if(selectedGrade1.equalsIgnoreCase("D")){
                    a1=2;
                }else if(selectedGrade1.equalsIgnoreCase("E")){
                    a1=1;
                }else if(selectedGrade1.equalsIgnoreCase("F")){
                    a1=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
               a1=0;
            }
        });
        score2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                selectedGrade2= (String) parent.getItemAtPosition(i);
                if(selectedGrade2.equalsIgnoreCase("A")){
                    a2=5;
                }else if(selectedGrade2.equalsIgnoreCase("B")){
                    a2=4;
                }else if(selectedGrade2.equalsIgnoreCase("C")){
                    a2=3;
                }else if(selectedGrade2.equalsIgnoreCase("D")){
                    a2=2;
                }else if(selectedGrade2.equalsIgnoreCase("E")){
                    a2=1;
                }else if(selectedGrade2.equalsIgnoreCase("F")){
                    a2=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                a2=0;
            }
        });
        score3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                selectedGrade3= (String) parent.getItemAtPosition(i);
                if(selectedGrade3.equalsIgnoreCase("A")){
                    a3=5;
                }else if(selectedGrade3.equalsIgnoreCase("B")){
                    a3=4;
                }else if(selectedGrade3.equalsIgnoreCase("C")){
                    a3=3;
                }else if(selectedGrade3.equalsIgnoreCase("D")){
                    a3=2;
                }else if(selectedGrade3.equalsIgnoreCase("E")){
                    a3=1;
                }else if(selectedGrade3.equalsIgnoreCase("F")){
                    a3=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                a3=0;
            }
        });
        score4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                selectedGrade4= (String) parent.getItemAtPosition(i);
                if(selectedGrade4.equalsIgnoreCase("A")){
                    a4=5;
                }else if(selectedGrade4.equalsIgnoreCase("B")){
                    a4=4;
                }else if(selectedGrade4.equalsIgnoreCase("C")){
                    a4=3;
                }else if(selectedGrade4.equalsIgnoreCase("D")){
                    a4=2;
                }else if(selectedGrade4.equalsIgnoreCase("E")){
                    a4=1;
                }else if(selectedGrade4.equalsIgnoreCase("F")){
                    a4=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                a4=0;
                count4=0;
            }
        });
        score5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
               selectedGrade5= (String) parent.getItemAtPosition(i);
                if(selectedGrade5.equalsIgnoreCase("A")){
                    a5=5;
                }else if(selectedGrade5.equalsIgnoreCase("B")){
                    a5=4;
                }else if(selectedGrade5.equalsIgnoreCase("C")){
                    a5=3;
                }else if(selectedGrade5.equalsIgnoreCase("D")){
                    a5=2;
                }else if(selectedGrade5.equalsIgnoreCase("E")){
                    a5=1;
                }else if(selectedGrade5.equalsIgnoreCase("F")){
                    a5=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                a5=0;
            }
        });
        score6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                selectedGrade6= (String) parent.getItemAtPosition(i);
                if(selectedGrade6.equalsIgnoreCase("A")){
                    a6=5;
                }else if(selectedGrade6.equalsIgnoreCase("B")){
                    a6=4;
                }else if(selectedGrade6.equalsIgnoreCase("C")){
                    a6=3;
                }else if(selectedGrade6.equalsIgnoreCase("D")){
                    a6=2;
                }else if(selectedGrade6.equalsIgnoreCase("E")){
                    a6=1;
                }else if(selectedGrade6.equalsIgnoreCase("F")){
                    a6=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                a6=0;
            }
        });
        score7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                selectedGrade7= (String) parent.getItemAtPosition(i);
                if(selectedGrade7.equalsIgnoreCase("A")){
                    a7=5;
                }else if(selectedGrade7.equalsIgnoreCase("B")){
                    a7=4;
                }else if(selectedGrade7.equalsIgnoreCase("C")){
                    a7=3;
                }else if(selectedGrade7.equalsIgnoreCase("D")){
                    a7=2;
                }else if(selectedGrade7.equalsIgnoreCase("E")){
                    a7=1;
                }else if(selectedGrade7.equalsIgnoreCase("F")){
                    a7=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                a7=0;
            }
        });
        score8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                selectedGrade8= (String) parent.getItemAtPosition(i);
                if(selectedGrade8.equalsIgnoreCase("A")){
                    a8=5;
                }else if(selectedGrade8.equalsIgnoreCase("B")){
                    a8=4;
                }else if(selectedGrade8.equalsIgnoreCase("C")){
                    a8=3;
                }else if(selectedGrade8.equalsIgnoreCase("D")){
                    a8=2;
                }else if(selectedGrade8.equalsIgnoreCase("E")){
                    a8=1;
                }else if(selectedGrade8.equalsIgnoreCase("F")){
                    a8=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                a8=0;
            }
        });
        score9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                selectedGrade9= (String) parent.getItemAtPosition(i);
                if(selectedGrade9.equalsIgnoreCase("A")){
                    a9=5;
                }else if(selectedGrade9.equalsIgnoreCase("B")){
                    a9=4;
                }else if(selectedGrade9.equalsIgnoreCase("C")){
                    a9=3;
                }else if(selectedGrade9.equalsIgnoreCase("D")){
                    a9=2;
                }else if(selectedGrade9.equalsIgnoreCase("E")){
                    a9=1;
                }else if(selectedGrade9.equalsIgnoreCase("F")){
                    a9=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                a9=0;
            }
        });
        score10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                selectedGrade10= (String) parent.getItemAtPosition(i);
                if(selectedGrade10.equalsIgnoreCase("A")){
                    a10=5;
                }else if(selectedGrade10.equalsIgnoreCase("B")){
                    a10=4;
                }else if(selectedGrade10.equalsIgnoreCase("C")){
                    a10=3;
                }else if(selectedGrade10.equalsIgnoreCase("D")){
                    a10=2;
                }else if(selectedGrade10.equalsIgnoreCase("E")){
                    a10=1;
                }else if(selectedGrade10.equalsIgnoreCase("F")){
                    a10=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                a10=0;
            }
        });
        score11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                selectedGrade11= (String) parent.getItemAtPosition(i);
                if(selectedGrade11.equalsIgnoreCase("A")){
                    a11=5;
                }else if(selectedGrade11.equalsIgnoreCase("B")){
                    a11=4;
                }else if(selectedGrade11.equalsIgnoreCase("C")){
                    a11=3;
                }else if(selectedGrade11.equalsIgnoreCase("D")){
                    a11=2;
                }else if(selectedGrade11.equalsIgnoreCase("E")){
                    a11=1;
                }else if(selectedGrade11.equalsIgnoreCase("F")){
                    a11=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                a11=0;
            }
        });
        score12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                selectedGrade12= (String) parent.getItemAtPosition(i);
                if(selectedGrade12.equalsIgnoreCase("A")){
                    a12=5;
                }else if(selectedGrade12.equalsIgnoreCase("B")){
                    a12=4;
                }else if(selectedGrade12.equalsIgnoreCase("C")){
                    a12=3;
                }else if(selectedGrade12.equalsIgnoreCase("D")){
                    a12=2;
                }else if(selectedGrade12.equalsIgnoreCase("E")){
                    a12=1;
                }else if(selectedGrade12.equalsIgnoreCase("F")){
                    a12=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                a12=0;
            }
        });
        score13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                selectedGrade13= (String) parent.getItemAtPosition(i);
                if(selectedGrade13.equalsIgnoreCase("A")){
                    a13=5;
                }else if(selectedGrade13.equalsIgnoreCase("B")){
                    a13=4;
                }else if(selectedGrade13.equalsIgnoreCase("C")){
                    a13=3;
                }else if(selectedGrade13.equalsIgnoreCase("D")){
                    a13=2;
                }else if(selectedGrade13.equalsIgnoreCase("E")){
                    a13=1;
                }else if(selectedGrade13.equalsIgnoreCase("F")){
                    a13=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                a13=0;
            }
        });
        score14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                selectedGrade14= (String) parent.getItemAtPosition(i);
                count14=1;
                if(selectedGrade14.equalsIgnoreCase("A")){
                    a14=5;
                }else if(selectedGrade14.equalsIgnoreCase("B")){
                    a14=4;
                }else if(selectedGrade14.equalsIgnoreCase("C")){
                    a14=3;
                }else if(selectedGrade14.equalsIgnoreCase("D")){
                    a14=2;
                }else if(selectedGrade14.equalsIgnoreCase("E")){
                    a14=1;
                }else if(selectedGrade14.equalsIgnoreCase("F")){
                    a14=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                a14=0;
            }
        });
        score15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                selectedGrade15= (String) parent.getItemAtPosition(i);
                if(selectedGrade15.equalsIgnoreCase("A")){
                    a15=5;
                }else if(selectedGrade15.equalsIgnoreCase("B")){
                    a15=4;
                }else if(selectedGrade15.equalsIgnoreCase("C")){
                    a15=3;
                }else if(selectedGrade15.equalsIgnoreCase("D")){
                    a15=2;
                }else if(selectedGrade15.equalsIgnoreCase("E")){
                    a15=1;
                }else if(selectedGrade15.equalsIgnoreCase("F")){
                    a15=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            a15=0;
            }
        });
        //now i want to assign values to the spinner of the credit load
        load1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:b1=0;count1=0; break;
                    case 1:b1=1;count1=1; break;
                    case 2:b1=2;count1=1; break;
                    case 3:b1=3;count1=1; break;
                    case 4:b1=4;count1=1; break;
                    case 5:b1=5;count1=1; break;
                    case 6:b1=6;count1=1; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            b1=0;
                count1=0;
            }
        });
        load2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:b2=0;count2=0; break;
                    case 1:b2=1;count2=1; break;
                    case 2:b2=2;count2=1; break;
                    case 3:b2=3;count2=1; break;
                    case 4:b2=4;count2=1; break;
                    case 5:b2=5;count2=1; break;
                    case 6:b2=6;count2=1; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            b2=0;count2=0;
            }
        });
        load3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:b3=0;count3=0; break;
                    case 1:b3=1;count3=1; break;
                    case 2:b3=2;count3=1; break;
                    case 3:b3=3;count3=1; break;
                    case 4:b3=4;count3=1; break;
                    case 5:b3=5;count3=1; break;
                    case 6:b4=6;count3=1; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            b3=0;count3=0;
            }
        });
        load4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:b4=0;count4=0; break;
                    case 1:b4=1;count4=1; break;
                    case 2:b4=2;count4=1; break;
                    case 3:b4=3;count4=1; break;
                    case 4:b4=4;count4=1; break;
                    case 5:b4=5;count4=1; break;
                    case 6:b4=6;count4=1; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            b4=0;count4=0;
            }
        });
        load5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:b5=0;count5=0; break;
                    case 1:b5=1;count5=1; break;
                    case 2:b5=2;count5=1; break;
                    case 3:b5=3;count5=1; break;
                    case 4:b5=4;count5=1; break;
                    case 5:b5=5;count5=1; break;
                    case 6:b5=6;count5=1; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
             b5=0;count5=0;
            }
        });
        load6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:b6=0;count6=0; break;
                    case 1:b6=1;count6=1; break;
                    case 2:b6=2;count6=1; break;
                    case 3:b6=3;count6=1; break;
                    case 4:b6=4;count6=1; break;
                    case 5:b6=5;count6=1; break;
                    case 6:b6=6;count6=1; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            b6=0;count6=0;
            }
        });
        load7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:b7=0;count7=0; break;
                    case 1:b7=1;count7=1; break;
                    case 2:b7=2;count7=1; break;
                    case 3:b7=3;count7=1; break;
                    case 4:b7=4;count7=1; break;
                    case 5:b7=5;count7=1; break;
                    case 6:b7=6;count7=1; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            b7=0;count7=0;
            }
        });
        load8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:b8=0;count8=0; break;
                    case 1:b8=1;count8=1; break;
                    case 2:b8=2;count8=1; break;
                    case 3:b8=3;count8=1; break;
                    case 4:b8=4;count8=1; break;
                    case 5:b8=5;count8=1; break;
                    case 6:b8=6;count8=1; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
             b8=0;count8=0;
            }
        });
        load9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:b9=0;count9=0; break;
                    case 1:b9=1;count9=1; break;
                    case 2:b9=2;count9=1; break;
                    case 3:b9=3;count9=1; break;
                    case 4:b9=4;count9=1; break;
                    case 5:b9=5;count9=1; break;
                    case 6:b9=6;count9=1; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            b9=0;count9=0;
            }
        });
        load10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:b10=0;count10=0; break;
                    case 1:b10=1;count10=1; break;
                    case 2:b10=2;count10=1; break;
                    case 3:b10=3;count10=1; break;
                    case 4:b10=4;count10=1; break;
                    case 5:b10=5;count10=1; break;
                    case 6:b10=6;count10=1; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            b10=0;count10=0;
            }
        });
        load11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:b11=0;count11=0; break;
                    case 1:b11=1;count11=1; break;
                    case 2:b11=2;count11=1; break;
                    case 3:b11=3;count11=1; break;
                    case 4:b11=4;count11=1; break;
                    case 5:b11=6;count11=1; break;
                    case 6:b11=6;count11=1; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
             b11=0;count11=0;
            }
        });
        load12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:b12=0;count12=0; break;
                    case 1:b12=1;count12=1; break;
                    case 2:b12=2;count12=1; break;
                    case 3:b12=3;count12=1; break;
                    case 4:b12=4;count12=1; break;
                    case 5:b12=5;count12=1; break;
                    case 6:b12=6;count12=1; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            b12=0;count12=0;
            }
        });
        load13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:b13=0;count13=0; break;
                    case 1:b13=1;count13=1; break;
                    case 2:b13=2;count13=1; break;
                    case 3:b13=3;count13=1; break;
                    case 4:b13=4;count13=1; break;
                    case 5:b13=5;count13=1; break;
                    case 6:b13=6;count13=1; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            b13=0;count13=0;
            }
        });
        load14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:b14=0;count14=0; break;
                    case 1:b14=1;count14=1; break;
                    case 2:b14=2;count14=1; break;
                    case 3:b14=3;count14=1; break;
                    case 4:b14=4;count14=1; break;
                    case 5:b14=5;count14=1; break;
                    case 6:b14=6;count14=1; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            b14=0;count14=0;
            }
        });
        load15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:b15=0;count15=0; break;
                    case 1:b15=1;count15=1; break;
                    case 2:b15=2;count15=1; break;
                    case 3:b15=3;count15=1; break;
                    case 4:b15=4;count15=1; break;
                    case 5:b15=5;count15=1; break;
                    case 6:b15=6;count15=1; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            b15=0;count15=0;
            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double g=a1*b1+a2*b2+a3*b3+a4*b4+a5*b5+a6*b6+a7*b7+a8*b8+a9*b9+a10*b10+a11*b11+a12*b12+a13*b13+a14*b14+a15*b15;
                double c=b1+b2+b3+b4+b5+b6+b7+b8+b9+b10+b11+b12+b13+b14+b15;
                double gradePoint=g/c;
                counter=count1+count2+count3+count4+count5+count6+count7+count8+count9+count10+count11+count12+count13+count14+count15;

                if(courseName1.getText().toString().isEmpty()){
                    courseProPerties1.setVisibility(View.GONE);
                }else {
                    pro1="COURSE NAME: "+courseName1.getText().toString()+", GRADE: "+selectedGrade1+", CREDIT LOAD: "+b1+", SCORE: "+a1*b1;
                    courseProPerties1.setText(pro1);
                }if(courseName2.getText().toString().isEmpty()){
                    courseProPerties2.setVisibility(View.GONE);
                }else {
                    pro2="COURSE NAME: "+courseName2.getText().toString()+", GRADE: "+selectedGrade2+", CREDIT LOAD: "+b2+", SCORE: "+a2*b2;
                    courseProPerties2.setText(pro2);
                }if(courseName3.getText().toString().isEmpty()){
                    courseProPerties3.setVisibility(View.GONE);
                }else {
                    pro3="COURSE NAME: "+courseName3.getText().toString()+", GRADE: "+selectedGrade3+", CREDIT LOAD: "+b3+", SCORE: "+a3*b3;
                    courseProPerties3.setText(pro3);
                }if(courseName4.getText().toString().isEmpty()){
                    courseProPerties4.setVisibility(View.GONE);
                }else {
                    pro4="COURSE NAME: "+courseName4.getText().toString()+", GRADE: "+selectedGrade4+", CREDIT LOAD: "+b4+", SCORE: "+a4*b4;
                    courseProPerties4.setText(pro4);
                }if(courseName5.getText().toString().isEmpty()){
                    courseProPerties5.setVisibility(View.GONE);
                }else {
                    pro5="COURSE NAME: "+courseName5.getText().toString()+", GRADE: "+selectedGrade5+", CREDIT LOAD: "+b5+", SCORE: "+a5*b5;
                    courseProPerties5.setText(pro5);
                }if(courseName6.getText().toString().isEmpty()){
                    courseProPerties6.setVisibility(View.GONE);
                }else {
                    pro6="COURSE NAME: "+courseName6.getText().toString()+", GRADE: "+selectedGrade6+", CREDIT LOAD: "+b6+", SCORE: "+a6*b6;
                    courseProPerties6.setText(pro6);
                }if(courseName7.getText().toString().isEmpty()){
                    courseProPerties7.setVisibility(View.GONE);
                }else {
                    pro7="COURSE NAME: "+courseName7.getText().toString()+", GRADE: "+selectedGrade7+", CREDIT LOAD: "+b7+", SCORE: "+a7*b7;
                    courseProPerties7.setText(pro7);
                }if(courseName8.getText().toString().isEmpty()){
                    courseProPerties8.setVisibility(View.GONE);
                }else {
                    pro8="COURSE NAME: "+courseName8.getText().toString()+", GRADE: "+selectedGrade8+", CREDIT LOAD: "+b8+", SCORE: "+a8*b8;
                    courseProPerties8.setText(pro8);
                }if(courseName9.getText().toString().isEmpty()){
                    courseProPerties9.setVisibility(View.GONE);
                }else {
                    pro9="COURSE NAME: "+courseName9.getText().toString()+", GRADE: "+selectedGrade9+", CREDIT LOAD: "+b9+", SCORE: "+a9*b9;
                    courseProPerties9.setText(pro9);
                }if(courseName10.getText().toString().isEmpty()){
                    courseProPerties10.setVisibility(View.GONE);
                }else {
                    pro10="COURSE NAME: "+courseName10.getText().toString()+", GRADE: "+selectedGrade10+", CREDIT LOAD: "+b10+", SCORE: "+a10*b10;
                    courseProPerties10.setText(pro10);
                }if(courseName11.getText().toString().isEmpty()){
                    courseProPerties11.setVisibility(View.GONE);
                }else {
                    pro11="COURSE NAME: "+courseName11.getText().toString()+", GRADE: "+selectedGrade11+", CREDIT LOAD: "+b11+", SCORE: "+a11*b11;
                    courseProPerties11.setText(pro11);
                }if(courseName12.getText().toString().isEmpty()){
                    courseProPerties12.setVisibility(View.GONE);
                }else {
                    pro12="COURSE NAME: "+courseName12.getText().toString()+", GRADE: "+selectedGrade12+", CREDIT LOAD: "+b12+", SCORE: "+a12*b12;
                    courseProPerties12.setText(pro12);
                }if(courseName13.getText().toString().isEmpty()){
                    courseProPerties13.setVisibility(View.GONE);
                }else {
                    pro13="COURSE NAME: "+courseName13.getText().toString()+", GRADE: "+selectedGrade13+", CREDIT LOAD: "+b13+", SCORE: "+a1*b13;
                    courseProPerties13.setText(pro13);
                }if(courseName14.getText().toString().isEmpty()){
                    courseProPerties14.setVisibility(View.GONE);
                }else {
                    pro14="COURSE NAME: "+courseName14.getText().toString()+", GRADE: "+selectedGrade14+", CREDIT LOAD: "+b14+", SCORE: "+a14*b14;
                    courseProPerties14.setText(pro14);
                }if(courseName15.getText().toString().isEmpty()){
                    courseProPerties15.setVisibility(View.GONE);
                }else {
                    pro15="COURSE NAME: "+courseName15.getText().toString()+", GRADE: "+selectedGrade15+", CREDIT LOAD: "+b15+", SCORE: "+a15*b15;
                    courseProPerties15.setText(pro15);
                }
                personalDetails.setText("PERSONAL DETAILS");
                stuname.setText("STUDENT NAME: "+stuName.getText().toString());
                depart.setText("DEPARTMENT: "+department.getText().toString());
                facult.setText("FACULTY: "+faculty.getText().toString());
                reg.setText("REGISTRATION NUMBER: "+regNum.getText().toString());
                totalCourses.setText("TOTAL NUMBER OF COURSES: "+counter);
                totalScore.setText("TOTAL SCORE: "+g);
                totalCreditloads.setText("TOTAL CREDIT LOAD: "+c);
                gp.setText("GRADE POINT: "+gradePoint);
                if(gradePoint>=4.5){
                    gradeDivision.setText("GRADE DIVISION: FIRST CLASS");
                }else if(gradePoint>=3.5 && gradePoint<4.5){
                    gradeDivision.setText("GRADE DIVISION: SECOND CLASS UPPER");
                }else if(gradePoint>=2.5 && gradePoint<3.5){
                    gradeDivision.setText("GRADE DIVISION: SECOND CLASS LOWER");
                }else if(gradePoint>=1.5 && gradePoint<2.5){
                    gradeDivision.setText("GRADE DIVISION: THIRD CLASS");
                }else if(gradePoint>=0.1 && gradePoint<1.5){
                    gradeDivision.setText("GRADE DIVISION: PASS");
                }else {
                    gradeDivision.setText("UNKNOWN GRADE");
                }
            }
        });
    }
}
