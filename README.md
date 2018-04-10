# EditText has Icon Left

This EditText is for android Developer which is easier for them to make an EditText View that has an Icon Left also can make focusable border and that icon .

## Demo
![alt text](https://github.com/ChanphengHor/EditTextIconLeft/blob/master/screens/screen1.gif)
### Dependency



```
Give examples
```

### How to add to your project

Add the jitpack maven repository

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

And Add the dependency

```
dependencies {
	        compile 'com.github.ChanphengHor:EditTextIconLeft:0.1.0'
	}
```

## How to use

1.Using in you xml Layout 

```
	<chanphenghor.com.library.EditTextIconLeft
		android:id="@+id/edittexticonleft"
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:layout_marginBottom="10dp"
		app:hint="Default"  // do not use "android:hint" just use this
		app:height="50dp"   // use "app:height" to adjust layout size
		/>
```
2.Creating border for EditTextIconLeft

 * *Normal Border (adjusting your own color)*.
  	```
      <?xml version="1.0" encoding="utf-8"?>
      <shape xmlns:android="http://schemas.android.com/apk/res/android">
          <stroke android:color="#acacac" android:width="1dp"/>
          <corners android:radius="3dp" />
      </shape>
      ```
      
AND
* *Focus Border (adjusting your own color)*.

	```
      <?xml version="1.0" encoding="utf-8"?>
      <shape xmlns:android="http://schemas.android.com/apk/res/android">
          <stroke android:color="#3F51B5" android:width="1dp"/>
          <corners android:radius="3dp" />
      </shape>
      ```
      
 3. want to change icon whenever EditTextIconLeft is focusing ??
  
  ![alt text](https://github.com/ChanphengHor/EditTextIconLeft/blob/master/screens/user_empty.png) ![alt text](https://github.com/ChanphengHor/EditTextIconLeft/blob/master/screens/user_empty_focus.png)
  
### Coding

Explain what these tests test and why

```
	EditTextIconLeft editTextIconLeft1;
	editTextIconLeft1 = findViewById(R.id.editTextIconLeft1);
```

### Set Border and Focus Border

This method has 4 parametter 

```
	editTextIconLeft1.setBorderFocus(
			R.drawable.border_gray,
			R.drawable.border_focus,
			R.drawable.user_empty,
			R.drawable.user_empty_focus);
```

## Enable & Disable

```
	editTextIconLeft1.setEnabled(false);
	editTextIconLeft1.setEnabled(true);

```

## Direct Accessing to ImageView and EditText in EditTextIconLeft with

```
	editTextIconLeft1.editText().requestFocus();
        editTextIconLeft1.iconLeft().setVisibility(View.GONE);

```

## simply getText from EditTextIconLeft

```
	editTextIconLeft1.editText().toString();

```
## Versioning

I am testing how to costomize with Views and Deploying to github

## Authors

Hor Chanpheng 
fb: Chanpheng Hor


