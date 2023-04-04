package me.hiyjeain.rust.demo

/**
 * Created on 2023/4/4
 * @author Garrett Xu (hiyjeain@hotmail.com) of YILU Tech Studio (yilu_tech@outlook.com)
 */
class RustGreetings {
    init {
        System.loadLibrary("rust_ndk_demo")
    }

    external fun greeting(from: String): String
}