package com.bestpayplugin.chinatelecom.prototype;

import android.util.Log;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/2/6.
 */
public class Test extends TestCase {
    public void test() throws CloneNotSupportedException {
        WordDocument wordDocument = new WordDocument();
        wordDocument.setText("随意的一些文字");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String str = "图片" + i;
            list.add(str);
        }
        wordDocument.setImages(list);

        Log.i("TAG", "原型------------------------------");
        wordDocument.showDocument();

        Log.i("TAG", "克隆------------------------------");
        WordDocument clone = (WordDocument) wordDocument.clone();
        clone.showDocument();

        clone.setText("修改一下而已");
        ArrayList<String> cloneList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String str = "克隆图片" + i;
            cloneList.add(str);
        }
        clone.setImages(cloneList);
        Log.i("TAG", "克隆修改后，克隆信息------------------------------");

        clone.showDocument();
        Log.i("TAG", "克隆修改后，原型信息------------------------------");
        wordDocument.showDocument();
    }
}
