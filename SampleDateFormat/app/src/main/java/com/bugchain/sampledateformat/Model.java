package com.bugchain.sampledateformat;

import android.content.Context;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by POSEIDON on 23/9/2558.
 */
public class Model implements Serializable{

    private String letter;
    private String component;
    private String presentation;
    private String example;

    private void setLetter(String letter){
        this.letter = letter;
    }
    public String getLetter(){
        return letter;
    }
    private void setComponent(String component){
        this.component = component;
    }
    public String getComponent(){
        return component;
    }
    private void setPresentation(String presentation){
        this.presentation = presentation;
    }
    public String getPresentation(){
        return presentation;
    }
    private void setExample(String example){
        this.example = example;
    }
    public String getExample(){
        return example;
    }

    private Model set(String letter,String component,String presentation,String example){
        Model model = new Model();
        model.setLetter(letter);
        model.setComponent(component);
        model.setPresentation(presentation);
        model.setExample(example);
        return model;
    }

    public List<Model> setup(Context context){
        List<Model> list = new ArrayList<>();
        String[] letter = context.getResources().getStringArray(R.array.letter_items);
        String[] component = context.getResources().getStringArray(R.array.component_items);
        String[] presentation = context.getResources().getStringArray(R.array.presentation_items);
        String[] example = context.getResources().getStringArray(R.array.example_items);

        int size = letter.length;
        for (int i=0;i<size;i++){
            list.add(set(
                    letter[i],component[i],presentation[i],example[i]
            ));
        }
        return list;
    }
}
