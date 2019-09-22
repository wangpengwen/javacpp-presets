// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer_plugin;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;

import static org.bytedeco.tensorrt.global.nvinfer_plugin.*;
 // softmax tree

@Namespace("nvinfer1::plugin") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer_plugin.class)
public class RegionParameters extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RegionParameters() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RegionParameters(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RegionParameters(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RegionParameters position(long position) {
        return (RegionParameters)super.position(position);
    }

    public native int num(); public native RegionParameters num(int setter);
    public native int coords(); public native RegionParameters coords(int setter);
    public native int classes(); public native RegionParameters classes(int setter);
    public native softmaxTree smTree(); public native RegionParameters smTree(softmaxTree setter);
}
