package in.compsgeek.javafyocaocp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import in.compsgeek.javafyocaocp.topics.lesson0topic0;
import in.compsgeek.javafyocaocp.topics.lesson0topic1;
import in.compsgeek.javafyocaocp.topics.lesson0topic2;
import in.compsgeek.javafyocaocp.topics.lesson0topic3;
import in.compsgeek.javafyocaocp.topics.lesson0topic4;
import in.compsgeek.javafyocaocp.topics.lesson0topic5;

public class ListActivity extends AppCompatActivity {

    ExpandableListView expandableListView;

    List<String> lessons ;
    Map<String, List<String>> topics;
    ExpandableListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_list);

        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        fillData();

        listAdapter = new MyExListAdapter(this,lessons,topics);
        expandableListView.setAdapter(listAdapter);

        //add activities to child items
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View view, int groupPosition, int childPosition, long id) {
                Toast.makeText(getBaseContext(),"Now Reading : " + topics.get(lessons.get(groupPosition)).get(childPosition) +"\nFrom Lesson : " + lessons.get(groupPosition), Toast.LENGTH_SHORT).show();

                if(groupPosition==0){
                    if(childPosition == 0){
                        Intent child0Intent = new Intent(getBaseContext(), lesson0topic0.class);
                        startActivity(child0Intent);}
                    if(childPosition == 1){
                        Intent child1Intent = new Intent(getBaseContext(), lesson0topic1.class);
                        startActivity(child1Intent);}
                    if(childPosition == 2){
                        Intent child2Intent = new Intent(getBaseContext(), lesson0topic2.class);
                        startActivity(child2Intent);}
                    if(childPosition == 3){
                        Intent child3Intent = new Intent(getBaseContext(), lesson0topic3.class);
                        startActivity(child3Intent);
                    }
                    if (childPosition == 4) {
                        Intent child4Intent = new Intent(getBaseContext(), lesson0topic4.class);
                        startActivity(child4Intent);
                    }
                    if (childPosition == 5) {
                        Intent child5Intent = new Intent(getBaseContext(), lesson0topic5.class);
                        startActivity(child5Intent);
                    }

                }
//                if(groupPosition==1){
//                    if(childPosition == 3){
//                        Intent child3Intent = new Intent(getBaseContext(), lesson0topic2.class);
//                        startActivity(child3Intent);}
//                    if(childPosition == 4){
//                        Intent child4Intent = new Intent(getBaseContext(), lesson0topic2.class);
//                        startActivity(child4Intent);}
//                    if(childPosition == 5){
//                        Intent child5Intent = new Intent(getBaseContext(), lesson0topic2.class);
//                        startActivity(child5Intent);}
//                }

                return true;
            }
        });




    }

    public void fillData(){
        lessons = new ArrayList<>();
        topics = new HashMap<>();

        // create all tha lessons in array list
        lessons.add("Introduction");
        lessons.add("Operators & Command line Arguments");
        lessons.add("Control Statements");
        lessons.add("Classes & Objects");
        lessons.add("Java I/O & Arrays");
        lessons.add("Java Strings");
        lessons.add("Inheritance");
        lessons.add("Abstract Classes & Interfaces");
        lessons.add("Java Packages & JARs");
        lessons.add("Exceptions & Assertions");
        lessons.add("Fundamental Classes");
        lessons.add("Advanced Java Classes");
        lessons.add("Serialization & files");
        lessons.add("Threads");
        lessons.add("Number Formatters");
        lessons.add("Collection & Generics");
        lessons.add("Java Deployment");
        lessons.add("Applets & GUI");
        lessons.add("Java Swings");
        lessons.add("Networking in Java");
        lessons.add("JDBC/ODBC");
        lessons.add("Miscellaneous");

        //this is made for adding sub topic for each lesson
        List<String> intro          = new ArrayList<>();
        List<String> operators      = new ArrayList<>();
        List<String> controlstmt    = new ArrayList<>();
        List<String> cls_obj        = new ArrayList<>();
        List<String> javaio_arrays  = new ArrayList<>();
        List<String> javastrings  = new ArrayList<>();
        List<String> inherit        = new ArrayList<>();
        List<String> abstr_inter    = new ArrayList<>();
        List<String> pkg_jar        = new ArrayList<>();
        List<String> exe_assert     = new ArrayList<>();
        List<String> fd_class       = new ArrayList<>();
        List<String> adv_class      = new ArrayList<>();
        List<String> serial_files   = new ArrayList<>();
        List<String> threads        = new ArrayList<>();
        List<String> num_formats    = new ArrayList<>();
        List<String> coll_generics  = new ArrayList<>();
        List<String> java_deploy    = new ArrayList<>();
        List<String> app_gui        = new ArrayList<>();
        List<String> swings         = new ArrayList<>();
        List<String> networking     = new ArrayList<>();
        List<String> jdbc           = new ArrayList<>();
        List<String> misc           = new ArrayList<>();

        //add each topic to lesson
        intro.add("History of Java");
        intro.add("Java Features");
        intro.add("Java Environment");
        intro.add("Java Runtime Environment");
        intro.add("Java Versions");
        intro.add("Writing Java Programs");
        intro.add("Understanding Java Programs");
        intro.add("Java Fundamentals");

        operators.add("Arithmetic Operators");
        operators.add("Relational Operators");
        operators.add("Logical Operators");
        operators.add("Bitwise Operators");
        operators.add("Type Conversion & Casting");
        operators.add("Summary");
        operators.add("CommandLine Arguments");
        operators.add("Programs");

        controlstmt.add("IF & IF-ELSE");
        controlstmt.add("While Loop");
        controlstmt.add("Do-While Loop");
        controlstmt.add("FOR Loop");
        controlstmt.add("FOR-Each Loop");
        controlstmt.add("break statement");
        controlstmt.add("continue statement");
        controlstmt.add("return statement");

        cls_obj.add("Objects & Classes");
        cls_obj.add("Programs");
        cls_obj.add("Access & Non-Access Specifiers");
        cls_obj.add("Variables");
        cls_obj.add("Method Overloading");
        cls_obj.add("Recursion");
        cls_obj.add("Constructors");
        cls_obj.add("Static Methods & Variables");
        cls_obj.add("Passing variables to Methods");
        cls_obj.add("Final Arguments");
        cls_obj.add("Var-args");

        javaio_arrays.add("Streams");
        javaio_arrays.add("InputStreamReader");
        javaio_arrays.add("BufferedReader");
        javaio_arrays.add("Programs");
        javaio_arrays.add("Types of Arrays");
        javaio_arrays.add("1D array");
        javaio_arrays.add("MultiDimentional Arrays");
        javaio_arrays.add("Variable size / Jagged Arrays");
        javaio_arrays.add("Arrays Class");

        javastrings.add("String Class");
        javastrings.add("String Methods");
        javastrings.add("StringBuffer Class");
        javastrings.add("StringBuilder Class");
        javastrings.add("StringBuffer Methods");
        javastrings.add("Chained Methods");

        inherit.add("Inheritance Intro");
        inherit.add("Types of Inheritance");
        inherit.add("Programs");
        inherit.add("IS-A & HAS-A Relation");
        inherit.add("Polymorphism");
        inherit.add("Static Polymorphism");
        inherit.add("Dynamic Polymorphism");
        inherit.add("OverLoading vs Overriding");
        inherit.add("Constructors in Super/SubClasses");
        inherit.add("Reference variable casting");

        abstr_inter.add("References: Data & mthds");
        abstr_inter.add("Abstract Classes");
        abstr_inter.add("Rules for Abstract cls & mthd");
        abstr_inter.add("Interfaces");
        abstr_inter.add("Rules for Interfaces");
        abstr_inter.add("Abstract class vs Interfaces");

        pkg_jar.add("Packages");
        pkg_jar.add("Rules for Packages");
        pkg_jar.add("Creating Packages");
        pkg_jar.add("Access Specifiers");
        pkg_jar.add("JARs");
        pkg_jar.add("Creating & Viewing JARs");
        pkg_jar.add("Using JARs");

        exe_assert.add("Types of Errors");
        exe_assert.add("Exception Handling");
        exe_assert.add("Checked/Unchecked Exceptions");
        exe_assert.add("Exception Class");
        exe_assert.add("Error Class");
        exe_assert.add("Try-Catch Block");
        exe_assert.add("Nested Try-Catch");
        exe_assert.add("Multiple Catch");
        exe_assert.add("finally Keyword");
        exe_assert.add("throw keyword");
        exe_assert.add("throws keyword");
        exe_assert.add("Assertions");
        exe_assert.add("Enabling/Disabling Assertions");
        exe_assert.add("Using Assertions");

        fd_class.add("Object Class");
        fd_class.add("Object Class Hierarchy");
        fd_class.add("Methods of Objec");
        fd_class.add("equals() Method");
        fd_class.add("hashCode() Method");
        fd_class.add("Garbage Collection");
        fd_class.add("Wrapper Classes");
        fd_class.add("Creating Wrapper Objects");
        fd_class.add("Constructors of Wrapper obj");
        fd_class.add("Methods of Wrapper classes");
        fd_class.add("Autoboxing & Unboxing");
        fd_class.add("Autoboxing with == & equals()");
        fd_class.add("Overloading with Widening,Autoboxing & Varargs");

        adv_class.add("Enumerator Methods");
        adv_class.add("Declaring enum");
        adv_class.add("Rules of Enumeration");
        adv_class.add("Member Inner Classes");
        adv_class.add("Local Inner Classes");
        adv_class.add("Anonymous Classes");
        adv_class.add("Static Nested Classes");

        serial_files.add("File Class");
        serial_files.add("File Class Constructors");
        serial_files.add("File Class Methods");
        serial_files.add("Readers & Writers");
        serial_files.add("Chaining of I/O classes");
        serial_files.add("Serialization");
        serial_files.add("De-Serialization");
        serial_files.add("Serializable interface");
        serial_files.add("Serialization steps");
        serial_files.add("Serialization & inheritance");

        threads.add("Introduction");
        threads.add("Application of Threads");
        threads.add("Constructors & methods");
        threads.add("States & Transitions");
        threads.add("Declaring & instantiating Threads");
        threads.add("Preventing thread execution");
        threads.add("Thread locks & Synchronization");
        threads.add("Race Condition");
        threads.add("Thread Deadlock");
        threads.add("Thread Interactions");

        num_formats.add("Introduction");
        num_formats.add("Locale Class, Constructors & Methods");
        num_formats.add("Number Format");
        num_formats.add("Date");
        num_formats.add("Date Format");
        num_formats.add("PrintWriter");
        num_formats.add("Console");
        num_formats.add("Tokenizer");

        coll_generics.add("Collections Framework");
        coll_generics.add("List");
        coll_generics.add("Generics");
        coll_generics.add("Sorting & Searching");
        coll_generics.add("Set");
        coll_generics.add("Map");
        coll_generics.add("Queue");

        java_deploy.add("Java Environment");
        java_deploy.add("Compiling with javac");
        java_deploy.add("Launching apps");
        java_deploy.add("-d option");
        java_deploy.add("-cp option");
        java_deploy.add("ClassPaths");
        java_deploy.add("System.Properties");
        java_deploy.add("Encapsulation, Coupling/Cohesion");

        app_gui.add("Frame Constructors");
        app_gui.add("Frame Methods");
        app_gui.add("WindowListener");
        app_gui.add("WindowAdapter");
        app_gui.add("Anonymous Class");
        app_gui.add("Drawing in frame");
        app_gui.add("Working with Colors");
        app_gui.add("Components");
        app_gui.add("Layout Managers");
        app_gui.add("FlowLayout");
        app_gui.add("BorderLayout");
        app_gui.add("GridLayout");
        app_gui.add("Event Delegation Model");

        swings.add("Drawbacks of AWT");
        swings.add("Swing Introduction");
        swings.add("JFrame Constructors & Methods");
        swings.add("Container Hierarchy");
        swings.add("JLable, JTextField & JButton");
        swings.add("Event Handling using Inner Classes");
        swings.add("Event Handling using Anonymous Classes");
        swings.add("Event Handling using ActionListner Classes");
        swings.add("JPasswordField");
        swings.add("Handling Keyboard Events");
        swings.add("Handling Window Events");
        swings.add("Handling Mouse Events");
        swings.add("JRadioButton, ButtonGroup & JOptionPane");
        swings.add("JCheckBox");
        swings.add("JTextArea, JScrollPane");
        swings.add("Font");
        swings.add("JMenuBar, JMenu & JMenuItem");


        networking.add("Network");
        networking.add("OSI & TCP/IP Architecture");
        networking.add("Socket");
        networking.add("Port Numbers");
        networking.add("Internet Addresses");
        networking.add("InetAddress");
        networking.add("TCP (Socket & ServerSocket)");
        networking.add("UDP (DatagramSocket & DatagramPacket");
        networking.add("URL");

        jdbc.add("JDBC");
        jdbc.add("JDBC Architecture");
        jdbc.add("JDBC Driver");
        jdbc.add("Steps for Creating DSN");
        jdbc.add("Steps for connecting Database");
        jdbc.add("Creating Table");
        jdbc.add("Inserting data in Table");
        jdbc.add("Selecting data from Table");
        jdbc.add("Updating data in Table");
        jdbc.add("Deleting data from Table");
        jdbc.add("Dropping Table");
        jdbc.add("JDBC Statements");
        jdbc.add("JDBC Transactions");

        misc.add("misc");


        topics.put(lessons.get(0),intro);
        topics.put(lessons.get(1),operators);
        topics.put(lessons.get(2),controlstmt);
        topics.put(lessons.get(3),cls_obj);
        topics.put(lessons.get(4),javaio_arrays);
        topics.put(lessons.get(5),javastrings);
        topics.put(lessons.get(6),inherit);
        topics.put(lessons.get(7),abstr_inter);
        topics.put(lessons.get(8),pkg_jar);
        topics.put(lessons.get(9),exe_assert);
        topics.put(lessons.get(10),fd_class);
        topics.put(lessons.get(11),adv_class);
        topics.put(lessons.get(12),serial_files);
        topics.put(lessons.get(13),threads);
        topics.put(lessons.get(14),num_formats);
        topics.put(lessons.get(15),coll_generics);
        topics.put(lessons.get(16),java_deploy);
        topics.put(lessons.get(17),app_gui);
        topics.put(lessons.get(18),swings);
        topics.put(lessons.get(19),networking);
        topics.put(lessons.get(20),jdbc);
        topics.put(lessons.get(21),misc);

    }


}
