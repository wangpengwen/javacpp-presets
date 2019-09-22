// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class PluginField
 * 
 *  \brief Structure containing plugin attribute field names and associated data
 *  This information can be parsed to decode necessary plugin metadata
 * 
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class PluginField extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PluginField(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PluginField(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public PluginField position(long position) {
        return (PluginField)super.position(position);
    }

    /**
     *  \brief Plugin field attribute name
     *  */
    
    //!
    //!
    public native String name(); public native PluginField name(String setter);
    /**
     *  \brief Plugin field attribute data
     *  */
    
    //!
    //!
    public native @Const Pointer data(); public native PluginField data(Pointer setter);
    /**
     *  \brief Plugin field attribute type
     *  @see PluginFieldType
     *  */
    
    //!
    //!
    public native PluginFieldType type(); public native PluginField type(PluginFieldType setter);
    /**
     *  \brief Number of data entries in the Plugin attribute
     *  */
    public native int length(); public native PluginField length(int setter);

    public PluginField(String name_/*=nullptr*/, @Const Pointer data_/*=nullptr*/, PluginFieldType type_/*=nvinfer1::PluginFieldType::kUNKNOWN*/, int length_/*=0*/) { super((Pointer)null); allocate(name_, data_, type_, length_); }
    private native void allocate(String name_/*=nullptr*/, @Const Pointer data_/*=nullptr*/, PluginFieldType type_/*=nvinfer1::PluginFieldType::kUNKNOWN*/, int length_/*=0*/);
    public PluginField() { super((Pointer)null); allocate(); }
    private native void allocate();
    public PluginField(@Cast("const char*") BytePointer name_/*=nullptr*/, @Const Pointer data_/*=nullptr*/, @Cast("nvinfer1::PluginFieldType") int type_/*=nvinfer1::PluginFieldType::kUNKNOWN*/, int length_/*=0*/) { super((Pointer)null); allocate(name_, data_, type_, length_); }
    private native void allocate(@Cast("const char*") BytePointer name_/*=nullptr*/, @Const Pointer data_/*=nullptr*/, @Cast("nvinfer1::PluginFieldType") int type_/*=nvinfer1::PluginFieldType::kUNKNOWN*/, int length_/*=0*/);
}
