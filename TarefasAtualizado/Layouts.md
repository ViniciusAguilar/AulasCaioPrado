## Item_task.xml
```
<?xml version="1.0" encoding="utf-8"?>
<com.google.android.material.card.MaterialCardView
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_margin="8dp"
    app:cardCornerRadius="10dp"
    app:cardElevation="4dp">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:padding="16dp"
        android:gravity="center_vertical">

        <LinearLayout
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:orientation="vertical">

            <TextView
                android:id="@+id/textTitle"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:textSize="16sp"
                android:textStyle="bold"/>

            <TextView
                android:id="@+id/textPriority"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:textSize="13sp"
                android:layout_marginTop="4dp"/>

        </LinearLayout>

        <Button
            android:id="@+id/btnDelete"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Excluir"
            style="@style/Widget.Material3.Button.TextButton"/>

    </LinearLayout>

</com.google.android.material.card.MaterialCardView>
````

---

## Fragment_list
```

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="8dp">

    <TextView
        android:id="@+id/textEmpty"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Nenhuma tarefa ainda!"
        android:textSize="16sp"
        android:textAlignment="center"
        android:padding="24dp"
        android:visibility="gone"/>

    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/recycler"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>

</LinearLayout>
```
---

## Fragment add

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="24dp">

    <EditText
        android:id="@+id/editTitle"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Nome da tarefa"
        android:inputType="text"/>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Prioridade:"
        android:layout_marginTop="16dp"/>

    <RadioGroup
        android:id="@+id/radioGroup"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <RadioButton android:id="@+id/radioAlta"  android:text="Alta"  android:layout_weight="1" android:layout_width="0dp" android:layout_height="wrap_content"/>
        <RadioButton android:id="@+id/radioMedia" android:text="Média" android:layout_weight="1" android:layout_width="0dp" android:layout_height="wrap_content" android:checked="true"/>
        <RadioButton android:id="@+id/radioBaixa" android:text="Baixa" android:layout_weight="1" android:layout_width="0dp" android:layout_height="wrap_content"/>

    </RadioGroup>

    <Button
        android:id="@+id/btnSave"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:text="Salvar"/>

</LinearLayout>
```
---

## activity_main

```

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <FrameLayout
        android:id="@+id/container"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"/>

    <com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/bottomNav"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:menu="@menu/bottom_nav_menu"/>

</LinearLayout>
```
---

