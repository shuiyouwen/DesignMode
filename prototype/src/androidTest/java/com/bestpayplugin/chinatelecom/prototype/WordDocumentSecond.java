package com.bestpayplugin.chinatelecom.prototype;

import android.util.Log;

import java.util.ArrayList;

/**
 * 深拷贝
 * Created by Administrator on 2016/2/6.
 */
public class WordDocumentSecond implements Cloneable {
    private String mText;
    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocumentSecond() {
        Log.i("TAG", "WordDocumentSecondSecond的构造方法");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            WordDocumentSecond wordDocumentSecond = (WordDocumentSecond) super.clone();
            wordDocumentSecond.mText = this.mText;
            wordDocumentSecond.mImages = (ArrayList<String>) this.mImages.clone();
            return wordDocumentSecond;
        } catch (Exception e) {
            return null;
        }
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public void setmImages(ArrayList<String> mImages) {
        this.mImages = mImages;
    }

    public void showDocument() {
        StringBuilder sb = new StringBuilder();
        sb.append("text:").append(mText).append("imageList:");
        for (String image : mImages) {
            sb.append(image).append(",");
        }
        Log.i("TAG", sb.toString());
    }
}
