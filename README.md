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
  2.1. Normal Border (adjusting your own color)
      ```
      <?xml version="1.0" encoding="utf-8"?>
      <shape xmlns:android="http://schemas.android.com/apk/res/android">
          <stroke android:color="#acacac" android:width="1dp"/>
          <corners android:radius="3dp" />
      </shape>
      ```
  2.2. Focus Border (adjusting your own color)
        ```
      <?xml version="1.0" encoding="utf-8"?>
      <shape xmlns:android="http://schemas.android.com/apk/res/android">
          <stroke android:color="#3F51B5" android:width="1dp"/>
          <corners android:radius="3dp" />
      </shape>  
      ```
  3. want your icon change when EditTextIconLeft is focusing ??
  ![alt text](https://github.com/ChanphengHor/EditTextIconLeft/blob/master/screens/user_empty.png) ![alt text](https://github.com/ChanphengHor/EditTextIconLeft/blob/master/screens/user_empty_focus.png)
  
### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone who's code was used
* Inspiration
* etc

