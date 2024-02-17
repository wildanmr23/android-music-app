plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.musicapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.musicapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding = true
    }
}



dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation ("com.github.User:Repo:Tag")


    //Circle ImageView
    implementation ("de.hdodenhof:circleimageview:3.1.0")

    //Anko
//    implementation 'org.jetbrains.anko:anko-commons:0.10.8'

    //Glide
    implementation ("com.github.bumptech.glide:glide:4.12.0")

    //Gson
    implementation ("com.google.code.gson:gson:2.10")

    //Firebase Database
    implementation ("com.google.firebase:firebase-database:20.3.0")

    //Firebase Storage
    implementation ("com.google.firebase:firebase-storage:20.3.0")

    //Firebase Auth
    implementation ("com.google.firebase:firebase-auth:22.3.1")

    implementation ("com.ismaeldivita.chipnavigation:chip-navigation-bar:1.3.2")
    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.9.22")
}