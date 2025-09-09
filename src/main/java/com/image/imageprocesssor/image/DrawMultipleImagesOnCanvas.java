package com.image.imageprocesssor.image;

import javafx.scene.canvas.GraphicsContext;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class DrawMultipleImagesOnCanvas {
    private static  DrawMultipleImagesOnCanvas sample;

    //for taking imnput image multiple parts at a time
    private Queue<ImageData>  store  =  new LinkedBlockingQueue<>();
    private GraphicsContext gc;
    private boolean isdrawing=false;

    public static DrawMultipleImagesOnCanvas getinstance() {
        if(sample == null) {
            return new DrawMultipleImagesOnCanvas();
        }
        return sample;
    }

}
