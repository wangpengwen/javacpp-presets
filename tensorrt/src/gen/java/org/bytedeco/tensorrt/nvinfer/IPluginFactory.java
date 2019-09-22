// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IPluginFactory
 * 
 *  \brief Plugin factory for deserialization.
 * 
 *  This Interface is guaranteed not to change for the same major version of TensorRT. */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IPluginFactory extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IPluginFactory(Pointer p) { super(p); }

    /**
     *  \brief Create a plugin from serialized data.
     * 
     *  Responsibility of destroying this plugin lies with the application.
     *  It can be done anytime after consumers of this plugin are destroyed.
     * 
     *  @param layerName The name of the layer.
     *  @param serialData The serialized data.
     *  @param serialLength The length of the serialized data.
     * 
     *  @return The plugin.
     * 
     *  @see IPlugin::serialize()
     *  */
    public native IPlugin createPlugin(String layerName, @Const Pointer serialData, @Cast("size_t") long serialLength);
    public native IPlugin createPlugin(@Cast("const char*") BytePointer layerName, @Const Pointer serialData, @Cast("size_t") long serialLength);
}
