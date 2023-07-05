<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".QuizQuestions">


    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        >
        <TextView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:padding="20dp"
            android:text="What country is this?"
            android:textSize="25dp"
            android:gravity="center"

            />


        <ImageView
            android:id="@+id/image"
            android:scaleType="fitXY"
            android:layout_width="wrap_content"
            android:layout_height="500dp"
            android:layout_marginRight="10dp"
            android:layout_marginLeft="10dp"
             />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">


            <TextView
                android:id="@+id/tv_progress"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:gravity="right"
                android:text="1/10"

                />

            <ProgressBar
                android:id="@+id/progressBar4"
                style="?android:attr/progressBarStyleHorizontal"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:layout_marginTop="20dp"
                android:progress="1"
                />
        </LinearLayout>

        <TextView
            android:background="@color/grey"
            android:id="@+id/option1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="20dp"
            android:gravity="center"
            android:padding="15dp"
            />

        <TextView
            android:background="@color/grey"
            android:id="@+id/option2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:padding="15dp"
            android:gravity="center"
            android:layout_marginTop="20dp"
            />

        <TextView
            android:background="@color/grey"
            android:id="@+id/option3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="20dp"
            android:padding="15dp"
            android:gravity="center"
            />

        <Button
            android:id="@+id/answer"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:layout_margin="15dp"
            android:gravity="center"
            android:onClick="onClick"
            android:padding="15dp"
            android:text="Check">


        </Button>
    </LinearLayout>

</ScrollView>

