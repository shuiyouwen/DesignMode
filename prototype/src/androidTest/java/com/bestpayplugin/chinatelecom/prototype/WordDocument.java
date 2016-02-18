package com.bestpayplugin.chinatelecom.prototype;

import android.util.Log;

import java.util.ArrayList;

/**
 * 浅拷贝
 * Created by Administrator on 2016/2/6.
 */
public class WordDocument implements Cloneable {
    private String mText;
    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocument() {
        Log.i("TAG", "WordDocument的构造方法");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            WordDocument wordDocument = (WordDocument) super.clone();
            wordDocument.mText = this.mText;
            wordDocument.mImages = this.mImages;
            return wordDocument;
        } catch (Exception e) {
            return null;
        }
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public void setImages(ArrayList<String> mImages) {
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
